#include<iostream>
using namespace std;

typedef unsigned int UINT; // this is done by compiler not by preprocessor

UINT ChangeBit(int iNo, UINT iPos)
{
    UINT iMask = 1;
    UINT iResult = 0;

    iMask = iMask << (iPos -1);
    iMask = ~iMask;

    iResult = iNo & iMask;

    return iResult;
}

int main()
{
    UINT iValue = 0, iLocation = 0,iRet = 0;

    cout<<"Enter number : \n";
    cin>>iValue;

    cout<<"Enter the position : \n";
    cin>>iLocation;

    iRet = ChangeBit(iValue, iLocation);

    cout<<"Updated number : "<<iRet<<"\n";    
    return 0;
}