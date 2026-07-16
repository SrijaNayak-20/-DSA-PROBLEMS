class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        ArrayList<Integer> temp=new ArrayList<>();
        //storing the initial values
        for(int i=n-k;i<n;i++){
            temp.add(nums[i]);
        }
        //shifting the values in the array 
        for(int j=n-k-1;j>=0;j--){
            nums[j+k]=nums[j];
        }
        //storing back the values that are stored int the temp
        for(int i=0;i<k;i++){
            nums[i]=temp.get(i);
        }
    }
}