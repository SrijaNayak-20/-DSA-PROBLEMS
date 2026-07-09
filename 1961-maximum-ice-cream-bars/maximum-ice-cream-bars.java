class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        for(int c:costs){
            if(c<=coins){
                count++;
                coins-=c;
            }
            else{
                break;
            }
        }
         return count;
    }
}