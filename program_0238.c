#include <stdio.h>
#define ERR_INVALID -1
unsigned long Factorial(unsigned int No1)
{
    int iCnt = 0;
    unsigned long iFact = 1;

    if (No1 < 0)
    {
        return ERR_INVALID;
    }

    iCnt = 1;
    while(iCnt <= No1)
    {
        iFact = iFact * iCnt;
        iCnt++;
    }
    return iFact;
}

int main()
{
    unsigned int iValue = 0;
    unsigned long iRet = 0;
    printf("Enter a Number : ");
    scanf("%u", &iValue);

    iRet = Factorial(iValue);
    if( iRet == -1)
    {
        printf("Invalid input \n");
    }
    else
    {
    printf("Factorial is : %lu", iRet);
    }

    return 0;
}