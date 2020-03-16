import java.util.Arrays;

class Test1{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.binarySearch(arr, 3);
    }

}
//需要注意的是，如果没有找到目标数，Array.binarySearch 会返回 -(low + 1)
//这时，low 的值只可能是 -1 或 arr.length + 1                    