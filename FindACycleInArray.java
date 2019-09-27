
 class FindACycleInArray{
     boolean isACycle(int[] arr)
    {
        int p=0,q=0;
        while(true)
        {
            try{
                if(q>arr.length||p>arr.length||p<0||q<0)
                    return false;
                q=arr[q];
                if(q==p)
                    return true;
                if(q>arr.length||q<0)
                    return false;
                q=arr[q];
                if(q==p)
                    return true;
                p=arr[p];
                if(p>arr.length||p<0)
                    return false;
                if(q==p)
                    return true;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                return false;
            }
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    FindACycleInArray f=new FindACycleInArray();
		int[] arr = new int[]{1,2,4,5,7,6,3,8};
		if(f.isACycle(arr)==true)
		System.out.println(""+f.isACycle(arr));
		else
		System.out.println("No Cycle Found");
	}
}
