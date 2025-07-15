#include <stdio.h>
#define ERR_INVALID -1
int Factorial(int No1)
{
    int iCnt = 0;
    int iFact = 1;

    if (No1 < 0)
    {
        return ERR_INVALID;
    }

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
    if( iRet == -1)
    {
        printf("Invalid input \n");
    }
    else
    {
    printf("Factorial is : %d", iRet);
    }

    return 0;
}