#include<stdio.h>
#define ERR_INVALID_AGE -1

int CalculateTicket(int iAge)
{
    if((iAge < 0))
    {
        return ERR_INVALID_AGE;
    }
    if((iAge >=0) && (iAge <=5))
    {
        return 0;
    }
    else if((iAge > 5) && (iAge <=18))
    {
        return 700;
    }
    else if((iAge > 18) && (iAge <=50))
    {
        return 999;
    }
    else if(iAge >= 50)
    {
        return 500;
    }
    
}
int main()
{
    int iAge = 0;
    int iRet = 0;

    printf("Enter your iAge : ");
    scanf("%d",&iAge);

    iRet = CalculateTicket(iAge);
    printf("Your ticket price is %d \n",iRet);

    return 0;

}