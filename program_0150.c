#include<stdio.h>
#include<unistd.h> // used for system calls
#include<stdlib.h>


int main()
{
    int fd = 0;
    char Fname[20] = {'\0'};

    printf("Enter the name of file : ");
    scanf("%s",Fname);

    fd = creat(Fname,0777);
    if(fd == -1)
    {
        printf("Unable to create file \n");
        return -1;
    }

    printf("File is sucessfully created with FD %d",fd);


    return 0;
}