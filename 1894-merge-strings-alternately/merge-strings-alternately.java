class Solution {
    public String mergeAlternately(String word1, String word2) {
    StringBuilder result = new StringBuilder();
    int index = 0;
    while (word1.length() > index && word2.length() > index) {
      result.append(word1.charAt(index)).append(word2.charAt(index));
      index++;
    }
    if (word1.length() > index) {
      result.append(word1, index, word1.length());
    }
    if (word2.length() > index) {
      result.append(word2, index, word2.length());
    }
    return result.toString();
  }
}