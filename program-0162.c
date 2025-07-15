#include <stdio.h>
#include <fcntl.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

int main()
{
    char Fname[50] = {'\0'};
    int fd = 0, iRet = 0;
    char Buffer[50] = {'\0'};

    printf("Enter the file name : \n");
    scanf("%s", Fname);

    fd = open(Fname, O_RDONLY); 

    if (fd == -1)
    {
        printf("Unable to open file");
    }
    else
    {
        printf("File is sucessfully opened with fd : %d \n", fd);

        while((iRet = read(fd,Buffer,10)) != 0) // change
        {
            printf("%s",Buffer);
        }
    }

    return 0;
}
