public class insertion_sorting {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        print(arr);
        insertion_sort(arr);
        print(arr);
    }

    private static void insertion_sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {

            int j = i;
            while(j>=1 && arr[j]<arr[j-1]){
                swap(arr, j, j-1);
                j--;
            }

            // either you use while or for  loop hereboth will work but while
            // loop is more efficient we could add both conditions so else statement
            // is useless and looks more professional.


            // for (int j = i; j >= 1 && arr[j]<arr[j-1]; j--) {
            //     swap(arr, j, j-1);
            // }
        }
    }

    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
