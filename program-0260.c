#include<stdio.h>

int CountEvenDigits(int iNo)
{
    int iDigit = 0;
    int iCnt = 0;

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        iNo = iNo / 10;
        if((iDigit % 2 )== 0)
        {
            iCnt++;
        }
    }

    return iCnt;

}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = CountEvenDigits(iValue);
    printf("The number of even digits are %d",iRet);

    return 0;
}

