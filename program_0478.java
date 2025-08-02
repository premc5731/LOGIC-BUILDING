import MarvellousPackerUnpacker.MarvellousUnpacker;

import java.util.*;
import java.io.*;

class program_0478
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of file which contains pack data : ");
            String PackName = sobj.nextLine();

            MarvellousUnpacker mobj = new MarvellousUnpacker(PackName);

            mobj.UnpackingActivity();

        }
        catch(Exception eobj)
        {

        }
    }
}