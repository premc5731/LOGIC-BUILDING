#include<stdio.h>
#include<stdbool.h>

bool CheckPerfect(int iNo)
{
    int iCnt = 0;
    int iSum = 0;
    bool bResult = false;
    if(iNo < 0)  // updater
    {
        iNo = -iNo;
    }
    for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            iSum = iSum + iCnt;
        }
    }

    if( iSum == iNo)
    {
        bResult = true;
    }
    else
    {
        bResult = false;
    }
    return bResult;

}


int main()
{
    int iValue = 0;
    bool bRet = false;
    printf("Enter a number : ");
    scanf("%d",&iValue);

    bRet = CheckPerfect(iValue);

    if(bRet == true)
    {
        printf("%d is perfect number",iValue);
    }
    else
    {
        printf("%d is not a perfect number",iValue);
    }
    return 0;
}