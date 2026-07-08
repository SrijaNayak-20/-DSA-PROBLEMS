class Solution {
    public String reverseWords(String s) {
        String s_1=s.replaceAll("\\s+"," ").trim();
        String [] st=s_1.split(" ");
        StringBuilder str =new StringBuilder(); //O(n)
        for(int i=(st.length)-1;i>=0;i--){
            str.append(st[i]).append(" ");
        }
        return str.toString().trim();
        /*String s_1=s.replaceAll("\\s+"," ");
        String [] st=s_1.split(" ");
        String str="";
        for(int i=(st.length)-1;i>=0;i--){
            str+=(st[i]+" ");
        }
        return str.trim(); */ //O(n*n)
    }
}