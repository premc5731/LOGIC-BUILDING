#include<iostream>
using namespace std;

typedef unsigned int UINT; // this is done by compiler not by preprocessor

bool CheckBit(int iNo, UINT iPos)
{
    UINT iMask = 1;
    UINT iResult = 0;

    iMask = iMask << (iPos -1);

    iResult = iNo & iMask;

    return (iResult == iMask);
}

int main()
{
    UINT iValue = 0, iLocation = 0;
    bool bRet = false;

    cout<<"Enter number : \n";
    cin>>iValue;

    cout<<"Enter the position : \n";
    cin>>iLocation;

    bRet = CheckBit(iValue, iLocation);

    if(bRet == true)
    {
        cout<<"bit is ON at location "<<iLocation<< "\n";
    }
    else
    {
        cout<<"bit is OFF at location "<<iLocation<< "\n";
    }

    
    return 0;
}