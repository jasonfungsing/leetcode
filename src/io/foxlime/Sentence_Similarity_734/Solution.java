package io.foxlime.Sentence_Similarity_734;

class Solution {
  public boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
    if (words1.length != words2.length) {
      return false;
    }

    for (int i = 0; i < words1.length; i++) {
      String aword = words1[i];
      String bword = words2[i];
      if (!isWordSimilar(aword, bword, pairs)) {
        return false;
      }
    }

    return true;
  }

  private boolean isWordSimilar(String aword, String bword, String[][] pairs) {
    if (aword.equals(bword)) {
      return true;
    }
    for (int i = 0; i < pairs.length; i++) {
      String[] pair = pairs[i];
      String pairword1 = pair[0];
      String pairword2 = pair[1];
      if ((aword.equals(pairword1) || aword.equals(pairword2)) && (bword.equals(pairword1) || bword.equals(pairword2))) {
        return true;
      }
    }

    return false;
  }
}