class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int i=2;i<nums.length;i++){
            if((arr1.get(arr1.size()-1))>(arr2.get(arr2.size()-1))){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }
        }
        arr1.addAll(arr2);

        for(int i=0;i<arr1.size();i++){
            nums[i]=arr1.get(i);
        }
        return nums;
    }
}