
  
import java.util.*;
class IntersectionBetweenThreeArrays
{
    int[] theIntersectArray(int[] arr1,int[] arr2,int[] arr3)
    {
        int numberofIntersection=0,count=0;
        HashMap<Integer,Boolean> hm2=new HashMap<Integer,Boolean>();
        for(int i=0;i<arr2.length;i++)
        {
            if(hm2.containsKey(arr2[i])==false)
            {
                hm2.put(arr2[i],true);
            }
        }
        HashMap<Integer,Boolean> hm3=new HashMap<Integer,Boolean>();
        for(int i=0;i<arr3.length;i++)
        {
            if(hm3.containsKey(arr3[i])==false)
                hm3.put(arr3[i],true);
        }
        for(int j=0;j<arr1.length;j++)
        {
             if(hm2.containsKey(arr1[j])==true)
             {  
                 hm2.put(arr1[j],false);
            }
        }
        for(int j=0;j<arr2.length;j++)
        {
             if(hm3.containsKey(arr2[j])==true&&hm2.get(arr2[j])==false)
             {  
                 numberofIntersection++;
                 hm3.put(arr2[j],false);
            }
        }
        int[] intersect=new int[numberofIntersection];
        for(int j=0;j<arr3.length;j++)
        {
             if(hm3.get(arr3[j])==false)
             {  
                 intersect[count++]=arr3[j];
            }
        }
        return intersect;
    }
}
public class Main{
	public static void main(String[] args) 
	{
	    int[] arr1 = new int[]{1,3,5,3,0};
	    int[] arr2 = new int[]{0,5,3,3,13,10};
	    int[] arr3 = new int[]{3,7,11,5,3,0,9};
	    IntersectionBetweenThreeArrays i=new IntersectionBetweenThreeArrays();
	    int[] theIntersect=i.theIntersectArray(arr1,arr2,arr3);
	    for(int k=0;k<theIntersect.length;k++)
	    System.out.println(theIntersect[k]+" ");
	}
}
