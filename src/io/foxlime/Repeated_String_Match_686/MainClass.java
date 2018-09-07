package io.foxlime.Repeated_String_Match_686;

class Solution {
  public int repeatedStringMatch(String A, String B) {
    String current = "";
    int count = 0;

    for (int i = 0; i < B.length(); i++) {
      char c = B.charAt(i);
      String currentWithc = current + c;
      if (!A.contains(currentWithc)) {
        if (A.charAt(0) == c) {
          if (count > 0) {
            if (A.equals(current)) {
              count++;
              current = "" + c;
            }else{
              return -1;
            }
          } else {
            count++;
            current = "" + c;
          }
        } else {
          return -1;
        }
      } else {
        current += c;
      }
    }

    if (current.length() != 0 && A.contains(current)) {
      count++;
    } else {
      count = -1;
    }

    return count;
  }
}

public class MainClass {
  public static void main(String[] args) {
    String A = "abcd";
    String B = "cdabcdab";

    int ret = new Solution().repeatedStringMatch(A, B);

    String out = String.valueOf(ret);

    System.out.println(out);

    B = "cdab";

    ret = new Solution().repeatedStringMatch(A, B);

    out = String.valueOf(ret);

    System.out.println(out);

    B = "dab";

    ret = new Solution().repeatedStringMatch(A, B);

    out = String.valueOf(ret);

    System.out.println(out);

    B = "d";

    ret = new Solution().repeatedStringMatch(A, B);

    out = String.valueOf(ret);

    System.out.println(out);

    B = "e";

    ret = new Solution().repeatedStringMatch(A, B);

    out = String.valueOf(ret);

    System.out.println(out);

    A = "babbbaabb";
    B = "babbbaabbbabbbbaabbbabbbbaabbbabbbbaabbbabbbbaabbbabbbbaabbbabbbbaabbbabbbbaabbbabbbbaabbbabbbbaabb";

    ret = new Solution().repeatedStringMatch(A, B);

    out = String.valueOf(ret);

    System.out.println(out);

    A = "aaaaa";
    B = "aaaaaaaaa";

    ret = new Solution().repeatedStringMatch(A, B);

    out = String.valueOf(ret);

    System.out.println(out);
  }
}