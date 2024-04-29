class RandomizedSet {
    Set<Integer> randomset;

    public RandomizedSet() {
        randomset=new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(randomset.contains(val)){
            return false;
        }
        randomset.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(randomset.contains(val)){
            randomset.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        Integer[] nums=randomset.toArray(new Integer[randomset.size()]);
        Random random=new Random();
        int randomnum=random.nextInt(randomset.size());
        return nums[randomnum];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */