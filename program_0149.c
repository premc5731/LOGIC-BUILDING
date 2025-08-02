#include<stdio.h>
#include<unistd.h> // used for system calls
#include<stdlib.h>


int main()
{
    int fd = 0;
    char Fname[20] = {'\0'};

    printf("Enter the name of fil : ");
    scanf("%s",Fname);

    fd = creat(Fname,0777);

    return 0;
}