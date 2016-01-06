public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>(numRows);
        ArrayList<Integer> previous = null;
        ArrayList<Integer> current = null;

        for (int i = 0; i < numRows; i++) {
            current = new ArrayList<Integer>(i+1);
            current.add(1);
            if (previous != null) {
                for (int j = 1; j < i; j++) {
                    current.add(previous.get(j-1) + previous.get(j));
                }
                current.add(1);
            }
            result.add(current);
            previous = current;
        }

        return result;
    }
}

