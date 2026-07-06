class Solution {
       public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;


        char[] st = t.toCharArray();
        char[] ss = s.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(st);
        System.out.println(Arrays.toString(st));

     return Arrays.equals(st, ss);
    }
}
