/////////////////////////////////////////////////////////
//
//  File name   : program_2.c
//  Description : used to calculate percentage 
//  Author      : prem
//  Date        : 28/04/2025
//
/////////////////////////////////////////////////////////

#include<stdio.h>

int main()
{
    int Total = 0;
    int Obtained = 0;
    float Percentage = 0.0f;

    printf("Enter the Total marks : \n");
    scanf("%d",&Total);

    printf("Enter the Obtained marks : \n");
    scanf("%d",&Obtained);

    Percentage = ((float)Obtained / (float)Total) * 100;

    printf("Percentage is : %.2f%%  \n",Percentage);

    return 0;
}