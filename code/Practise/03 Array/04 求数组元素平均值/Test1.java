class Test1{
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1};
        System.out.println(average(arr));
    }
    public static double average (int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        
        return (double)sum / arr.length;
    }

}