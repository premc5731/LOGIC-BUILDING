import java .util.*;
import java.io.*;

class program_0437
{
    public static void main(String A[]) 
    {
        try
        {
            Scanner sobj = new Scanner(System.in);
            
            System.out.println("Enter the name of the file that you want to create");
            String Fname = sobj.nextLine();

            File fobj = new File(Fname);

            if(fobj.exists())
            {
                FileOutputStream foobj = new FileOutputStream(fobj);
                String str = "Jay Ganesh...";
                byte arr[] = str.getBytes();

                foobj.write(arr);
            }
            else
            {
                System.out.println("File not present in current directory");
                return;
            }
        }
        catch(IOException iobj)
        {

        }
        catch(Exception eobj)
        {

        }
        
    }
}
