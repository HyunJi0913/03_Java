package ch18.sec10;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/Temp/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 저장한 순서대로 역직렬화
        Member m = (Member) ois.readObject();
        Product p = (Product) ois.readObject();
        int[] arr = (int[]) ois.readObject();

        ois.close();
        fis.close();

        // toString으로 출력
        System.out.println(m);
        System.out.println(p);
        System.out.println(Arrays.toString(arr));
    }
}
