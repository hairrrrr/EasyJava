class Test1{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(toSting(arr));
    }
    public static String toSting(int[] arr){
        String newArr = "[";
        for(int i = 0; i <= arr.length - 1; i++){
            //�ַ���ƴ�Ӳ���
            newArr += arr[i];
            //�����������һ��Ԫ�أ�ÿ��Ԫ�غ��涼�� ", "
            if(i != arr.length - 1){
                newArr += ", ";
            }
        }
        newArr += "]";
        return newArr;
    }
}
