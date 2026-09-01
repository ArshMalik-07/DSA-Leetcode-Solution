class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> f = new HashMap<>();
        int low = 0;
        int high = 0;
        int res = 0;
        for (high = 0; high < fruits.length; high++) {
            f.put(fruits[high], f.getOrDefault(fruits[high], 0) + 1);
            while (f.size() > 2) {
                f.put(fruits[low], f.get(fruits[low]) - 1);
                if (f.get(fruits[low]) == 0) {
                    f.remove(fruits[low]);
                }
                low++;
            }
            int len = high - low + 1;
            res = Math.max(res, len);
        } 
        return res;
    }
}