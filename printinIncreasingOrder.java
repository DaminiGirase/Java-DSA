public class printinIncreasingOrder {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 1;

      if(a>b){
        int temp = a;
        a = b;
        b = temp;
      }

      if(a>c){
        int temp = a;
        a = c;
        c = temp;
      }

      if(b>c){
        int temp = b;
        b = c;
        c = temp;
      }

     System.out.println(a+ " " + b + " " + c);
    }
}
