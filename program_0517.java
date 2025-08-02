
import java.util.*;

public class program_0517
{
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");
        // \\s+ means here \\s -> white space
        // + -> one or more 
        System.out.println("Updated str : "+str);

    }

}

