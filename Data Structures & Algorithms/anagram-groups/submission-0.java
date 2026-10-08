class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        List<List<String>> result = new ArrayList<List<String>>();
        for(String curr: strs) {
            int[] charCount = new int[26];
            StringBuilder sb = new StringBuilder();
            for(char current: curr.toCharArray()) {
                charCount[current - 'a']++;
            }
            String key = Arrays.toString(charCount);

            List<String> currentList = anagramMap.getOrDefault(key, new ArrayList<String>());
            currentList.add(curr);
            anagramMap.put(key, currentList);
        }

        return new ArrayList<>(anagramMap.values());
    }
}
