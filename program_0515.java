
import java.util.*;

public class program_0515
{
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("a", "x");
        System.out.println("Updated str : "+str);

    }

}
