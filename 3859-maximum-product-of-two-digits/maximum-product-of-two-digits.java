class Solution {
    public int maxProduct(int n) {
        int mx=0;
        List<Integer> arr= new ArrayList<>();
        while(n>0){
            arr.add(n%10);
            n/=10;
        }
        for(int i=0;i<arr.size();i++){
            for(int j=i;j<arr.size()-1;j++){
                int prod=arr.get(i)*arr.get(j+1);
                mx=Math.max(prod,mx);
            }
        }
        return mx;
    }
}