public class selection_sorting {

    public static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int index) {
        int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;  
    }
    public static void main(String[] args) {
        int[] arr = {10, -4, 20, 1, -6, 8};
        int n = arr.length;
        
        print(arr);
        for(int i=0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int index = -1;

            for(int j=i;  j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            // swap array of I and index
            swap(arr, i, index);
        }
        print(arr);
    }
}
