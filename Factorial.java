import java.util.Scanner;
class Factorial{
    public static void main(String []argrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = 1 ; i <= num ; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}