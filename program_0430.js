function CountSmall(Arr)
{
    let iCount = 0

    for(let i = 0; i < Arr.length; i++)
    {
        if(Arr[i] >= 'a' && Arr[i] <= 'z')
        {
            iCount++
        }
    }

    return iCount
}

let Data = "Marvellous"

let Ret = 0
Ret = CountSmall(Data)
console.log("Number of small character are : "+Ret)
