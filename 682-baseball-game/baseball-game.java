class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s: operations){
                if(s.equals("C")){
                    st.pop();
                }
                else if(s.equals("D")){
                    st.push(st.peek()*2);
                }
                else if(s.equals("+")){
                    int top =st.pop();
                    int sum=top+st.peek();
                    st.push(top);
                    st.push(sum);
                }
            
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int add=0;
        while(!st.isEmpty()){
            add=add+st.pop();
        }
        return add;
    }
}