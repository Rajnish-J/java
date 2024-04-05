class Pattern
{
    public static void main(String[] args) 
    { 
                 int row = 4;
                 int value = 1;
                 for(int i=1;i<=row;i++)
                {
                     for(int j=0;j<i;j++)
                    { 
                       System.out.print(value+" ");
                       value++;         
                    }
                    System.out.println();
                }
    }     
}