class Test1{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] newArr1 = arr;
        int[] newArr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(newArr1));
        System.out.println(Arrays.toString(newArr2));

        arr[0] = 10;
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("newArr1 = " + Arrays.toString(newArr1));// ֱ�Ӹ�ֵ�����½��������Ԫ��Ҳ���ı�
        System.out.println("newArr2 = " + Arrays.toString(newArr2));// ͨ��copyOf �½��������Ԫ��û�иı�

        int[] newArr3 = Arrays.copyOfRange(arr,0,3);//����ҿ����� ��0��3��
        System.out.println("newArr3 = " + Arrays.toString(newArr3));
    }

}
