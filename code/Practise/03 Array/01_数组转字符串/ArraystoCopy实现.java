class Test1{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(toSting(arr));
    }
    public static String toSting(int[] arr){
        String newArr = "[";
        for(int i = 0; i <= arr.length - 1; i++){
            //字符串拼接操作
            newArr += arr[i];
            //除了数组最后一个元素，每个元素后面都有 ", "
            if(i != arr.length - 1){
                newArr += ", ";
            }
        }
        newArr += "]";
        return newArr;
    }
}
