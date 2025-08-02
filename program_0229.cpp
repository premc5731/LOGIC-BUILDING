#include<iostream>
using namespace std;


int Maximum(int Arr[], int iSize)
{
    int iMax = 0, iCnt = 0;

    iMax = Arr[0];

    for(iCnt = 1; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] > iMax)
        {
            iMax = Arr[iCnt];
        }
    }

    return iMax;
}
int main()
{
    int *ptr = NULL;
    int iLength = 0, iCnt = 0,iRet;

    cout<<"Enter number of elements \n";
    cin>>iLength;

    ptr = new int[iLength];

    cout<<"Enter the elements : \n";

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        cin>>ptr[iCnt];
    }

    cout<<"Elements of the array are : \n";

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        cout<<ptr[iCnt]<<"\n";
    }

    iRet = Maximum(ptr, iLength);

    cout<<"Maximum element is : "<<iRet<<"\n";

    delete []ptr;

    return 0; 
}