#include<stdio.h>
#include<fcntl.h>
#include<stdlib.h>
#include<unistd.h>
#include<string.h>

int main()
{
    char Fname[50] = {'\0'};
    int fd = 0,iRet = 0;
    char Buffer[50] = {'\0'};


    printf("Enter the file name : \n");
    scanf("%s",Fname);

    fd = open(Fname, O_RDONLY);  // change 

    if(fd == -1)
    {
        printf("Unable to open file");
    }
    else
    {
        printf("File is sucessfully opened with fd : %d \n",fd);
        
        iRet = read(fd,Buffer,11);
        
        printf("%d bytes get read sucessfully \n",iRet);
        close(fd);
        printf("Data from file is : %s \n",Buffer);

    }

    return 0;

}

