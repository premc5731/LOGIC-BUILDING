import java .util.*;
import java.io.*;

class program_0433
{
    public static void main(String A[]) 
    {
        try
        {
            File fobj = new File("PPA.txt");

            if(fobj.exists())
            {
                System.out.println("File already exist...");
            }
            else
            {
                fobj.createNewFile();
                System.out.println("Files successfully created...");
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
