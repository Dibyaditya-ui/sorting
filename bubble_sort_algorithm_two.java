public class bubble_sort_algorithm_two {
    public static void main(String[] args) {
        int [] arr = {1, 3, 2, 4, 5, 6 };
        int n = arr.length;

        for(int x=0; x<n-1; x++){
            boolean flag = true;

            for(int i=0;  i<n-1-x; i++){
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            for(int k=0; k<n-1; k++){
                if(arr[k]>arr[k+1]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                break;
            }
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
