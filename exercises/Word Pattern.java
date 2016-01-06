public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] array = str.split(" ");
        int size = pattern.length();

        if (array.length != size){ 
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Map<String, Character> dup = new HashMap<>();

        for (int i=0; i<size; i++) {
            char a = pattern.charAt(i);
            String b = array[i];
            if (map.containsKey(a) && !b.equals(map.get(a))) {
                return false;
            }
            if (dup.containsKey(b) && a != dup.get(b)) {
                return false;
            }
            map.put(a, b);
            dup.put(b, a);
        }
        return true;
    }
}