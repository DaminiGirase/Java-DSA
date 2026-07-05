import java.util.*;

public class ArrayListExcersice {
    public static void main(String[] args) {

        // Q 02

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(4);

        int max = 0;

        for (int i = 0; i < list.size(); i++) {
        max = Math.max(max, list.get(i));
        }

        int freq[] = new int[max + 1];

        for (int i = 0; i < list.size(); i++) {
        freq[list.get(i)]++;
        }

        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
        int n1 = list.get(i);
        if (freq[n1] == 1) {
        if (list.contains(n1 - 1) || list.contains(n1 + 1)) {
        System.out.println(list.get(i) + " is not lonly");
        } else {
        System.out.println(list.get(i) + " is lonly");
        li.add(list.get(i));
        }
        }

        }

        System.out.println(li);

        // similar but another

        // int arr[] = {1,2,4,7,8,10};
        // Arrays.sort(arr);
        // ArrayList<Integer> list = new ArrayList<>();

        // for(int i=0; i<arr.length; i++){
        // if((i==0 || arr[i] - arr[i-1] >= 2) &&(i==arr.length-1 || arr[i+1] - arr[i]
        // >= 2)){
        // list.add(arr[i]);
        // }
        // }

        // System.out.println(list);

        // similar but another

        // int arr[] = {1,1,3};
        // ArrayList<Integer> list = new ArrayList<>();

        // for(int i=0; i<arr.length; i++){
        // if(i==0 || (arr[i] != arr[i-1] && arr[i] != arr[i-1] +1)){
        // list.add(arr[i]);
        // }
        // }

        // System.out.println(list);

        // similar remove then find lonly

        // int arr[] = { 1, 2, 3, 5, 6 };
        // int remove = 1;

        // for (int i = remove; i < arr.length - 1; i++) {
        // arr[i] = arr[i + 1];
        // }

        // int newSize = arr.length - 1;
        // ArrayList<Integer> list = new ArrayList<>();

        // for (int i = 0; i < newSize; i++) {
        // if ((i == 0 || arr[i] - arr[i - 1] > 1) &&
        // (i == newSize - 1 || arr[i + 1] - arr[i] > 1)) {
        // list.add(arr[i]);
        // }
        // }

        // System.out.println(list);

        // Q 01

        // boolean t = true;
        // boolean p = true;

        // for(int i=1; i<list.size(); i++){
        // if(list.get(i) < list.get(i-1)){
        // t = false;
        // }
        // else if(list.get(i) > list.get(i-1)){
        // p = false;
        // }
        // }

        // if(t||p){
        // System.out.println("Yes");
        // }else{
        // System.out.println("no");
        // }

        // Q 04

        // int n = 4;
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(0);
        // list.add(0);
        // list.add(0);
        // list.add(0);
        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // for (int k = i; k <= j; k++) {
        // if (2 * list.get(k) == list.get(i) + list.get(j)) {

        // list.add(k);
        // if (list.contains(0)) {
        // list.remove(j);
        // }

        // }
        // }
        // }
        // }

        // System.out.println(list);

        // Q 03

        // int arr[] = {1, 100, 200, 1, 100};
        // int max = 0;
        // int key = 1;
        // for (int i = 0; i < arr.length; i++) {
        // max = Math.max(max, arr[i]);
        // }

        // int freq[] = new int[max + 1];

        // for (int i = 0; i < arr.length - 1; i++) {
        // if (arr[i] == key) {
        // freq[arr[i + 1]]++;
        // }
        // }

        // int r = 0;
        // int maxF = 0;
        // for (int i = 0; i < freq.length; i++) {
        // if(freq[i]>maxF){
        // maxF = freq[i];
        // r = i;
        // }
        // }
        // System.out.println(r);

        // Q 04

//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         int n = 4;
        
//         while (list.size() < n) {
//             ArrayList<Integer> temp = new ArrayList<>();
//             for (int x : list) {
//                 if (2 * x - 1 <= n) {
//                     temp.add(2 * x - 1);
//                 }
//             }

//             for (int x : list) {
//                 if (2 * x <= n) {
//                     temp.add(2 * x);
//                 }
//             }

//             list = temp;
//         }

// System.out.println(list);
    }
}
