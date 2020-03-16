class Test1{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] newArr1 = arr;
        int[] newArr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(newArr1));
        System.out.println(Arrays.toString(newArr2));

        arr[0] = 10;
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("newArr1 = " + Arrays.toString(newArr1));// 直接赋值操作新建的数组的元素也被改变
        System.out.println("newArr2 = " + Arrays.toString(newArr2));// 通过copyOf 新建的数组的元素没有改变

        int[] newArr3 = Arrays.copyOfRange(arr,0,3);//左闭右开区间 【0，3）
        System.out.println("newArr3 = " + Arrays.toString(newArr3));
    }

}
