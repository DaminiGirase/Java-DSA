import java.util.*;

public class PiorityQ {

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {

        // sorting objects

        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 12));
        pq.add(new Student("B", 11));
        pq.add(new Student("C", 15));
        pq.add(new Student("D", 10));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }

        // simple PriorityQueue

        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // pq.add(2);
        // pq.add(4);
        // pq.add(1);
        // pq.add(0);
        // +
        // while (!pq.isEmpty()) {
        // System.out.print(pq.peek() + " ");
        // pq.remove();
        // }
    }
}