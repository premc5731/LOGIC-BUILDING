import java .util.*;
import java.io.*;

class program_0438
{
    public static void main(String A[]) 
    {
        try
        {
            Scanner sobj = new Scanner(System.in);
            
            System.out.println("Enter the name of the file that you want to open");
            String Fname = sobj.nextLine();

            File fobj = new File(Fname);

            if(fobj.exists())
            {
                FileInputStream fiobj = new FileInputStream(fobj);
                byte arr[] = new byte[10];
                fiobj.read(arr);

                String str = new String(arr);

                System.out.println("Data from file is : "+str);

                
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
