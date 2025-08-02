
function Summation(Brr) 
{
    let Sum = 0

    for (let i = 0; i < Brr.length; i++) 
    {
        Sum = Sum + Brr[i]
    }
    return Sum
}

iRet = 0
Arr = [11,21,51,101,111,121]

iRet = Summation(Arr)

console.log("Summation is : "+ iRet)

