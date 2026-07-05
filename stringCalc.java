public class stringCalc {

    public static void calC(String str[], int x, int y, int i, int j) {
       if(i >= str[x].length()){
        return;
       }

       if(j >= str[y].length()){
         calC(str, x, y, i+1, 0);
         return;
       }

       System.out.print(str[x].charAt(i) + "" + str[y].charAt(j) + " ");
       calC(str, x, y, i, j+1);
    }

    // public static void claC(String str[], int x, int y, int z, int i, int j, int k){
    //    if(i == str[x].length()){
    //     return;
    //    }

    //    if(j == str[y].length()){
    //     claC(str, x, y, z, i+1, 0, 0);
    //     return;
    //    }
     
     
    //    if(k == str[z].length()){
    //     claC(str, x, y, z, i, j+1, 0);
    //     return;
    //    }

    //    System.out.print(str[x].charAt(i) + "" + str[y].charAt(j) + " ");
    //      System.out.print(str[x].charAt(i) + "" + str[z].charAt(k) + " ");
    //    claC(str, x, y, z, i, j+1, k+1);
    // }

    //  public static void claC(String str[], int x, int y, int z, int i, int j, int k){
    //     if(i >= str[x].length()){
    //         return;
    //     }

    //     if(j >= str[y].length() || k >= str[z].length()){
    //        claC(str, x, y, z, i+1, 0, 0);
    //        return;
    //     }

    //     System.out.print(str[x].charAt(i) + "" + str[y].charAt(j) + "" + str[z].charAt(k) + " ");
    //     claC(str, x, y, z, i, j+1, k+1);
    //  }

    public static void main(String[] args) {
        String str[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        calC(str, 2, 3, 0, 0);
        // claC(str, 2, 3, 7, 0, 0, 0);

    }
}
