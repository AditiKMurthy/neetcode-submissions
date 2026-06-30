class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charac = new int[26];

        if(s.length() != t.length()) return false;

        for(int i=0; i<s.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            charac[s1-'a']++;
            charac[t1-'a']--;
        }

        for(int n : charac) {
            if(n!=0) return false;
        }

        return true;
    }
}
