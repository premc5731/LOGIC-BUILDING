#include<iostream>
using namespace std;

bool CheckBit(int iNo)
{
    // 0000 0100 0000 0000 0000 0000 0000 0000

    unsigned int iMask = 0x04000000; // 27th bit ON
    unsigned int iResult = 0;

    iResult = iNo & iMask;

    return iResult == iMask;
}

int main()
{
    unsigned int iValue = 0;
    bool bRet = false;

    cout<<"Enter number : \n";
    cin>>iValue;

    bRet = CheckBit(iValue);

    if(bRet == true)
    {
        cout<<"27th bit is ON \n";
    }
    else
    {
        cout<<"27th bit is OFF \n";
    }

    
    return 0;
}