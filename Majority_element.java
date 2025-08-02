class majority_element {
    public static void main(String A[])
    {
        int arr[] = {2,2,1,1,2,1,1,2,1,1,1,2,2,2,2,2,2};

        int count = 0, element = -1;

        for(int i : arr)
        {
            if(count == 0)
            {
                element = i;
                count++;
            }
            else if(i == element)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        System.out.println("majority : "+element);
    }
}