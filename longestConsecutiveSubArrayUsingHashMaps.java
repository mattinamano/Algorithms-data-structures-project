/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
  
import java.util.*;
class LongestSubArray
{
    int longestSubArray(int[] arr)
    {
        int curr,longestsub=0,count=0;
        HashMap<Integer,Boolean> hm=new HashMap<Integer,Boolean>();
        for(int i=0;i<arr.length;i++)
        {
             hm.put(arr[i],true);
        }
        for(int j=0;j<arr.length;j++)
        {
             if(hm.containsKey(arr[j]-1)==false)
             {  
                 curr=arr[j];
                 count=1;
                 while(hm.containsKey(curr+1)==true)
                 {
                     count++;
                     curr++;
                 }
             }
             longestsub=Math.max(longestsub,count);
        }
        return longestsub;
    }
}
public class Main{
	public static void main(String[] args) 
	{
	    int[] arr = new int[]{2,4,1,9,3,5};
	    LongestSubArray l=new LongestSubArray();
	    int longestConsSubArray=l.longestSubArray(arr);
	    System.out.println(longestConsSubArray);
	}
}
