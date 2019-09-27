 class ReverseASentence{
    char[] reverseAWord(char[] sent,int start,int end)
    {
        while(start<end)
        {
            char temp=sent[start];
            sent[start]=sent[end];
            sent[end]=temp;
            start++;
            end--;
        }
        return sent;
    }  
    String reverse(char[] sent)
    {   //considering 100 to be default value for int as it wont accept null
        int s=100,e=100;
        for(int i=0;i<sent.length;i++)
        {
            if(s==100&&sent[i]!=' ')
                s=i;
            if(sent[i]==' ')
                e=i-1;
            if(s!=100&&e!=100)
            {
                reverseAWord(sent,s,e);
                s=100;
                e=100;
            }
        }
        if(s!=100&&e==100)
        {
            reverseAWord(sent,s,sent.length-1);
        }    
    reverseAWord(sent,0,sent.length-1);
    return String.valueOf(sent);
    }
}
public class Main
{
	public static void main(String[] args) {
	    ReverseASentence r=new ReverseASentence();
		String sentence = "i love california";
		char[] sent = sentence.toCharArray();
		System.out.println(""+r.reverse(sent));
	}
}
