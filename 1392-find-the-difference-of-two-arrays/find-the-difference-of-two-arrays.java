class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();

        for(int num:nums1) s1.add(num);
        for(int num:nums2) s2.add(num);

        List<Integer> list1=new ArrayList<>(s1);
        List<Integer> list2=new ArrayList<>(s2);

        list1.removeAll(s2);
        list2.removeAll(s1);

        return Arrays.asList(list1,list2);
    }
}