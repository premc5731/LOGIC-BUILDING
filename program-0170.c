#include <stdio.h>
#include <fcntl.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

#define BUFFER_SIZE 1024  // user defined macro

int main()
{
    char Fname[50] = {'\0'};
    int fd = 0, iRet = 0,iCnt = 0;
    char Buffer[BUFFER_SIZE] = {'\0'};  

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

        while((iRet = read(fd,Buffer,BUFFER_SIZE)) != 0) 
        {
            for(iCnt = 0; iCnt < iRet; iCnt++)
            {
                printf("%c\n",Buffer[iCnt]);
            }
            memset(Buffer,'\0', BUFFER_SIZE); // cleaning buffer memory set
        }

    }

    return 0;
}
