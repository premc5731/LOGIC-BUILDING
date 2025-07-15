#include<stdio.h>
#include<fcntl.h>
#include<stdlib.h>
#include<unistd.h>

int main()
{
    char Fname[50] = {'\0'};
    int fd = 0,iRet = 0;
    char Buffer[] = "India is my country";


    printf("Enter the file name : \n");
    scanf("%s",Fname);

    fd = open(Fname,O_RDWR);

    if(fd == -1)
    {
        printf("Unable to open file");
    }
    else
    {
        printf("File is sucessfully opened with fd : %d \n",fd);
        
        iRet = write(fd,Buffer,11);
        
        printf("%d bytes get written sucessfully",iRet);
        close(fd);
        

    }


    return 0;

}

