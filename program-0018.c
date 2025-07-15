#include<stdio.h>

int Calculate(int iNo)
{
    int iCnt =0,iSum =0;
    for(iCnt = 1;iCnt <= iNo;iCnt++)
    {
        iSum = iSum + iCnt;
    }
    return iSum;
}

int main()
{
    int iValue = 0;
    printf("Enter the number : \n");
    scanf("%d",&iValue);

    int iRet = 0;
    iRet = Calculate(iValue);
    printf("The summation is : %d",iRet);
    return 0;
}