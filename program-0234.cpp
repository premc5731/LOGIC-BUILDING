#include<iostream>
using namespace std;

// in this there are 2 constructors they are 
// default and parameter constructor

class ArrayX
{
    public:
        int *Arr;
        int iSize;

        ArrayX(int iLength = 5)
        {
            cout<<"Inside Constructor \n";
            iSize = iLength;
            Arr = new int[iSize];
        }

        ~ArrayX()
        {
            cout<<"Inside destructor \n";
            delete []Arr;
        }

        void Accept()
        {
            cout<<"Enter  the elements : \n";
            int iCnt = 0;
            for(iCnt = 0; iCnt < iSize; iCnt++)
            {
                cin>>Arr[iCnt];
            }
        }

        void Display()
        {
            cout<<"Elements of the array are : \n";
            int iCnt = 0;
            for(iCnt = 0; iCnt < iSize; iCnt++)
            {
                cout<<Arr[iCnt]<<"\n";
            }
        }

};

int main()
{
    ArrayX aobj(5);

    aobj.Accept();
    aobj.Display();

    return 0; 
}