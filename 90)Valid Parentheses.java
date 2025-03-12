class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> m=new HashMap<>();
        Stack<Character> st=new Stack<>();
        m.put(')','(');
        m.put(']','[');
        m.put('}','{');
        for(char c:s.toCharArray()){
            if(m.containsKey(c)){
                if(st.isEmpty()|| st.pop()!=m.get(c)){
                    return false;
                }
            }
            else{
            st.push(c);
            }

        }
        return st.isEmpty();
        
    }
}
