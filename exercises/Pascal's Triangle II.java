public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result  = new ArrayList<Integer>();
        for(int i=0;i<=rowIndex;i++){
            result.add(1);
            int prev = result.get(0);
            for(int j = 1;j<i;j++){
                int current  = result.get(j);               
                result.set(j, prev + current);
                prev = current;
            }
        }
        return result;
            
    }
}