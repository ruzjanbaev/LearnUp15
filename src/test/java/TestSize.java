import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestSize{

    @Test
    public void testSize() {
        // Test size()
        //----------------- 1. Фаза. Подготовка. Входящие данные
        final int nSize = 34;
        IndexStorage indexStorage = new IndexStorage(nSize);
        //----------------- 2. Фаза. Теситруемое действие.
        int expected = nSize;
        int actual = indexStorage.size();
        System.out.println("size expected = " + expected);
        System.out.println("size actual = " + actual);
        //------------------- 3. Фаза. Проверка.
        Assertions.assertEquals(expected, actual);
    }
}

    /*    @Test
    public void testGet() {
        // Test get(int index)
        //----------------- 1. Фаза. Подготовка. Входящие данные
        int[] arr = {10, 11, 22, 33, 44, 55, 66, 77, 88, 99, 123, 234, 345, 456, 567, 678, 789};
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(arr);
        int[] expected = new int[arr.length];
        int[] actual = arr;
        //----------------- 2. Фаза. Теситруемое действие.
        System.out.print("arrayIndexStorage.get = [");
        for (int i = 0; i < arrayIndexStorage.size(); i++) {
            expected[i] = arrayIndexStorage.get(i);
            System.out.print("[" + i + "] = " + expected[i] + ", ");
        }
        System.out.println("]");
        //------------------- 3. Фаза. Проверка.
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testReverse() {
        // Test reverse
        //----------------- 1. Фаза. Подготовка. Входящие данные
        final int nSize = 23;
        int[] arr = new int[nSize];
        IndexStorage indexStorage = new IndexStorage(nSize);
        for (int i = 0; i < indexStorage.size(); i++) {
            arr[i] = indexStorage.get(i);
        }
        System.out.println("nSize = " + nSize + ", arr = " + Arrays.toString(arr));
        //----------------- 2. Фаза. Теситруемое действие.
        int[] actual = arr.clone();
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(arr.clone());
        actual = arrayIndexStorage.reverse();
        int[] expected = arrayIndexStorage.reverse();
        System.out.println("actual = " + Arrays.toString(actual));
        System.out.println("expected = " + Arrays.toString(expected));
        //------------------- 3. Фаза. Проверка.
        Assertions.assertArrayEquals(expected, actual);
    }
}
*/