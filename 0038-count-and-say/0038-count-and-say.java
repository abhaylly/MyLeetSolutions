class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String s = countAndSay(n - 1); // Recursive  call to get the previous term
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            // Move j forward as long as characters are the same
            while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            // The count of the current digit is (j - i)
            ans.append(j - i);
            ans.append(s.charAt(i));
            // Move i to the start of the next sequence
            i = j;
        }
        return ans.toString();
    }
}