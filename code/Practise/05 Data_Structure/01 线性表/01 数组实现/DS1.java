import java.util.Arrays;

public class DS1 {
    public static void main(String[] args) {
        MyArrayList arr = new MyArrayList();
        arr.elem[0] = 1;
        arr.elem[1] = 3;
        arr.elem[2] = 2;
        arr.usedSize = 3;

        arr.display();

        arr.add(3, 4);

        arr.display();

        System.out.println();
    }
}


class MyArrayList{
    public int[] elem;// null
    public int usedSize; // 0

    public static int DEFAULT_SIZE = 3;

    public MyArrayList(){
        this.elem = new int[DEFAULT_SIZE];
        this.usedSize = 0;
    }


    // 增加一个下标为 pos 的元素 data
    public void add(int pos, int data){
        if(isFull()){
            grow(this.elem);
        }

        if(pos < 0 || pos > this.usedSize){
            throw new ArrayIndexOutOfBoundsException("数组下标不合法");// 抛出异常
        }

        for(int i = this.usedSize - 1; i >= pos; i++){
            this.elem[i + 1] = this.elem[i];

        }
        this.elem[pos] = data;

        this.usedSize++;
    }

    // 扩容
    private void grow(int[] elem){
        this.elem = Arrays.copyOf(elem, elem.length * 2);// 旧空间自动释放
    }
    // 删除第一个出现 toRemove 的元素
    public void remove(int toRemove){

        int index = search(toRemove);
        if(index == -1){
            System.out.println("这个数字不存在");
            return;
        }
        for(int i = index + 1; i < usedSize; i++){
            this.elem[i - 1] = this.elem[i];
         }
        this.usedSize--;
    }

    // 查找数组是否含有 toFind
    public boolean contains(int toFind){

        if(isEmpty()){
            return false;
        }

        for(int i = 0; i < this.usedSize; i++){
            if(toFind == this.elem[i]) {
                return true;
            }
        }
        return false;
    }
    // 重置下标为 pos 的元素为 value
    public void setPos(int pos, int value){
        if(isEmpty()){
            throw new RuntimeException("这是一个空数组");
        }

        checkPos(pos);

        this.elem[pos] = value;
    }
    // 寻找第一个值为 toFind 的元素下标
    public int search(int toFind){
        if(isEmpty()){
            throw new RuntimeException("这是一个空表");
        }

        for(int i = 0; i < this.usedSize; i++){
            if(toFind == this.elem[i]) {
                return i;
            }
        }
        System.out.println("没有找到！");
        return -1;
    }


    // 返回下标为 pos 的元素的值
    public int getPos(int pos){
        if(isEmpty()){
            throw new RuntimeException("这是一个空表");
        }
        checkPos(pos);
        return this.elem[pos];

    }

    // 数组是否为空
    public boolean isEmpty(){
        if(this.usedSize == 0)
            return true;
        return false;
    }
    // 数组是否已满
    public boolean isFull(){
        if(this.usedSize == this.elem.length)
            return true;
        return false;
    }
    // 数组下标是否越界
    private void checkPos(int pos){
        if(pos < 0 || pos >= this.usedSize){
            throw new ArrayIndexOutOfBoundsException("数组下标不合法");
        }
    }
    // 得到数组大小
    public int size(){
        return this.usedSize;
    }
    // 清除数组
    public void clear(){
        this.usedSize = 0;
    }
    // 打印数组
    public void display(){
        for(int i = 0; i < this.usedSize; i++){
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }
}

