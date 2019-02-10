package io.foxlime.Unique_Char_387;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  class Item {
    private char c;
    private int index;
    private int count;

    public char getC() {
      return c;
    }

    public void setC(char c) {
      this.c = c;
    }

    public int getIndex() {
      return index;
    }

    public void setIndex(int index) {
      this.index = index;
    }

    public int getCount() {
      return count;
    }

    public void setCount(int count) {
      this.count = count;
    }

    @Override
    public String toString() {
      return "Item{" +
          "c=" + c +
          ", index=" + index +
          ", count=" + count +
          '}';
    }
  }

  public int firstUniqChar(String s) {
    List<Item> itemList = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      boolean isContain = false;
      char ch = s.charAt(i);
      for (Item item : itemList) {
        if (item.getC() == ch) {
          item.setCount(item.getCount() + 1);
          isContain = true;
          break;
        }
      }

      if (!isContain) {
        Item item1 = new Item();
        item1.setC(ch);
        item1.setIndex(i);
        item1.setCount(1);
        itemList.add(item1);
      }
    }

    int index = -1;
    for (Item item : itemList) {
      if (item.getCount() == 1) {
        index = item.getIndex();
        break;
      }
    }

    return index;
  }

  public static void main(String[] args) {

    Solution solution = new Solution();
    int index = solution.firstUniqChar("leetcode");
    System.out.println(index);

    index = solution.firstUniqChar("loveleetcode");
    System.out.println(index);
  }
}