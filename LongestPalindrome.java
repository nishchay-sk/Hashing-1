class Solution {
    public int longestPalindrome(String s) {
        // abccccdd
        // a: 1
        // b: 1
        // c: 4
        // d: 2

        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(set.contains(c)) {
                count += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        if(!set.isEmpty()) {
            count += 1;
        }

        return count;
    }
}
