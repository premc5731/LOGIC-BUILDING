#include<stdio.h>
#include<unistd.h> // used for system calls
#include<stdlib.h>


int main()
{
    int fd = 0;

    fd = creat("Demo.txt",0777);

    return 0;
}