class Test {

  
    static private int SecondSmallest(int arr[],int n)
    {
      if(n<2)
      {
        return -1;
      }
      int small=Integer.MAX_VALUE;
      int secondsmall=Integer.MAX_VALUE;
      for (int i=0;i<n;i++)
        {
          if(arr[i]<small)
          {
            secondsmall=small;
            small=arr[i];
          }
          else if (arr[i]<secondsmall && arr[i]!=small)
            {
            secondsmall=arr[i];
          }
        }
      return secondsmall;
    }

    static private int SecondLargest(int arr[],int n)
    {
      if(n<2)
      {
        return -1;
      }
      int large=Integer.MIN_VALUE;
      int secondlarge=Integer.MIN_VALUE;
      for (int i=0;i<n;i++)
        {
          if(arr[i]>large)
          {
            secondlarge=large;
            large=arr[i];
          }
          else if (arr[i]>secondlarge && arr[i]!=large)
            {
            secondlarge=arr[i];
          }
        }
      return secondlarge;
    }
    public static void main(String[] args)
    {
      int arr[]={31,14,25,21,31,30};
      int n=arr.length;
      System.out.println("Second Smallest element in an Array is " +(SecondSmallest(arr,n)));
      System.out.println("Second Largest element in an Array is " +(SecondLargest(arr,n)));
      
        }
  }
      
    
            
