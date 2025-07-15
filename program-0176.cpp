#include<iostream>
using namespace std;

template <class T>
T Addition(T No1, T No2)
{
    T Ans;

    Ans = No1 + No2;
    return Ans;
}
int main()
{
    float Ret, Value1, Value2;

    cout<<Addition(10,11)<<"\n";
    cout<<Addition(12.3f,15.6f)<<"\n";
    cout<<Addition(10.778,11.34)<<"\n";


    return 0;
}