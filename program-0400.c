#include<stdio.h>

int Addition()
{
    static int i = 1;
    static int iSum = 0;

    if(i <= 5)
    {
        iSum = iSum + i;
        i++;
        Addition();
    }

    return iSum;
}

int main()
{
    int iRet = 0;
    iRet = Addition();
    printf("Addition is : %d",iRet);
    return 0;
}