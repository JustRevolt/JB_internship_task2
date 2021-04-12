public class Main {

    private static volatile boolean res;

    public static void main(String[] args) {

        MyMatcher myMatcher = new MyMatcher();

//        System.out.println(myMatcher.matches("text", "[o-}*"));
//        System.out.println(myMatcher.matches("text", "^t.*"));

        String st120 = "accccccbbaaccbbbbaacbaccbacbbbaacbbbbacbaccbbabaaaaccccbbaccccccccccbcbaaacccccbaaaccbacbaaacbcbaccccbabacccbcbbbaccbbcc";
        String st3000 = "acccbbbcccbaabaaabacbaabaacccccccbaabbacbbbbaaccbbaaacccccbbbabacbaaaababbaccccccbcbbbbaaccccccbaaacbacbbbbaccbcbbbbcccbcbbbbaccbbbacccbbbaaaccccbaccbbbaccbbaccbcbabbbabb" +
                "aaccccccbbaccccccbbbcbacccbbbbaccbacbabbbaccbcbacccccbbbbaabaacbbaccccbabbbacccbbbbbacbacbbbaaccccbbacbbabaccbcbbaccccbbaccbaabbaccccbbaaccbaabaacbcbcbbbaaaaaabaccbbcbbac" +
                "bacbbbaccbccbaaccccbababacccbaccbbbbaccbacbacbbcbbcbcbbcbbaaaccccbaaccccbcbbacbaaaacbacccbacbbbbaacccccccccbbaccbbbaaaccbccbbcbbbcbacbbacbbcbccbaccbaaaccbbbbababbbaacbbba" +
                "abaaccbccbaacccccbababacccbbbabaaccbbbbbacbbbbbaaccbcbaaccbbaccbbcbbabbacbabacbbaaacccccbccbcbaacccccbbbacccbbaccccccbbacccbbaaccccbccbccbbaccbcbcbaaccbbbbbbaaccbbabbbbaa" +
                "ccccbacbbbababaccbbcbaccbbbbbaccbbbaaccbabbacbbaccbbacbaccbabaacbacccccccbcbbccbcccbacbaacbaabbaaaaaaaccccbacbacccbbbbbaccccbbbaccbcccbbbacbaaaccbbbbbbbaacccbacbbaacccccc" +
                "bcbbacbbcccbaababbbabababacbbabbbbacbbbbbaabaaabacbbacccbacccbcbbaccbbaacbacbbbbaaaccccbcccccbbabacccccbcbbaccccccbbbbababbbaaccccccccbbbaaacbabaccccccbbacccbbcccbbaababa" +
                "cccbaccccccccbacccbaaccbabacccbbbbbbbbbbaacccbbacbaccbbbbbbaccbcbbbaabacbbaccbbacbbaaaaacccbbbacbabaaccbabacccbbaaabaaacccbababaacbaabbacbbacbaccbcbabacccccbaccccbaaccbac" +
                "cccbbbabacbabaaccccccccccbbacccccbbbbabbbaccbbacbbbaccbbbabaaaccbbbbacccbabbacbbbbbbacbbcbbaaaccbacbcccbbbacbbaacbbbbbbbabacccbabaaacbaaaaaacccbbacbacccbbbacbaccccbaccbcb" +
                "bbbaccccccbbacbabbaccccbaccccbbabbaaaccbacbbbaabbaaabaacccccbbaacccbcbbbbacbbacbbaccbbbbacbbbbcbbacbcbbabacccbbacbaaccccbbaaccccccbbbaacbcbaccbaaabaaccbcccccbabbbacccbbbb" +
                "aacbcbbacbbaabbaccbabbacbbabbacbbaacccccccbbbbbbaabbbabbbaccbabbacccccbabbaccbacbbbacccbacbbbbbaacccbbbbabbbaaccbbaacccbbabbacccbbaccccbaaccbbabbabbacbbbacccbccbbcbbbaaab" +
                "bbacccbbaaccbbaaacccbbbcbacccbbbbcccccbacccbcbbbaaaaccccbcbbbbaccbbababaabacccbbbaccbaaaaaaaaaccbbbacbcbaccccbbbccbbbacbccbbaccbabbbbaaccbccbcccbbbaccbbacbbcbacbabaccbbab" +
                "bbbbbbaccbcbacccbbbaccbabaacbcbbaacccccbcbaaacbbaccbaccbbaaccbbacccbbbaccccbabaccccbaaccbaccbbacccbbbaaacbabbbacccccbbbaccbbbbbabbbacccccbbbacbbbcbbaccbbbacccccbbcbabacbb" +
                "ccbaccbbbbacbabaccbaccbcbaaaccbccccbbbbaccccbaccccccbbaccbbbbbacccbbbbacccbbbbabbbbaccbbaccccbabacccbaaacccccbaaaacbcbbbaaccbaacbbacccbbaaccccbaaccccbaccccbbaccccccbacbba" +
                "acbbaccbbbbaabbaaaaaabbaaaabbbbaccbccccbbcbabaaacbccbbbcbacccbbbbaccccccccbbbbbbaccbabbbacbbbbacbbcbaaaabaacccbaccccccccccbbacccbbacbabbaccccbaccbbcbccbbbacccbaaacccccbbc" +
                "babbaabacbaacbbacbccbcbaacbbacbcbbbacbaabaccbbbcbaaabaacbbacbbbbbacccbbbbacbaaccbbbcbbabacccccbbaacbbbaacccbbbacccccccccccbbbaaccbaccbbbaabbbaabaccbbabbacbcbbbacbbaaabbaa" +
                "abaacccccbcbcbcbbbbbbbbbbbbabaacccccccbcbcbbabaacbbcbccbcbbaaccbaccbbaaccbbbaccbbbbaaacccccccbccbcbaccbbbbaccbbbbbcbaccbacccbbbaccbbaccbbbbbacbaccbacbaabaaabaccbbacccccba" +
                "baccbbaacbcbacbbacccccbbabbaacbccbcccccccbabaacbaacccbbacbcbbacbbaacccbcccbcbbbbaabbbaccbccbbcbbcbabacbbbaacccccbbbaccbccbbbaccbcbcbbacbabacccbababacbcccbcbcccbaccccccbcc" +
                "bbbaaccbcbcbacbacccbbbaacbbcbbbacbbccbbbbbbaaaacccccbaaaacccccbabaaacbcccbbbbbacbbbabaccccccbbaccbbacbbbcccbbccbbaccbc";

        String str7000 = "aacccbbaabaccbcbbcbaccbacbbaacccccccbabbbacccccccbbaabaaabacbbaabaccbbbacccbacccccbaccccbbababbaaabbbacbbbccbcbbcbacbacbbacccbccbacccbabbaccbabaaacbaaacccbbaccccbaaabbabb" +
                "baaacccbbbbacccbacccccbbaccbcbbbacccbababacccbacbbaacccbbaaaaccbbbacccbacccccbcbbaaccccbbabbbaccccccccbcbccccccbcbaccbabacbbbaabaccbcbaccbbcbbbacccbbaaccbbbaaacbabbabbbac" +
                "cbbbacccbbaccbabacbbbbabaaccccbaacccbbbcbcbaacbbacbacccccccccbbbaccbbababaaacbbaabaccccbcbbbbacbbaaccbacbbbacbaaacbaccbabbaaacccbbbbabbaccbbaaaccbaaabacccbcccbcbccbcbaaba" +
                "babbbaaacbaacccbacbacbaccbbbacccbcbcbabacccbbbbacccbacbaaabaaaaaacbacbabaccbaacbabbbaaacccbbacccccbacbbacccccbbbaaccbaaaaccccccbbaccccccbbbabaccbbcbbbaacccbbbbaacbbabaccc" +
                "babaacbbababaccbbacccbbaabbaaccccbbabaccbbaaccbabbbaccccccbbbacbbcbbbacbabbacccbbcbbbbbbbbaccbbaacccbaaacccccbbbbbbababbbacbacbbbabacbaaccbbaacbbbcbbaaccbbbbaabbbacccbbaa" +
                "cccbcbababbaccccbaaabaabaaaacbbacccbbcbccbbacccbbaaaccbbbacbbcbbbbacccccbbaccbbbaccbcbbabbaccbbbaccbbaccccbbaacbbbaaaccccccbbcbacbbccbbcbacbcbccccbbabaccccccbacbcbaaccbbb" +
                "bbbbacbaccbaacccbaaccbcbbbbbacbbbacccccbaababaaabacbacbbaccbccbcbbbaaacbabaaccccbabbabaacccbbaacbbbaaaacbabbabaccbbcccbcbbbbbcbaccbaaccbbacbbbbacbbbbaacccbaccbcbbaccccccc" +
                "bacccbbaacccccbaccccccbbbaabaccbcbacbbbaabacccbaaccccbbaacbababbbacccbaaaacccccbbbbaccbbbacbcbacccbabaaccbbbabaaccccbbbbbacbbbbcbbaabaaccccbaccbbbaababaaaccccbaaccbaccccb" +
                "acbbbbcbaacccbbbabaacbbbaccccccccccbbabaccbbbbaaaccbbaccbacccccbbaaacbbaacccbaccbcbccbbaaabaabbaccccbccccbaacbabbabacbbbacccbaccbaccbabaaccccccbbacccbbbcbbaccbbbbbaaaccbb" +
                "bbbaccbaccbacbbbacccbaacccccbbbbaccbbaaccccbbaccccccbcbcbbacccbaacbbaaccbbbbacccbbbbbbbacbaaaaabaabaccbaaccccccccbbbaabbaacbaaaaaccbacccbbbacbacbaababaaaccbbccbacccccbbac" +
                "ccbbbbbcbaacbabababaccccbacccbbacccbacccccbbaacccbaccccccbbaaccbbaaccbbaaccbacccbacbaacccbaaccbbacbbaccccbbbbaacbabaccbbcbbaaccccccccbbaaccbbbbbaccbcbbacbbccbbcccbaccccba" +
                "bbaacccbccbbbaccccccbbacbacbacbbaacbbbbaaaccccbcbabaccccccbacccbbcbcbbbacccbbacccbacbcbbabacccbaaaaacccbbaabacccbbbbacbbacbabacbacbbbbaccbbccbbabacbaaccbcbabbaccbaccbbbbb" +
                "bbaccccbbbaccbccbacccbcbcbbbbaabaccccccbaaaaccccbbbbbacbbbabbacccccbaabbbaacbbacbaacbaaccbaabacbbcccccccbaccbbacccbbaaccccbacbbabaccbbcbbbacbacbbbbbbbbaccbbbbacbbbcbbabab" +
                "abbbacbaccbacccccccccbacccccbaccbbaacccbbbbaabbbbaccccbaaccbbaccbcbabbaacccbaacccccbbbaacccccbabaacbaaaccccccbccccccccbcbcbbacccbacccbbbbacccbbaaacbcbbbaaaccbacbaccccccbc" +
                "bacbccbbbacbbbbcbcbababaccccbbbbaaacbcbaacbbbaccbaccbbacbbbbaccbcbaabbacccbbaacccbbbaaacbcccccbaccbbaccbbbaccbbaaacccbbbabbacccbcbaaccbcbccbabbaacccccccbbbbababacccccbacc" +
                "baaaaccbccbaccbbbbabbacccccbbaacccbacccccbcbbaaabbaccbaccbbaaacbbaaaccccccbbccbbbacbacccbbccbbabaccccbbbaacbbbacbbcbbaccbbabaaaabbaacccbaacccbcbaaccbcbaacccbbbacbcbaaaabb" +
                "accccccccbabbaabaacbacbbbaccccbabaaaccbaccbacccccbbaacbaabaccccccbababaccbaacccccccbaacbbaccbacbacbbbbbbbacbbbbbaccbbacbbbccbaaacbbabaccccccbbabaccbbacccbaaaccbbbaccbabaa" +
                "cbcbbbbabaaccbaaccccbaacccbccbbbbbaaccbaccccbaccccbbabbaccccbbacbbcbbaaabbacbbaabbaccbababaabbbaacbabacbcccbccccccbbbbbabaccccccbaaabaaccbacccbacccbbbbbbacbaaaaaccccccbaa" +
                "cccccbacccbaaaaccbbbbabaccbbacccbaacccbbaabaccbcbbcbaccbacbbaacccccccbabbbacccccccbbaabaaabacbbaabaccbbbacccbacccccbaccccbbababbaaabbbacbbbccbcbbcbacbacbbacccbccbacccbabbaccbabaaacbaaacccbbaccccbaaabbabb" +
                "baaacccbbbbacccbacccccbbaccbcbbbacccbababacccbacbbaacccbbaaaaccbbbacccbacccccbcbbaaccccbbabbbaccccccccbcbccccccbcbaccbabacbbbaabaccbcbaccbbcbbbacccbbaaccbbbaaacbabbabbbac" +
                "cbbbacccbbaccbabacbbbbabaaccccbaacccbbbcbcbaacbbacbacccccccccbbbaccbbababaaacbbaabaccccbcbbbbacbbaaccbacbbbacbaaacbaccbabbaaacccbbbbabbaccbbaaaccbaaabacccbcccbcbccbcbaaba" +
                "babbbaaacbaacccbacbacbaccbbbacccbcbcbabacccbbbbacccbacbaaabaaaaaacbacbabaccbaacbabbbaaacccbbacccccbacbbacccccbbbaaccbaaaaccccccbbaccccccbbbabaccbbcbbbaacccbbbbaacbbabaccc" +
                "babaacbbababaccbbacccbbaabbaaccccbbabaccbbaaccbabbbaccccccbbbacbbcbbbacbabbacccbbcbbbbbbbbaccbbaacccbaaacccccbbbbbbababbbacbacbbbabacbaaccbbaacbbbcbbaaccbbbbaabbbacccbbaa" +
                "cccbcbababbaccccbaaabaabaaaacbbacccbbcbccbbacccbbaaaccbbbacbbcbbbbacccccbbaccbbbaccbcbbabbaccbbbaccbbaccccbbaacbbbaaaccccccbbcbacbbccbbcbacbcbccccbbabaccccccbacbcbaaccbbb" +
                "bbbbacbaccbaacccbaaccbcbbbbbacbbbacccccbaababaaabacbacbbaccbccbcbbbaaacbabaaccccbabbabaacccbbaacbbbaaaacbabbabaccbbcccbcbbbbbcbaccbaaccbbacbbbbacbbbbaacccbaccbcbbaccccccc" +
                "bacccbbaacccccbaccccccbbbaabaccbcbacbbbaabacccbaaccccbbaacbababbbacccbaaaacccccbbbbaccbbbacbcbacccbabaaccbbbabaaccccbbbbbacbbbbcbbaabaaccccbaccbbbaababaaaccccbaaccbaccccb" +
                "acbbbbcbaacccbbbabaacbbbaccccccccccbbabaccbbbbaaaccbbaccbacccccbbaaacbbaacccbaccbcbccbbaaabaabbaccccbccccbaacbabbabacbbbacccbaccbaccbabaaccccccbbacccbbbcbbaccbbbbbaaaccbb" +
                "bbbaccbaccbacbbbacccbaacccccbbbbaccbbaaccccbbaccccccbcbcbbacccbaacbbaaccbbbbacccbbbbbbbacbaaaaabaabaccbaaccccccccbbbaabbaacbaaaaaccbacccbbbacbacbaababaaaccbbccbacccccbbac" +
                "ccbbbbbcbaacbabababaccccbacccbbacccbacccccbbaacccbaccccccbbaaccbbaaccbbaaccbacccbacbaacccbaaccbbacbbaccccbbbbaacbabaccbbcbbaaccccccccbbaaccbbbbbaccbcbbacbbccbbcccbaccccba" +
                "bbaacccbccbbbaccccccbbacbacbacbbaacbbbbaaaccccbcbabaccccccbacccbbcbcbbbacccbbacccbacbcbbabacccbaaaaacccbbaabacccbbbbacbbacbabacbacbbbbaccbbccbbabacbaaccbcbabbaccbaccbbbbb" +
                "bbaccccbbbaccbccbacccbcbcbbbbaabaccccccbaaaaccccbbbbbacbbbabbacccccbaabbbaacbbacbaacbaaccbaabacbbcccccccbaccbbacccbbaaccccbacbbabaccbbcbbbacbacbbbbbbbbaccbbbbacbbbcbbabab" +
                "abbbacbaccbacccccccccbacccccbaccbbaacccbbbbaabbbbaccccbaaccbbaccbcbabbaacccbaacccccbbbaacccccbabaacbaaaccccccbccccccccbcbcbbacccbacccbbbbacccbbaaacbcbbbaaaccbacbaccccccbc" +
                "bacbccbbbacbbbbcbcbababaccccbbbbaaacbcbaacbbbaccbaccbbacbbbbaccbcbaabbacccbbaacccbbbaaacbcccccbaccbbaccbbbaccbbaaacccbbbabbacccbcbaaccbcbccbabbaacccccccbbbbababacccccbacc" +
                "baaaaccbccbaccbbbbabbacccccbbaacccbacccccbcbbaaabbaccbaccbbaaacbbaaaccccccbbccbbbacbacccbbccbbabaccccbbbaacbbbacbbcbbaccbbabaaaabbaacccbaacccbcbaaccbcbaacccbbbacbcbaaaabb" +
                "accccccccbabbaabaacbacbbbaccccbabaaaccbaccbacccccbbaacbaabaccccccbababaccbaacccccccbaacbbaccbacbacbbbbbbbacbbbbbaccbbacbbbccbaaacbbabaccccccbbabaccbbacccbaaaccbbbaccbabaa" +
                "cbcbbbbabaaccbaaccccbaacccbccbbbbbaaccbaccccbaccccbbabbaccccbbacbbcbbaaabbacbbaabbaccbababaabbbaacbabacbcccbccccccbbbbbabaccccccbaaabaaccbacccbacccbbbbbbacbaaaaaccccccbaa" +
                "cccccbacccbaaaaccbbbbabaccbbacccb";

//        System.out.println(myMatcher.matches(st3000, "((a|b)*ac+((b|c)*|b))+"));
//        for (int i = 20000000; i < 2000000000; i=i+1000000) {
//            System.out.println(i);
//            System.out.println(myMatcher.matches("x".repeat(i) + 'y', "(x+x+)+y", 50));
//        }
        for (int i = 0; i < 30; i++)
            System.out.println(i+String.valueOf(myMatcher.matches("0".repeat(i), "((((0*)*)*)*)*1")));


    }

}


