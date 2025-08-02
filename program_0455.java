
import java.util.*;
import java.io.*;

class program_0455
{
    public static void main(String A[])
    {
        try
        {
        String Header = "PPA.txt 30";

        int i = 0;
        System.out.println("Header size before update is : "+Header.length());
        for(i = Header.length(); i < 100; i++)
        {
            Header = Header + " ";
        }
        System.out.println("Header size after update is : "+Header.length());
        System.out.println("Updated header is : "+Header);

        Header = Header.trim();
        System.out.println("Header size after trim is : "+Header.length());
        System.out.println("Updated header after trim is : "+Header);


        }
        catch(Exception eobj)
        {

        }
    }
}