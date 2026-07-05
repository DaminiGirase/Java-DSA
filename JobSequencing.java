import java.util.*;

public class JobSequencing {

    public static void JobSeq(int D[], int P[]) {
        int activities[][] = new int[D.length][3];
        for (int i = 0; i < D.length; i++) {
            activities[i][0] = i;
            activities[i][1] = D[i];
            activities[i][2] = P[i];
        }

        Arrays.sort(activities, (a, b) -> Integer.compare(b[2], a[2]));

        ArrayList<Integer> list = new ArrayList<>();
        int time = 0;
        int profit = 0;
        int total = 0;

        for (int i = 0; i < D.length; i++) {
            if (time < activities[i][1]) {
                list.add(activities[i][0]);
                profit += activities[i][2];
                time++;
                total++;
            }
        }

        System.out.println("Total Max Profit: " + profit);
        System.out.println("Total job: " + total);

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }

    public static void main(String[] args) {

        int D[] = {4, 1, 1, 1};
        int P[] = {20, 10, 40, 30};
        JobSeq(D, P);
    }
}
