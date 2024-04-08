import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //19.1


        /*File file = new File("data/fileJava.txt");

        File[]  files = file.listFiles();//все файлы и папки которые есть внутри нашей папки
        for (File f : files){
            System.out.println(f.getAbsolutePath());//все файлы и папки которые есть внутри нашей папки
        }

        System.out.println(file.length());
        System.out.println(file.lastModified());// последнее изменение файла в мили сек*/



        /*File file = new File("C:\\Users\\dimam\\Desktop\\folder");
         *//*file.mkdirs();//создает файл*//*
        file.delete();// удоляет тот файл*/


        //19.2

        /*try {
            FileInputStream stream = new FileInputStream("C:\\File\\data\\fileJava.txt");
            for (; ; ) {
                int cod = stream.read();
                if (cod < 0) {
                    break;
                }
                char d = (char) cod;
                System.out.print(d);
            }

        } catch (Exception e) {

            e.printStackTrace();

        }*/

        // 19.3

        /*try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("C:\\File\\data\\fileJava.txt"));

            for (; ; ) {

                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Exception exception) {

        }*/

        //19.4


        try {
            List<String>  list = Files.readAllLines(Paths.get("C:\\File\\data\\fileJava.txt"));

            list.forEach(System.out::println);

        } catch (Exception exception) {

        }



    }
}
