import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class blackbox {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите текст который будет сохранен по пути: c:\\тест.txt, для завершения записи напишите слово - стоп ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = new FileWriter("c:\\тест.txt");

        String text;


        while (!(text = reader.readLine()).equals("стоп")) {
            writer.write(text);
        }

        reader.close();
        writer.close();
    }
}