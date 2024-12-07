class Solution {
    static char nonRepeatingChar(String s) {
        int[] freq = new int[26]; 
        int[] firstIndex = new int[26]; 
        
        for (int i = 0; i < 26; i++) {
            firstIndex[i] = -1;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;
            if (firstIndex[c - 'a'] == -1) {
                firstIndex[c - 'a'] = i; // Store the first index of the character
            }
        }

        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 1) {
                minIndex = Math.min(minIndex, firstIndex[i]);
            }
        }
        
        return (minIndex == Integer.MAX_VALUE) ? '$' : s.charAt(minIndex);
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char result = nonRepeatingChar(s);
        System.out.println(result); // Expected output: 'f'
    }
}
