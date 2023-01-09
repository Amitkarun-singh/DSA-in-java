package Arrays.ArrayList;

import java.util.*;

public class BasicOperations {
    public static void Swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        /*
         * System.out.print("Enter any number:-");
         * int n = sc.nextInt();
         * System.out.print("Enter the element of arraylist:-");
         * for (int i = 0; i < n; i++) {
         * list.add(sc.nextInt());
         * }
         * System.out.println(list.size());
         * for (int i = 0; i < list.size(); i++) {
         * System.out.print(list.get(i) + " ");
         * }
         */
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        // Print reverse arraylist
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        // Find Maximum in array list
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            /*
             * if(max<list.get(i)){
             * max=list.get(i);
             * }
             */
            max = Math.max(max, list.get(i));
        }
        System.out.println("The maximum element of arraylist is:-" + max);
        // swaping in arraylist
        System.out.println("Enter any index to swap it value:-");
        int idx1 = sc.nextInt();
        System.out.println("Enter another index to swap it value:-");
        int idx2 = sc.nextInt();
        System.out.println(list);
        Swap(list, idx1, idx2);
        System.out.println(list);
        // Sorting in Arraylist
        // ascending
        Collections.sort(list);
        System.out.println(list);
        // descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        // Mutti-Dimensional ArrayList
        /*
         * ArrayList<ArrayList<>> mainlist=new ArrayList<>();
         * or
         */
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        list2.remove(2);
        list2.remove(3);
        System.out.println(mainlist);
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currentlist = mainlist.get(i);
            for (int j = 0; j < currentlist.size(); j++) {
                System.out.print(currentlist.get(j) + " ");
            }
            System.out.println();
        }

    }
}
