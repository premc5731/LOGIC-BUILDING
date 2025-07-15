#include<iostream>
using namespace std;

#define INT_MIN -2147483647



int SecondLargest(int Arr[], int iSize)
{
    int first_largest = INT_MIN; 
    int second_largest = INT_MIN; 
    int iCnt = 0;

    first_largest = Arr[0];

    for(iCnt = 1; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] > first_largest)
        {
            second_largest = first_largest;
            first_largest = Arr[iCnt];
        }
        else if( (Arr[iCnt] > second_largest) && (Arr[iCnt] < first_largest) )
        {
            second_largest = Arr[iCnt];
        }
    }


    if(second_largest != INT_MIN)
    {
        return second_largest;
    }
    
    return -1;

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

    iRet = SecondLargest(ptr, iLength);

    cout<<"SecondLargest element is : "<<iRet<<"\n";

    delete []ptr;

    return 0; 
}