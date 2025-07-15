#include <stdio.h>

int Factorial(int No1)
{
    int iCnt = 0;
    int iFact = 1;

    for (iCnt = 1; iCnt <= No1; iCnt++)
    {
        iFact = iFact * iCnt;
    }
    return iFact;
}

int main()
{
    int iValue = 0;
    int iRet = 0;
    printf("Enter a Number : ");
    scanf("%d", &iValue);

    iRet = Factorial(iValue);
    printf("Factorial is : %d", iRet);

    return 0;
}