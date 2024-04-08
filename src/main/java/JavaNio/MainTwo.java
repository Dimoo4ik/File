package JavaNio;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class MainTwo {
    public static void main(String[] args) {
         /*
        capacity - 16,
        limit - 16,
        position - 0,
        mark - -1
         */
        ByteBuffer buff = ByteBuffer.allocate(16);

        //Запись в буфер
        buff.put((byte) 'H'); // position = 1, одиночная запись
        // буфер содержит [H]
        buff.put("ello world".getBytes()); // position = 11, массив байт
        // буфер содержит [Hello world]

        /*
        capacity - 16,
        limit - 16,
        position - 16,
        mark - -1
         */
//        buff.put("apple".getBytes());
//        System.out.println(buff);

        buff.put(6, "new Sochi".getBytes()); // position = 11, массив байт по конкретному индексу, позиция не меняется!
        // буфер содержит [Hello Sochi]


        // Чтение из буфера
        /*
        capacity - 16,
        limit - 11,
        position - 0,
        mark - -1
         */
        buff.flip();
        System.out.println(buff);
        char H = (char) buff.get(0); // position = 1, char = 'H'
        char e = (char) buff.get(1); // position = 2, char = 'e'
        char space = (char) buff.get(9); // position = 2, char = ' ', чтение по конкретному индексу, позиция не меняется!
        char S = (char) buff.get(10); // position = 2, char = 'S', чтение по конкретному индексу, позиция не меняется!
//        System.out.println(H + "" + e + space + S); //He S

        byte[] hello = new byte[3];
        buff.get(6, hello); // чтение с индекса 0 массива байт и запись в массив hello, заполнится массив hello данными с 6 индекса по 8 включительно
        String result = new String(hello, StandardCharsets.UTF_8);
        System.out.println("Result: " + result + "\nBuff: " + buff); // Hello

        char x = (char) buff.get(14); // IndexOutOfBoundsException, обращаемся к существущему символу 'i', но за пределами limit, равного 11
    }
}