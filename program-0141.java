import java.util.Scanner;


class NNumberX
{
    public int Arr[];

    public NNumberX(int iSize)
    {
        Arr = new int[iSize];  // resource allocation
    }

    public void Accept()
    {
        int iCnt = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements");

        for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
        {
            this.Arr[iCnt] = sobj.nextInt();
        }

    }

    public void Display()
    {
        int iCnt = 0;

        System.out.println("Elements of the array are : ");

        for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
        {
            System.out.println("element "+ (iCnt + 1) +": "+this.Arr[iCnt]);
        }

    }


    public int CountEven()
    {
        int iCntEven = 0,iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iCntEven++;
            }
        }

        return iCntEven;
    }
}
class program_219 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;

        System.out.println("Enter number of elements : ");
        int iSize = sobj.nextInt();

        NNumberX nobj = new NNumberX(iSize);

        nobj.Accept();
        
        nobj.Display();

        iRet = nobj.CountEven();

        System.out.println("Number of even numbers are : "+iRet);
        
        sobj = null;
    }
}

// Arr = null;
// sobj = null;
// we are assiging to null so that garbage collector will come and clean the resources
