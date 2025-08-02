package PackerUnpacker;

import java.util.*;
import java.io.*;

public class Unpacker
{
    private String PackName;

    public Unpacker(String A)
    {
        this.PackName = A;
    }

    public int UnpackingActivity()
    {
        try
        {
            System.out.println("------------------------------------------------------");
            System.out.println("-----------------Marvellous Packer Unpacker-----------");
            System.out.println("------------------------------------------------------");
            System.out.println("-----------------UnPacking Activity---------------------");
            System.out.println("------------------------------------------------------");
            String Header = null;
            int FileSize = 0, iRet = 0, iCountFile = 0;
            File fobjnew = null;

            File fobj = new File(PackName);

            // If packed file is not present
            if(!fobj.exists())
            {
                System.out.println("Unable to access packed file");
                return -1;
            }

            System.out.println("Packed file get succesfully opened");
            FileInputStream fiobj = new FileInputStream(fobj);

            // buffer to read header
            byte HeaderBuffer [] = new byte[100];

            // Scan the packed file to extract the files from it
            while((iRet =fiobj.read(HeaderBuffer,0,100)) != -1)
            {
                // convert byte array to String
                Header = new String(HeaderBuffer);

                Header = Header.trim();

                // Tokenize the header into 2 parts
                String Tokens[] = Header.split(" ");

                fobjnew = new File(Tokens[0]);

                // create new file to extract
                fobjnew.createNewFile();

                FileSize = Integer.parseInt(Tokens[1]);

                // create new buffer to store files data
                byte Buffer[] = new byte[FileSize];

                FileOutputStream foobj = new FileOutputStream(fobjnew);

                // read the data from packed file
                fiobj.read(Buffer,0, FileSize);

                // write the data into extracted file
                foobj.write(Buffer, 0, FileSize);

                System.out.println("File Unpacked with name : "+Tokens[0]+" Having size : "+FileSize);
                iCountFile++;

                foobj.close();
            }// End of While

            System.out.println("------------------------------------------------------");
            System.out.println("-----------------statistical report-------------------");
            System.out.println("------------------------------------------------------");

            System.out.println("Total number of files unpacked : "+iCountFile);
            fiobj.close();

            System.out.println("------------------------------------------------------");
            System.out.println("-----------Thank you for using our application--------");
            System.out.println("------------------------------------------------------");

            
    
        }
        catch(Exception eobj)
        {

        }
        return 0;
    }
}