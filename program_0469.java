
import java.util.*;
import java.io.*;

class program_0469
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of file which contains pack data : ");
            String PackName = sobj.nextLine();

            File fobj = new File(PackName);

            if(!fobj.exists())
            {
                System.out.println("Unable to access packed file");
                return;
            }

            System.out.println("Packed file get succesfully opened");
            FileInputStream fiobj = new FileInputStream(fobj);

        }
        catch(Exception eobj)
        {

        }
    }
}