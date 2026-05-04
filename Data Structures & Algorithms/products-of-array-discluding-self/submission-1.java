class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int l = nums.length;
        int[] arr = new int[l];
        int mul = 1;
        int count = 0;
        for (int num: nums){
            if(num!=0){
                mul*=num;
            }else count+=1;
        }
        if (count >= 2){
            for (int i=0; i<l; i++){
                arr[i]=0;
            }
        }
        else if (count == 1){
            for (int i = 0; i<l; i++){
                if (nums[i]!=0){
                    arr[i]=0;
                }else arr[i]=mul;
            }
        }else{
            for (int i = 0; i<l; i++){
                arr[i]=mul/nums[i];
            }
        }
        return arr;
    }
}  
