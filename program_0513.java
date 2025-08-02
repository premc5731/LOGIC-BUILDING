
import java.util.*;

public class program_0513 
{
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        str = str.trim();

        str.replaceAll("  ", " ");
        System.out.println("Updated str : "+str);

    }

}
