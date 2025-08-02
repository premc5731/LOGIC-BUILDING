
import java.util.*;

public class program_0519
{
    public static void main(String A[]) {
        int iCount = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");
        // \\s+ means here \\s -> white space
        // + -> one or more 

        String tokens[] = str.split(" ");
        System.out.println("Number of words are : "+tokens.length);

    }

}

