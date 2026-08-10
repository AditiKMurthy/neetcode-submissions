class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch=='[' || ch=='(' || ch=='{') {
                st.push(ch);
            }
            else if(ch==']' || ch==')' || ch=='}') {
                if(st.isEmpty()) return false;
                char popChar = st.pop();
                if((ch==']' && popChar!='[')
                || (ch==')' && popChar!='(') || (ch=='}' && popChar!='{') ) 
                return false;
            }
        }

        if(st.isEmpty()) return true;
        else return false;
        
    }
}
