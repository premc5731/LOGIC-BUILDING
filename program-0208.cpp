#include<iostream>
using namespace std;

typedef unsigned int UINT; // this is done by compiler not by preprocessor

// if 7th bit is on then make it off if off no change
// 7TH BIT CHECKING 
UINT ChangeBit(int iNo)
{
    UINT iMask = 4294967231;
    UINT iResult = 0;

    iResult = iNo & iMask;

    return iResult;
}

int main()
{
    UINT iValue = 0, iRet = 0;

    cout<<"Enter number : \n";
    cin>>iValue;

    iRet = ChangeBit(iValue);

    cout<<"Updated number is : "<<iRet<<"\n";
    
    return 0;
}