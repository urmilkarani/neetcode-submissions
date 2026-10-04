class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null) {
            return false;
        }
        if(s.length() != t.length()) {
            return false;
        }
        char[] charArray = new char[26];
        for(int i = 0 ; i < s.length(); i++) {
            charArray[s.charAt(i) - 'a']++;
            charArray[t.charAt(i) - 'a']--;
        }

        for(int k = 0; k < 26; k++) {
            if(charArray[k] != 0) {
                return false;
            }
        }

        return true;
    }
}
