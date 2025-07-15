#include<stdio.h>
// this is wrong code it goes into infinite recursion

void Display()
{
    int i = 0;

    printf("Jay Ganesh... : %d \n",i);

    i++;

    Display();
}

int main()
{
    Display();
    return 0;
}