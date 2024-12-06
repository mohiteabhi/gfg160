import java.util.HashMap;

class Solution {
    public boolean areAnagrams(String s1, String s2) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) - 1);
        }

        for (int value : charCount.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "listen";
        String s2 = "silent";
        
        if (solution.areAnagrams(s1, s2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
