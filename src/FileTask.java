import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FileTask {

    public static void main(String[] args) throws IOException {
        String data = "";
        FileWriter writer = null;
        try {
            writer = new FileWriter("D:\\Test.txt");

        } catch (Exception e) {
            e.printStackTrace();
        }
        BufferedWriter buffer = new BufferedWriter(writer);
        while(!data.equals("stop")) {
            Scanner uInput = new Scanner(System.in);
            data = uInput.nextLine();
            System.out.println(data);
            buffer.write(data);

         }

buffer.close();
    }

}