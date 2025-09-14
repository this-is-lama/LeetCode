class Solution {
    public String reverseVowels(String s) {
    Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    int start = 0;
    int end = s.length() - 1;
    char[] chars = s.toCharArray();
    while (start < end) {
      while (start < end && !vowels.contains(chars[start])) {
        start++;
      }
      while (start < end &&!vowels.contains(chars[end])) {
        end--;
      }
      char temp = chars[start];
      chars[start] = chars[end];
      chars[end] = temp;
      start++;
      end--;
    }
    return new String(chars);
  }
}