package JavaNio;

import java.nio.ByteBuffer;

public class MainFour {
    public static void main(String[] args) {
        byte[] bytes1 = "Skillbox".getBytes();
        byte[] bytes2 = "HelloSkillbox".getBytes();

        ByteBuffer buffer1 = ByteBuffer.wrap(bytes1);
        ByteBuffer buffer2 = ByteBuffer.wrap(bytes2);
        buffer2.position(5);
        boolean equal = buffer1.equals(buffer2); // true
        int result = buffer1.compareTo(buffer2); // 0
    }
}
