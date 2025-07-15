#include <stdio.h>
#define ERR_INVALID_AGE -1

int CalculateTicket(int iAge)
{
    int iPrice = 0;
    if ((iAge < 0))
    {
        return ERR_INVALID_AGE;
    }
    if ((iAge >= 0) && (iAge <= 5))
    {
        iPrice = 0;
    }
    else if ((iAge > 5) && (iAge <= 18))
    {
        iPrice = 700;
    }
    else if ((iAge > 18) && (iAge <= 50))
    {
        iPrice = 999;
    }
    else if (iAge >= 50)
    {
        iPrice = 500;
    }
    return iPrice;
}
int main()
{
    int iAge = 0;
    int iRet = 0;

    printf("Enter your iAge : ");
    scanf("%d", &iAge);

    iRet = CalculateTicket(iAge);
    if (iRet == ERR_INVALID_AGE)
    {
        printf("Unable to calculate the ticket price as age is inavalid");
    }
    else
    {
        printf("Your ticket price is %d \n", iRet);
    }

    return 0;
}