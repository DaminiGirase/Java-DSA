public class myRecursion {

    public static int digitCount(int n) {
        if (n == 0) {
            return 0;
        }

        return 1 + digitCount(n / 10);
    }

    public static int sumOfDigit(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + sumOfDigit(n / 10);
    }

    public static int arrCount(int arr[], int index) {
        if (index == 0) {
            return 0;
        }

        return 1 + arrCount(arr, index - 1);
    }

    public static int arrSum(int arr[], int index) {
        if (index == arr.length) {
            return 0;
        }

        return arr[index] + arrSum(arr, index + 1);
    }

    public static void reverseNo(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n % 10);
        reverseNo(n / 10);
    }

    public static boolean isPalindrom(int arr[], int index) {
        if (index == arr.length) {
            return true;
        }

        if (arr[index] != arr[arr.length - index - 1]) {
            return false;
        }

        return isPalindrom(arr, index + 1);
    }

    public static int maxIN(int arr[], int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int maxElement = maxIN(arr, index + 1);
        return arr[index] > maxElement ? arr[index] : maxElement;

    }

    public static int maxI(int arr[], int index) {
        if (index == -1) {
            return 0;
        }

        int max = arr[index];
        return max > maxI(arr, index - 1) ? max : maxI(arr, index - 1);
    }

    static int max = Integer.MIN_VALUE;
    static int secondMax = Integer.MIN_VALUE;

    public static int secondEle(int arr[], int index) {
        if (index == arr.length) {
            return secondMax;
        }

        if (arr[index] > max) {
            secondMax = max;
            max = arr[index];
        } else if (arr[index] > secondMax && arr[index] < max) {
            secondMax = arr[index];
        }

        return secondEle(arr, index + 1);
    }

    public static boolean checkArray(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return checkArray(arr, index + 1);
    }

    public static void pattern(int i, int j, int n, int m) {
        if (i == n) {
            return;
        }

        if (j == m) {
            System.out.println();
            pattern(i + 1, 0, n, m);
            return;
        }

        System.out.print("* ");

        pattern(i, j + 1, n, m);

    }

    public static int minElement(int arr[], int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int minEle = minElement(arr, index + 1);
        return arr[index] < minEle ? arr[index] : minEle;
    }

    public static int search(int arr[], int key, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == key) {
            return index;
        }

        return search(arr, key, index + 1);
    }

    public static int searchF(int arr[], int key, int index) {
        if (index == -1) {
            return -1;
        }

        if (arr[index] == key) {
            return index;
        }

        return searchF(arr, key, index - 1);
    }

    static int count = 0;

    public static int countOccurance(int arr[], int key, int index) {
        if (index == arr.length) {
            return count;
        }

        if (arr[index] == key) {
            count++;
        }
        return countOccurance(arr, key, index + 1);
    }

    public static void reverse(int arr[], int index) {
        if (index == arr.length) {
            return;
        }

        reverse(arr, index + 1);
        System.out.print(arr[index] + " ");
    }

    public static void shift(int arr[], int x, int y, int index) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == x) {
            arr[index] = y;
        }

        System.out.print(arr[index] + " ");
        shift(arr, x, y, index + 1);
    }

    public static void shiftZero(int arr[], int index, int pos) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] != 0) {
            int temp = arr[index];
            arr[index] = arr[pos];
            arr[pos] = temp;

            shiftZero(arr, index + 1, pos + 1);
        } else {
            shiftZero(arr, index + 1, pos);
        }

    }

    public static void removeDuplicate(int arr[], int temp[], int index) {
        if (index == arr.length) {
            return;
        }

        temp[arr[index]]++;

        if (temp[arr[index]] > 1) {
            arr[index] = -1;
        }

        removeDuplicate(arr, temp, index + 1);
    }

    public static void remove(int arr[], int index) {
        if (index == arr.length - 1) {
            return;
        }

        if (arr[index] == arr[index + 1]) {
            arr[index] = -1;
        }

        remove(arr, index + 1);
    }

    public static boolean increasing(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }

        if(arr[index] > arr[index+1]){
            return false;
        }
        return increasing(arr, index+1);
    }
    public static void main(String[] args) {
        // int n = 1234;
        // System.out.println(sumOfDigit(n));

        // pattern(0, 0, 3, 3);

        int arr[] = {1, 2, 3, 4, 5, 3};
        System.out.println(increasing(arr, 0));
        // System.out.println(maxI(arr, arr.length-1));
        // int size = 0;
        // for (int i = 0; i < arr.length; i++) {
        // size = Math.max(size, arr[i]);
        // }

        // int temp[] = new int[size + 1];

        // removeDuplicate(arr, temp, 0);
        // shiftZero(arr, 0, 0);

        // remove(arr, 0);
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] != -1) {
        //         System.out.print(arr[i] + " ");
        //     }
        // }

        // shift(arr, 2, 0, 0);
        // reverse(arr, 0);
        // System.out.println(countOccurance(arr, 2, 0));
        // System.out.println(minElement(arr, 0));
        // System.out.println(checkArray(arr, 0));
        // System.out.println(isPalindrom(arr, 0));
        // System.out.println(arrCount(arr, arr.length));
        // System.out.println(arrSum(arr, 0));
        // reverseNo(567);

    }
}
