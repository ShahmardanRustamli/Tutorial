public class Main {
    public static void main(String[] args) {
        int arr[] = {5,7,1,9,6,2,10};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int tempArr = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= tempArr;



                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
