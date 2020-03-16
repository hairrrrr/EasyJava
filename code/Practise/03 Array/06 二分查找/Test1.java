public class Test1 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int indexOfArr = binarySearch(arr, 3);
        if(indexOfArr != -1) {
            System.out.println(indexOfArr);
        }else{
            System.out.println("没找到！");
        }

    }
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if (target > arr[mid]) {
                left = mid + 1;
            }
            if (target < arr[mid]) {
                right = mid - 1;
            }
            if(target == arr[mid]){
                return mid;
            }
        }
        return -1;

    }
}