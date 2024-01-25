class Leader
{
    public static void main(String[] args) 
    {    int [] arr={11,10,3,9,1,7,8,2};
        for(int i=0;i<=arr.length-1;i++)
        {   
           int j=1;
           int leader=arr[i];
            for(j=i+1;j<=arr.length-1;  j++)
            {
                if(arr[i]>arr[j])
                {
                 
                }
                else
                {
                    break;
                }
            }
            if(j==arr.length)
                System.out.println(arr[i]+" is LEADER");      
        }
     }  
}     
