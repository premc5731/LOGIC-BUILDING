#include<iostream>
using namespace std;

typedef unsigned int UINT; // this is done by compiler not by preprocessor

// offing the 4th and 7th bit
UINT OffBitMultiple(UINT iNo)
{
    UINT iMask1 = 1;
    UINT iMask2 = 1;
    UINT iResult = 0;

    iMask1 = iMask1 << 3;
    iMask2 = iMask2 << 6;

    iMask1 = ~iMask1;
    iMask2 = ~iMask2;

    iResult = iNo & (iMask1 & iMask2); // 4 & 7

    return iResult;
}

int main()
{
    UINT iValue = 0,iRet = 0;

    cout<<"Enter number : \n";
    cin>>iValue;

    iRet = OffBitMultiple(iValue);

    cout<<"Updated number : "<<iRet<<"\n";    
    return 0;
}