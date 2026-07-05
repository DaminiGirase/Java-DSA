public class gridAlgorithm {
    public static void main(String[] args) {
        // int a1[] = {1, 3, 5, 7, 9, 5};
        // int a2[] = {2, 4, 6, 8, 10, 9};

        // int count = 0;
        // for(int i=0; i<a1.length; i++){
        // for(int j=0; j<a2.length; j++){
        // while(i < a1.length-1 && a2[j] < a1[i+1]){
        // i++;
        // count++;
        // }
        // }
        // }
        // System.out.println(count);

        // String str = "h1";
        // int s = str.charAt(0)-'a';
        // int t = str.charAt(1)-'0';

        // if((s+t)%2==0){
        // System.out.println("white");
        // }else{
        // System.out.println("Black");
        // }

        // int a = 3, b = 2, c = 3;
        // if(a == b && b == c){
        // System.out.println("all equal");
        // }else if(a==b || b == c || a==c){
        // System.out.println("two equal");
        // }else{
        // System.out.println("all distinct");
        // }

        // int a = 2, b = 5, c = 2, d = 7;
        // if(b<c){
        // System.out.println("no Overlap");
        // }else if(a == c){
        // System.out.println("one inside another");
        // }else{
        // System.out.println("partial");
        // }

        // int num = 987;
        // int num1 = num % 10;
        // num /= 10;
        // int num2 = num % 10;
        // num /= 10;
        // int num3 = num % 10;
        // num /= 10;

        // if (num1 >= num2 && num1 >= num3) {
        //     if (num2 >= num3) {
        //         System.out.println("acending");
        //     } else {
        //         System.out.println("not");
        //     }
        // } else {
        //     System.out.println("not");
        // }

        // int n1 = 8, n2 = 4, n3 = 7;
        // if(n1 > n2 && n1 > n3){
        //     if(n2 > n3){
        //         System.out.println("decreasing");
        //     }else{
        //         System.out.println("unOrder");
        //     }
        // }else if(n3 > n1 && n3 > n2){
        //     if(n2 > n1){
        //         System.out.println("increasint");
        //     }else{
        //         System.out.println("unOrder");
        //     }
        // }else{
        //     System.out.println("unOrder");
        // }

        int n = -49;
        int num = n%10;

        if(n > 0){
            if(num < 5){
                n /= 10;
                n *= 10;
                System.out.println(n);
            }else{
                n = n + (10 - num);
                System.out.println(n);
            }
        }else{
            num = num*-1;
             if(num < 5){
                n /= 10;
                n *= 10;
                System.out.println(n);
            }else{
                n = n - (10 - num);
                System.out.println(n);
            }
        }
    }

}
