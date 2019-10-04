import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int first,sum=0,valley=0,mountain=0;
        char[] ch=s.toCharArray();
        first=assignValue(ch[0]);
        for(int i=0;i<n;i++)
        {
            sum=sum+assignValue(ch[i]);
            if(sum==0&&first==-1)
                {
                valley++;
                
                }
            else if(sum==0&&first==1)
                {
                mountain++;
                }
            if(sum==0&&i+1<n)
                first=assignValue(ch[i+1]);
        }
        return valley;      
    }
    static int assignValue(char a)
    {
        int i=0;
        if(a=='U')
        i=1;
        else if (a=='D')
        i=-1;
        return i;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
