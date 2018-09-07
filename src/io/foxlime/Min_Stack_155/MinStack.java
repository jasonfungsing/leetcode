package io.foxlime.Min_Stack_155;

import java.util.List;
import java.util.ArrayList;

class MinStack {
  private List<Integer> stackList;
  private List<Integer> minList;

  public MinStack() {
    stackList = new ArrayList<>();
    minList = new ArrayList<>();
  }

  public void push(int x) {
    stackList.add(0, x);
    if (minList.size() == 0) {
      minList.add(x);
    } else {
      boolean isAdded = false;
      for (int i = 0; i < minList.size(); i++) {
        if (minList.get(i) > x) {
          minList.add(i, x);
          isAdded = true;
          break;
        }
      }

      if (!isAdded) {
        minList.add(x);
      }
    }

  }

  public void pop() {
    int number = stackList.remove(0);
    for (int i = 0; i < minList.size(); i++) {
      if (minList.get(i) == number) {
        minList.remove(i);
      }
    }
  }

  public int top() {
    return stackList.get(0);
  }

  public int getMin() {
    return minList.get(0);
  }

}

