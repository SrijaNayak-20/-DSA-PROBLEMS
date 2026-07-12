class Solution {
    public int strStr(String haystack, String needle) {
        boolean s=haystack.contains(needle);
        int index=haystack.indexOf(needle);
        if(s){
            return index;
        }
        return -1;
    }
}