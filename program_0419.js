
function Maximum(Brr) 
{
    let Max = Brr[0]

    for (let i = 1; i < Brr.length; i++) 
    {
        if(Brr[i] > Max)
        {
            Max = Brr[i]
        }
    }
    return Max
}

iRet = 0

Arr = [11,21,931,101,111,121]

iRet = Maximum(Arr)

console.log("Maximum number is : "+ iRet)

