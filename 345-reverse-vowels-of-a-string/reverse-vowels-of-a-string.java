class Solution {
    public String reverseVowels(String s) {
    boolean[] vowels = new boolean[128];
    for (char c : "aeiouAEIOU".toCharArray()) {
      vowels[c] = true;
    }
    int start = 0;
    int end = s.length() - 1;
    char[] chars = s.toCharArray();
    while (start < end) {
      while (start < end && !vowels[chars[start]]) {
        start++;
      }
      while (start < end &&!vowels[chars[end]]) {
        end--;
      }
      char temp = chars[start];
      chars[start] = chars[end];
      chars[end] = temp;
      start++;
      end--;
    }
    return String.valueOf(chars);
  }
}