class Solution {
    public String mergeAlternately(String word1, String word2) {
    StringBuilder result = new StringBuilder();
    int index = 0;
    int len1 = word1.length();
    int len2 = word2.length();

    while (index < len1 || index < len2) {
      if (index < len1) {
        result.append(word1.charAt(index));
      }
      if (index < len2) {
        result.append(word2.charAt(index));
      }
      index++;
    }

    return result.toString();
  }
}