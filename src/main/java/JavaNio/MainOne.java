package JavaNio;

import java.nio.ByteBuffer;

public class MainOne {
    public static void main(String[] args) {
        /*
        capacity - 32,
        limit - 32,
        position - 0,
        mark - -1
         */
        ByteBuffer byteBuffer = ByteBuffer.allocate(32);

        /*
        capacity - 32,
        limit - 32,
        position - 10,
        mark - -1
         */
        byteBuffer.position(10); //position - 10

        /*
        capacity - 32,
        limit - 32,
        position - 10,
        mark - 10
         */
        byteBuffer.mark();

        /*
        capacity - 32,
        limit - 32,
        position - 20,
        mark - 10
         */
        byteBuffer.position(20);
        /*
        capacity - 32,
        limit - 32,
        position - 10,
        mark - 10
         */
        byteBuffer.reset();

        //System.out.println(byteBuffer.mark());

        /*
        capacity - 32,
        limit - 25,
        position - 10,
        mark - 10
         */
        byteBuffer.limit(25);

        /*
        capacity - 32,
        limit - 32,
        position - 0,
        mark - -1
         */
//        byteBuffer.clear();

        /*
        capacity - 32,
        limit - 10,
        position - 0,
        mark - -1
         */
        byteBuffer.flip();

        /*
        capacity - 32,
        limit - 10,
        position - 0,
        mark - -1
         */
        byteBuffer.rewind();

        /*
        capacity - 32,
        limit - 32,
        position - 10,
        mark - -1
         */
        byteBuffer.compact();

        boolean isRemaining = byteBuffer.hasRemaining(); //true

        int remainingSize = byteBuffer.remaining(); //22
    }
}
