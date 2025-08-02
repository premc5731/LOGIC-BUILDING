import java.util.*;
import java.io.*;

class MarvellousPacker
{
    private String PackName;
    private String DirName;

    public MarvellousPacker(String A, String B)
    {
        this.PackName = A;
        this.DirName = B;
    }

    public void PackingActivity()
    {
        try
        {
        System.out.println("------------------------------------------------------");
        System.out.println("-----------------Marvellous Packer Unpacker-----------");
        System.out.println("------------------------------------------------------");
        System.out.println("-----------------Packing Activity---------------------");
        System.out.println("------------------------------------------------------");

        int i = 0, j = 0, iRet = 0, iCountFile = 0;
        
        File fobj = new File(DirName);

        // Check the existence of the directory
        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println(DirName + "is succesfully opened");

            File PackObj = new File(PackName);

            // Create a packed file
            boolean bRet = PackObj.createNewFile();

            if(bRet == false)
            {
                System.out.println("Unable to create packfile");
                return;
            }

            System.out.println("Packed file get succesfully created with name : "+PackName);

            // Retrive all files from directory
            File Arr[] = fobj.listFiles();

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

                // open file from directory for reading
                FileInputStream fiobj = new FileInputStream(Arr[i]);

                // write contents into packfile
                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer,0,iRet);
                    System.out.println("Filename scanned : "+Arr[i]);
                    System.out.println("Filesize read is : "+iRet);
                }
                fiobj.close();

                iCountFile++;
            }
            System.out.println("Packing activity done...");

            System.out.println("------------------------------------------------------");
            System.out.println("-----------------statistical report-------------------");
            System.out.println("------------------------------------------------------");

            // to be add
            System.out.println("Total files packed : "+iCountFile);

            System.out.println("------------------------------------------------------");
            System.out.println("-----------Thank you for using our application--------");
            System.out.println("------------------------------------------------------");
        }
        else
        {
            System.out.println("There is no such directory");
        }
        }// End of try
        catch(Exception eobj)
        {}
    }// End of packingActivity function
}// End of MarvellousPacker class

class program_0467
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

            MarvellousPacker mobj = new MarvellousPacker(PackName, DirName);

            mobj.PackingActivity();
        }
        catch(Exception eobj)
        {

        }
    }// End of main
}// End of class