


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Step 1: Create HashMap
        HashMap<String, List<String>> map = new HashMap<>();

        // Step 2: Traverse each string
        for (String str : strs) {

            // Step 3: Convert string to character array
            char[] chars = str.toCharArray();

            // Step 4: Sort characters
            Arrays.sort(chars);

            // Step 5: Convert character array to String
            String key = new String(chars);

            // Step 6: Check if key exists
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Step 7: Add original string to group
            map.get(key).add(str);
        }

        // Step 8: Return grouped anagrams
        return new ArrayList<>(map.values());
    }
}