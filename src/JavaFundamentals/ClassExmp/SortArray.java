package JavaFundamentals.ClassExmp;


public class SortArray {
    public static void main(String[] args) {
        int [] arr=new int [] {1, 7, 3, 10, 9};

for (int i = 0; i < arr.length; i++)//for(int i : arr)
    {
        for (int j = i + 1; j < arr.length; j++)
        {
            int tmp = 0;
            if (arr[i] > arr[j])
            {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        System.out.println(arr[i]);

    }
        System.out.println("First maximum is "+arr[arr.length-1]);
        System.out.println("Second maximun is "+arr[arr.length-2]);
}
}
