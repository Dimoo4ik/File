package JavaNio;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class MainThree {
    public static void main(String[] args) {
        /*
        capacity - 16,
        limit - 16,
        position - 0,
        mark - -1
         */
        ByteBuffer buff = ByteBuffer.allocate(16);

        buff.put("He".getBytes()); //position - 2

        buff.mark(); //mark - 2

        buff.put("llo".getBytes()); //position - 5

        buff.limit(8); //limit - 8


        /*
        capacity - 16,
        limit - 8,
        position - 5,
        mark - -1
         */
        ByteBuffer duplicateView = buff.duplicate();

        duplicateView.position(0); //position - 0
        duplicateView.put("Good day".getBytes()); //position - 8

        //System.out.println(new String(buff.array(), StandardCharsets.UTF_8)); //Good day

        /*
        capacity - 16,
        limit - 16,
        position - 15,
        mark - -1
         */
        duplicateView.limit(16).put(" fellow".getBytes());
        duplicateView.position(9); //position - 9


        /*
        capacity - 7,
        limit - 7,
        position - 0,
        mark - -1
         */
        ByteBuffer slicedView = duplicateView.slice();

        byte[] slicedByteArray = new byte[slicedView.capacity()];
        slicedView.get(slicedByteArray); //position - 7

        System.out.println(new String(slicedByteArray, StandardCharsets.UTF_8));
    }
}
