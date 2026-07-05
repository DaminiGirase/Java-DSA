import java.util.*;

public class ActivitySelection {

    // Ending array is Sorted

    public static void Activity(int start[], int end[]) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);

        int maxA = 1;
        int lastEnd = end[0];

        for (int i = 1; i < start.length; i++) {
            if (start[i] >= lastEnd) {
                maxA++;
                lastEnd = end[i];
                list.add(i);
            }
        }
        System.out.println("Maximum Activity: " + maxA);
        for (int i = 0; i < list.size(); i++) {
            System.out.print("A" + list.get(i) + " ");
        }

    }

    // Ending array is not sorted

    public static void ActivitySelect(int start[], int end[]) {

        int activites[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activites[i][0] = i;
            activites[i][1] = start[i];
            activites[i][2] = end[i];
        }

        Arrays.sort(activites, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(activites[0][0]);

        int maxA = 1;
        int lastEnd = activites[0][2];

        for (int i = 1; i < start.length; i++) {
            if (activites[i][1] >= lastEnd) {
                maxA++;
                lastEnd = activites[i][2];
                list.add(activites[i][0]);
            }
        }
        System.out.println("Maximum Activity: " + maxA);
        for (int i = 0; i < list.size(); i++) {
            System.out.print("A" + list.get(i) + " ");
        }
    }

    public static void MaxLengthChain(int pairs[][]) {
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int maxLength = 1;
        int lastEnd = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > lastEnd) {
                maxLength++;
                lastEnd = pairs[i][1];
            }
        }

        System.out.println("Max Pairs: " + maxLength);
    }

    public static void main(String[] args) {

        int start[] = { 1, 2, 3, 4 };
        int end[] = { 3, 5, 6, 7 };

        // ActivitySelect(start, end);

        // Max length chain of pairs

        int pairs[][] = {
                { 5, 24 },
                { 39, 60 },
                { 5, 28 },
                { 27, 40 },
                { 50, 90 }
        };
        MaxLengthChain(pairs);

    }
}
