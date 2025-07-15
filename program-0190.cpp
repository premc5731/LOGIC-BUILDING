#include<iostream>
using namespace std;

int CountZeros(int iNo)
{
    int iDigit = 0, iCount = 0;

    while(iNo != 0)
    {
        iDigit = iNo % 2;
        if(iDigit == 0)
        {
            iCount++;
        }
        iNo = iNo / 2;
    }

    return iCount;
}

int main()
{
    int iValue = 0,iRet = 0;
    cout<<"Enter number : \n";
    cin>>iValue;
    iRet = CountZeros(iValue);
    cout<<"Number of zeros are : "<<iRet<<"\n";

    return 0;
}