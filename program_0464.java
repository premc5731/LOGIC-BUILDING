import java.util.*;
import java.io.*;

class program_0464
{
    public static void main(String A[])
    {
        try
        {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the name of Directory that you want to pack : ");
        String DirName = sobj.nextLine();

        System.out.println("Enter the name of file that you want to create for packing : ");
        String PackName = sobj.nextLine();

        File PackObj = new File(PackName);
        boolean bRet = PackObj.createNewFile();

        if(bRet == false)
        {
            System.out.println("Unable to create packfile");
            return;
        }


        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Directory is present");

            File Arr[] = fobj.listFiles();
            
            System.out.println("Number of files in the directory are : "+Arr.length);

            int i = 0, j = 0, iRet = 0;

            // packed file object
            FileOutputStream foobj = new FileOutputStream(PackObj);

            // buffer for read and write activity
            byte Buffer[] = new byte[1024];

            String Header = null;

            // Directory traversal
            for(i = 0; i < Arr.length; i++)
            {
                Header = Arr[i].getName() + " " + Arr[i].length();

                // loop to form 100 bytes header
                for(j = Header.length(); j < 100; j++)
                {
                    Header = Header + " ";
                }

                // write header into pack file
                foobj.write(Header.getBytes());

            }
            System.out.println("Packing activity done...");
        }
        else
        {
            System.out.println("There is no such directory");
        }
        }
        catch(Exception eobj)
        {

        }
    }
}