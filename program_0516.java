
import java.util.*;

public class program_0516
{
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("  ", " ");
        System.out.println("Updated str : "+str);

    }

}
