import java.util.*;


class Solution{
    int[] twoSum(int[] arr,int sum)
    {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int[] arr1=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i])==true)
            {
                arr1[0]=arr[i];
                arr1[1]=hm.get(arr[i]);
            }
            else
            {
                hm.put(sum-arr[i],arr[i]);
            }
        }
        return arr1;
    }
}
class Main{
     public static void main(String []args)
     {
        int[] arr = new int[]{2,4,1,9,7};
        int sum=9;
        Solution t=new Solution();
        int[] arr3=new int[2];
        arr3=t.twoSum(arr,sum);
        System.out.println("["+arr3[0]+","+arr3[1]+"]");
     }
}
