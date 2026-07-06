class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        List<Character> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
        }

        for(int i = 0; i < s.length(); i++){
           if(list.contains(t.charAt(i))){
               list.remove(list.indexOf(t.charAt(i)));
           }
        }

        return list.isEmpty();
    }
}
