class Solution {
    public int lengthOfLastWord(String s) {
        String[] st=s.split(" ");
        int l=st.length;
        int ls=st[l-1].length();
        return ls;
    }
}