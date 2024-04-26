class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int len=numbers.length;
       int left=0,right=len-1;
       while(left<right){
        if(numbers[left]+numbers[right]>target){
            right--;
        }
        else if(numbers[left]+numbers[right]<target){
            left++;
        }
        else{
            return new int[]{left+1,right+1};
        }  
       }
        return new int[]{-1,-1};
    }
}
/*
 Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i])){
                return new int[]{map.get(target-numbers[i])+1,i+1};
            }
            map.put(numbers[i],i);
        }
        return new int[]{};
    }
*/