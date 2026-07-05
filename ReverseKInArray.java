public class ReverseKInArray {
    public static void main(String[] args) {

        // move negative to left--------------------
        // int arr[] = { 1, -2, 3, -5, 6, -7 };
        // int temp[] = new int[arr.length];

        // for (int i = 0; i < arr.length; i++) {
        // temp[i] = arr[i];
        // }

        // int count = 0;

        // for (int i = 0; i < arr.length; i++) {
        // if (temp[i] < 0) {
        // arr[count] = temp[i];
        // count++;
        // }
        // }

        // for (int i = 0; i < temp.length; i++) {
        // if (temp[i] >= 0) {
        // arr[count] = temp[i];
        // count++;
        // }

        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // Move even index first--------------------
        // int arr[] = { 1, 2, 3, 4, 5 };
        // int temp[] = new int[arr.length];

        // for (int i = 0; i < arr.length; i++) {
        // temp[i] = arr[i];
        // }

        // int count = 0;

        // for (int i = 0; i < arr.length; i++) {
        // if (i % 2 != 0) {
        // arr[count] = temp[i];
        // count++;
        // }
        // }

        // for (int i = 0; i < temp.length; i++) {
        // if (i % 2 == 0) {
        // arr[count] = temp[i];
        // count++;
        // }

        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        int arr[] = { 1, 2, 3, 4, 5 };

        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        int temp[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        while (left <= right) {
            if (left == right) {
                arr[count++] = temp[left];
            } else {
                arr[count++] = temp[left];
                arr[count++] = temp[right];
            }
            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // move even left right to odd------------------

        // int arr[] = { 3, 5, 6, 4, 3, 2 };

        // for (int i = 0; i < arr.length; i++) {
        // int left = 0;
        // int right = arr.length - 1;
        // while (left <= right) {
        // if (arr[left] % 2 == 0) {
        // left++;
        // } else if (arr[right] % 2 != 0) {
        // right--;
        // } else {
        // int temp = arr[left];
        // arr[left] = arr[right];
        // arr[right] = temp;
        // }
        // }
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // int arr[] = { 3, 0, 6, 0, 3, 0 };

        // for (int i = 0; i < arr.length; i++) {
        // int left = 0;
        // int right = arr.length - 1;
        // while (left <= right) {
        // if (arr[left] != 0) {
        // left++;
        // } else if (arr[right] == 0) {
        // right--;
        // } else {
        // int temp = arr[left];
        // arr[left] = arr[right];
        // arr[right] = temp;
        // }
        // }
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // rotataion ---------------------------

        // for (int i = 0; i < k; i++) {
        // int last = arr[arr.length - 1];
        // for (int j = arr.length - 1; j > 0; j--) {
        // arr[j] = arr[j - 1];
        // }

        // arr[0] = last;
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // for (int i = 0; i < arr.length - 1; i += 2) {
        // int left = i;
        // int right = i + 1;
        // while (left < right) {
        // int temp = arr[left];
        // arr[left] = arr[right];
        // arr[right] = temp;

        // left++;
        // right--;
        // }

        // }
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // reverse last k--------------------------------

        // int left = arr.length - k;
        // int right = arr.length - 1;

        // while (left < right) {
        // int temp = arr[left];
        // arr[left] = arr[right];
        // arr[right] = temp;

        // left++;
        // right--;
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // reverse first k-------------------------------
        // int left = 0;
        // int right = k - 1;

        // while (left < right) {
        // int temp = arr[left];
        // arr[left] = arr[right];
        // arr[right] = temp;

        // left++;
        // right--;
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // reverse group---------------------------------

        // for (int i = 0; i < arr.length; i += k) {
        // int left = i;
        // int right = Math.min(i + k - 1, arr.length - 1);
        // while (left < right) {
        // int temp = arr[left];
        // arr[left] = arr[right];
        // arr[right] = temp;

        // left++;
        // right--;
        // }

        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

    }
}
