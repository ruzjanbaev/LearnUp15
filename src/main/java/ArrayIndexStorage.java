import java.util.Arrays;

public class ArrayIndexStorage extends IndexStorage {
    private int[] arr;

    protected ArrayIndexStorage(int[] arr) {
        super(arr.length);
        this.setArr(arr);
    }

    protected void setArr(int[] arr) {
        //В задании не сказано, что пустой массив создавать нельзя, следовательно ошибку тут не формируем
        /*if (arr.length == 0) {
            throw new IllegalArgumentException("Массив пустой!");
        }*/
        this.arr = arr;
    }

    @Override
    protected int get(int index) {
        arrayIndexOutOfBoundsException(index);
        return this.arr[index];
    }

    protected int getParent(int index) {
        return super.get(index);
    }

    @Override
    public String toString() {
        return "ArrayIndexStorage{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}