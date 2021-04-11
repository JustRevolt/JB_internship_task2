public class Main {

    private static volatile boolean res;

    public static void main(String[] args) {

        MyMatcher myMatcher = new MyMatcher();

//        System.out.println(matches("text", "[o-}*"));
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

//        System.out.println(myMatcher.matches(str7000, "((a|b)*ac+((b|c)*|b))+"));
//        System.out.println(myMatcher.matches("x".repeat(200000000) + 'y', "(x+x+)+y",50));
        System.out.println(myMatcher.matches("0000000000000000000000000000000000000000000000000000000000", "((0*)*)*1"));


    }

}


