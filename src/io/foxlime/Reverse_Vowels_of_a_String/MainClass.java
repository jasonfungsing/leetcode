package io.foxlime.Reverse_Vowels_of_a_String;

class Solution {
  public String reverseVowels(String s) {
    char[] charArray = s.toCharArray();
    int i = 0;
    int j = charArray.length - 1;

    while (i <= j) {
      char left = charArray[i];
      char right = charArray[j];
      if (left != 'a' && left != 'e' && left != 'i' && left != 'o' && left != 'u'
          && left != 'A' && left != 'E' && left != 'I' && left != 'O' && left != 'U') {
        i++;
      } else if (right != 'a' && right != 'e' && right != 'i' && right != 'o' && right != 'u'
          && right != 'A' && right != 'E' && right != 'I' && right != 'O' && right != 'U') {
        j--;
      } else {
        charArray[i] = right;
        charArray[j] = left;
        i++;
        j--;
      }
    }

    return new String(charArray);
  }
}

public class MainClass {

  public static void main(String[] args) {

    String ret = new Solution().reverseVowels("hello");

    System.out.println(ret);

    ret = new Solution().reverseVowels("leetcode");

    System.out.println(ret);
  }
}