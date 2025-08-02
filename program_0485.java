
import java.util.*;

class program_0485
{
    public static void main( String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sobj.nextLine();

        String iRet = str.replaceAll("a", "A");

        System.out.println(iRet);
    }
}