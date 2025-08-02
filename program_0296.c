// input : 4 #
// output : # # # #

// input : 5 &
// output : & & & & &

// input : 3 Z
// output : Z Z Z 

// Time complexity O(2N)
// N is natural number
// where N >= 0 and N<= infinity
#include<stdio.h>

void Display(int iNo,char ch)
{
    int iCnt = 0;
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    for(iCnt = 1; iCnt <= iNo;iCnt++)  // 2N
    {
        printf("%c \t",ch);
    }
    printf("\n");

}
int main()
{
    int iValue = 0;
    char cValue = '\0';

    printf("Enter frequency : ");
    scanf("%d",&iValue);

    fflush(stdin);  // this is another way of consuming enter after entering a number what happens is, it clears or flush the input buffer 
    printf("Enter character :  \n");
    scanf(" %c",&cValue); // here is the change
    // here whitespce before %c consumes all white space charcter including new line from input buffer before %c then it tconsumes character u entered 

    printf("Accepted chatacter is : %c \n",cValue);
    Display(iValue,cValue);

    return 0;
}

// if we want to combine then there must be condition 3 and 4 should be same 