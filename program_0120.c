#include<stdio.h>
#include<stdbool.h>

bool CheckEven(int iNo)
{
    bool bResult = false;

    if((iNo % 2) == 0) // if it is divisible by 2 then it is even
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
    printf("Enter a Number : ");
    scanf("%d",&iValue);
    bool bRet = false;

    bRet = CheckEven(iValue);

    if(bRet == true)
    {
        printf("%d is Even number\n",iValue);
    }
    else
    {
        printf("%d is Odd number",iValue);
    }

    return 0;
}