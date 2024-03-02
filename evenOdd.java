import java.util.*;
class evenOdd
{
    //Function / method that print wheather given no is even or odd
    public static void checkEvenOdd (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Number is even"); 
        }
        else
        {
            System.out.println("Number is odd ");
        }
    }
    //function or method that print range of even or odd
    public static void evenOddRange(){
        Scanner s2 = new Scanner(System.in);
        System.out.println("---Enter option--- \n1)for Positive 'P' \n2)for Negative 'N'");
        char ch = s2.next().charAt(0);
        switch(ch){
            case ('P'):
               Scanner s1 = new Scanner(System.in);
               System.out.println("***Enter the initial and terminal range**** ");
               System.out.print("From :");
               int start = s1.nextInt();
               System.out.print("To :");
               int end = s1.nextInt();
               System.out.println("Even numbers are:- ");
               for(int i=start;i<=end;i++)
               {
                if(i%2==0)
                {
                    System.out.print(i+" ");
                }
               }  
                System.out.println();
                System.out.println("Odd numbers are:- ");
               for(int i=start;i<=end;i++)
               {
                if(i%2!=0)
                {
                    System.out.print(i+" ");
                }
               }  
            break;
            case ('N'):
               Scanner s3 = new Scanner(System.in);
               System.out.println("***Enter the initial and terminal range**** ");
               System.out.print("From :");
               int s = s3.nextInt();
               System.out.print("To :");
               int e = s3.nextInt();
               System.out.println("Even numbers are:- ");
               for(int i=s;i>=e;i--)
               {
                if(i%2==0)
                {
                    System.out.print(i+" ");
                }
               }  
                System.out.println();
                System.out.println("Odd numbers are:- ");
               for(int i=s;i>=e;i--)
               {
                if(i%2!=0)
                {
                    System.out.print(i+" ");
                }
               }   
            break;    
            default : System.out.println("Please enter valid option!!!");
            break;   

        }
    }
    //main function
    public static void main(String[] args)
    {
         Scanner op = new Scanner(System.in);
         System.out.println("***Enter the option given below***\n1)For range of even or odd\n2)For check number is odd or even");
         int n = op.nextInt();
         switch(n){
            case 1:
                evenOddRange();
            break;
            case 2:
                checkEvenOdd();
            break;
            default:System.out.println("Please enter valid option!!!");
            break;   

         }
    }
}

 