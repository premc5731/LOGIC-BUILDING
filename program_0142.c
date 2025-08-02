#include<stdio.h>
#include<stdbool.h>

bool CheckDivisible(int iNo)
{
    if((iNo % 5) == 0)  
    {
        return true;
    }
    else
    {
        return false;
    }

}

int main()
{
    int iValue = 0;
    printf("Enter a Number : ");
    scanf("%d",&iValue);
    bool bRet = false;

    bRet = CheckDivisible(iValue);

    if(bRet == true)
    {
        printf("%d is divisible by 5\n",iValue);
    }
    else
    {
        printf("%d is not divisible by 5",iValue);
    }

    return 0;
}