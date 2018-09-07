package io.foxlime.Power_Of_Two_231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
  public boolean isPowerOfTwo(int n) {
    int i = 0;
    while (Math.pow(2, i) < n) {
      i++;
    }

    if (Math.pow(2, i) == n) {
      return true;
    } else {
      return false;
    }

  }
}

public class MainClass {
  public static String booleanToString(boolean input) {
    return input ? "True" : "False";
  }

  public static void main(String[] args) throws IOException {

    boolean ret = new Solution().isPowerOfTwo(20);

    String out = booleanToString(ret);

    System.out.println(out);

    ret = new Solution().isPowerOfTwo(16);

    out = booleanToString(ret);

    System.out.println(out);

    ret = new Solution().isPowerOfTwo(1);

    out = booleanToString(ret);

    System.out.println(out);

    ret = new Solution().isPowerOfTwo(128);

    out = booleanToString(ret);

    System.out.println(out);

    ret = new Solution().isPowerOfTwo(126);

    out = booleanToString(ret);

    System.out.println(out);

    ret = new Solution().isPowerOfTwo(129);

    out = booleanToString(ret);

    System.out.println(out);
  }
}