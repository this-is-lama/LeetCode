class Solution {
    public String gcdOfStrings(String str1, String str2) {
    int length = Math.min(str1.length(), str2.length());
    String result = "";
    
    for (int i = 0; i < length; i++) {
      String divisor = str1.substring(0, i + 1);
      if (str1.replace(divisor, "").isEmpty() && str2.replace(divisor, "").isEmpty()) {
        result = divisor;
      }
    }
    
    return result;
  }
}