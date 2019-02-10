package io.foxlime.Unique_Email_929;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public int numUniqueEmails(String[] emails) {
    Set<String> items = new HashSet<String>();
    for (String email : emails) {
      String domain = email.split("@")[1];
      String localName = email.split("@")[0].replace(".", "").split("\\+")[0];

      String newEmail = localName + "@" + domain;
      items.add(newEmail);
    }


    return items.size();
  }
}
