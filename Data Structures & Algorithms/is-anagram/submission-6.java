class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        Map<Character, Integer> sMap = new HashMap<>();

        Map<Character, Integer> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            sMap.put(s.charAt(i), 1 + sMap.getOrDefault(s.charAt(i), 0));
            tMap.put(t.charAt(i), 1 + tMap.getOrDefault(t.charAt(i), 0));
        }

        for(char c : sMap.keySet()){
            if(!sMap.get(c).equals(tMap.getOrDefault(c, 0))){
                return false;
            }
        }
        return true;
    }
}