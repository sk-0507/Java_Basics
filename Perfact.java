import java.util.*;
class Perfact{
    //check perfact number
     
    public static void checkPerfact(){
        
         
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number : ");
            int num = sc.nextInt();
            int sum=0;
            for(int i = 1 ;i< num ; i++){
                if(num%i==0){
                    sum=sum+i;
                }
            }
            if(sum == num){
                System.out.print("Perfact Number");
            }
            else
            {
                System.out.print("Not a Perfact Number");
            }
        }
    }
    //range of perfact number
    public static void rangePerfact(){
        try (Scanner s1 = new Scanner(System.in)) {
            System.out.print("---Enter the Range---\n");
            System.out.print("From: ");
            int start = s1.nextInt();
            System.out.print("Upto: ");
            int end = s1.nextInt();
            System.out.print("The perfect numbers are : ");
            for(int i=start ; i<=end ; i++){
                int sum =0;
                for(int j=start ; j<i ;j++){
                    if(i%j==0){
                        sum =sum+j;
                    }
                     

                }
                if(sum==i){
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static void main(String []args){
        
       try (Scanner cs = new Scanner(System.in)) {
        System.out.println("---Enter the option---");
           System.out.print("1)For check number is perfect or not\n2)For the range of perfect number\n");
           int n = cs.nextInt();
           switch(n){
            case 1:checkPerfact();
            break;
            case 2:rangePerfact();
            break;
            default:System.out.print("Enter valid option ");
            break;

           }
    }
    }
}