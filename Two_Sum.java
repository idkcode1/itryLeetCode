class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> check= new HashMap<>();
    int[] fin=new int[2];
    for(int i=0;i<nums.length;i++){
        int val=target-nums[i];
       
        if(check.containsKey(val)){
            if(check.get(val)!=i){
                fin[0]=i;
                fin[1]=check.get(val);
                return fin;
              }
          }
        check.put(nums[i],i);
        }
    return fin;
    }
    
}
