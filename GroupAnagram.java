// Time Complexity: O(nklogk)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // aet -> eat, tea, ate
        // ant -> tan, nat
        // abt -> bat

        HashMap<String, List<String>> hashMap = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String str = strs[i];

            char[] chrArr = str.toCharArray();
            Arrays.sort(chrArr);
            String newStr = String.valueOf(chrArr);
            
            if(hashMap.containsKey(newStr)) {
                hashMap.get(newStr).add(str);
            } else {
                ArrayList<String> arrList = new ArrayList<>();
                arrList.add(str);
                hashMap.put(newStr, arrList);
            }

        }

        List<List<String>> list = new ArrayList<>();

        for(Map.Entry<String, List<String>> map: hashMap.entrySet()) {
            list.add(map.getValue());
        }

        return list;
    }
}
