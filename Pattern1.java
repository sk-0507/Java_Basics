class Pattern1
{
    public static void main(String []args)
    {
        int stop = 5;
        for(int r=1 ; r<=stop ; r++)
        {
            for(int c=1; c<=stop ; c++)
            {
               if(r==c || r+c==6 || r==1 || r==5 || c==1 || c==5 )
               {
                 System.out.print("* ");
               }
               else{
                 System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}