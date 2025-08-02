
function SumFactors(ino) 
{
    let Sum = 0

    for (let i = 1; i <= (ino/2); i++) 
    {
        if(ino % i == 0)
        {
            Sum = Sum + i;
        }
    }
    return Sum
}

iRet = 0

Value1 = 12

iRet = SumFactors(Value1)

console.log("Summation of factors of 12 is : "+ iRet)

