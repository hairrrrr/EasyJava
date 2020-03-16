import java.util.Arrays;

//将偶数置于数组前端
class Test1{
    public static void main(String[] args) {

        int[] arr = {9, 5, 2, 7};
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            //从左端寻找奇数
            while(left < right && arr[left] % 2 == 0){
                left++;
            }
            //从右端开始找偶数
            while(left < right && arr[right] % 2 != 0){
                right--;
            }
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }

}