
public class Recursive_Fibonacci {

    static int f(int n){


        if (n==1 || n==2){

            return 1;

        }

        int result = f(n-1) + f(n-2)  ;



        return result;
    }

    public static void main(String[] args) {


        for (int i =1;i<=10;i++)

           System.out.println(f(i));

    }
}
