import java.util.HashMap;

class Solution {
  public static char mostFrequentChar(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    int maxCount = 0;
    char maxLetter = 'a';

    for (int i = 0; i < s.length(); i++) {
      char letter = s.charAt(i);
      if (map.containsKey(letter))
        map.put(letter, map.get(letter) + 1);
      else
        map.put(letter, 1);
    }

    for (Character key : map.keySet()) {
      int val = map.get(key);
      if (val > maxCount) {
        maxCount = val;
      }

      if (val == maxCount) {
        maxLetter = key;
      }
    }
    return maxLetter;
  }

  public static void main(String[] args) {
    // Try out your test cases:
    System.out.println(Solution.mostFrequentChar("mississippi")); // -> 'i'
  }

}
