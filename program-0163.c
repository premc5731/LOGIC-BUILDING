#include <stdio.h>

int Summation(int No1)
{
    int iCnt = 0;
    int iSum = 0;

    for (iCnt = 1; iCnt <= No1; iCnt++)
    {
        iSum = iSum + iCnt;
    }
    return iSum;
}

int main()
{
    int iValue = 0;
    int iRet = 0;
    printf("Enter a Number : ");
    scanf("%d", &iValue);

    iRet = Summation(iValue);
    printf("Summation is : %d", iRet);

    return 0;
}