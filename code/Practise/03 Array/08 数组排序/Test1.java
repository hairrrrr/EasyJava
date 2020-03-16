import java.util.Arrays;

class Test1{
    public static void main(String[] args) {
        int[] arr = {9, 5, 2 ,7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            boolean flg = true;
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flg = false;
                }
            }
            //数组已经达到有序
            if(flg){
                break;
            }
        }
    }
}