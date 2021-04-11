import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class MyMatcher {

    private enum MatcherState {
        END_TRUE, END_FALSE, INDEFINITE, RUNNING
    }

    private static class MatchRunnable implements Runnable {

        String text, regex;
        MatcherState state;

        MatchRunnable(String text, String regex) {
            this.text = text;
            this.regex = regex;
            state = MatcherState.INDEFINITE;
        }

        private MatcherState getState() {
            return state;
        }

        @Override
        public void run() {
            try {
                state = MatcherState.RUNNING;
                Matcher matcher = Pattern.compile(regex).matcher(text);

                if (!Thread.currentThread().isInterrupted()) {
                    if (matcher.matches()) {
                        state = MatcherState.END_TRUE;
                    } else {
                        state = MatcherState.END_FALSE;
                    }
                }
            } catch (PatternSyntaxException err) {
                System.out.printf("Regex is invalid: %s\n", err.getMessage());
                state = MatcherState.END_FALSE;
            } catch (StackOverflowError err) {
                System.out.printf("Error: %s\n", err.getClass());
                state = MatcherState.END_FALSE;
            }
        }
    }


    public boolean matches(String text, String regex, long timeout) {
        MatchRunnable runnable = new MatchRunnable(text, regex);
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        switch (runnable.getState()) {
            case END_TRUE:
                return true;
            case RUNNING:
                System.out.println("Error: matches() running for a long time.");
            case END_FALSE:
            default:
                return false;
        }
    }

    public boolean matches(String text, String regex) {
        return matches(text, regex, 1000);
    }
}
