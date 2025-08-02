#include<stdio.h>
#include<stdbool.h>

bool CheckEven(int iNo)
{
    return ((iNo % 2) == 0);

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