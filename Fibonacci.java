import java.util.Scanner;
class Fibonacci
{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int a = 0 , b = 1;
        System.out.print(a+" "+b+" ");
        for(int i = 1 ; i<= num-2 ; i++){
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}