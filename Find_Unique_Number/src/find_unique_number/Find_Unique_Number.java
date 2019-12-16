package find_unique_number;

import java.util.HashSet;

public class Find_Unique_Number {

    static int nonDup(int[] list) throws Exception {
        HashSet<Integer> goodSet = new HashSet();
        HashSet<Integer> badSet = new HashSet();
        for (int i = 0; i < list.length; i++) {
            int temp = list[i];
            if (goodSet.contains(temp)) {
                goodSet.remove(temp);
                badSet.add(temp);
                continue;
            }
            if (!goodSet.contains(temp) & !badSet.contains(temp)) {
                goodSet.add(temp);
            }
        }
        int uniqueSize = goodSet.size();
        if (uniqueSize == 1) {
            return (int) (goodSet.toArray())[0];
        } else if (uniqueSize > 1) {
            throw new Exception("Too many unique numbers were found!");
        } else {
            throw new Exception("No unique numbers were found!");
        }

    }

    public static void main(String[] args) {
        try {
            int[] list = {4, 3, 2, 4, 1, 3, 2};
            int nonDup = nonDup(list);
            System.out.println("nonDup value is " + nonDup);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
