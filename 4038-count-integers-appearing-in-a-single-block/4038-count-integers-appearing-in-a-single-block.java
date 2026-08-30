class Solution {
    public int countSpecialIntegers(int[] nums) {
        //cretae one 2d  array of 100 size and every index will store 2values
        int arr[][]= new int[101][2];
        // it will look like for ex index 1 left,right to values
        //arr[i][0]=left,i[i][1];
        // now loop
        //first store -1 in every where
        for(int i=0;i<arr.length;i++)
        {
            arr[i][0]=-1; //left =-1 first appearnce index of the vale
            arr[i][1]=-1; // right =-1 last appearing index the value

        }
        for(int i=0;i<nums.length;i++)
        {
            int value=nums[i];
            //if left is -1 then assign left as i
            if(arr[value][0]==-1)
            {
                arr[value][0]=i ;// assingned first appearnce
                arr[value][1]=i; // right also assingned 
                
            }
            else
            {
                arr[value][1]=i; // now only right will chnage
            }
        }
        //now compare left and right if diff then increse count
        int count=0;
        for(int i=1;i<arr.length;i++)
        {
            int left=arr[i][0];
            int right=arr[i][1];
          //now loop from left to right
          if(left!=-1)
          {
             boolean samevalue=true;
            for(int j=left;j<=right;j++)
            {
                if(nums[j]!=i) //diff value
                {
                    samevalue=false;
                    break;
                }   
            }
            if(samevalue)
             {
                    count=count+1;
            }
          }
          
        }
        return count;
    }
}