import java.util.Scanner;
class Nivan
{
    public static void main(String []args){
        Scanner sc  =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum =0,temp = num;
        while(num != 0){
            int d = num%10;
            sum = sum + d;
            num = num/10;
        }
        if(temp%sum==0)
        {
            System.out.print("It is Nivan number ");
        }else{
            System.out.print("It is not Nivan number");
        }
        
    }
}