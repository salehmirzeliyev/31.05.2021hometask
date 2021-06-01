package ObjectToJson;

import DatasAndFiles.Datas;
import TableClass.Student;
import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ObjectToJson {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileReader("app.config"));
        Datas.dataGenerator();
        FileWriter fileWritter = new FileWriter(properties.getProperty("app.objectToJsonOutput"),true);
        BufferedWriter bw = new BufferedWriter(fileWritter);

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        int threadCount = 10;
        while (threadCount > 0){
            executorService.submit(() -> {
                for (Student student : Datas.students){
                    System.out.println(student);
                    String a = new Gson().toJson(student);
                    try {
                        bw.write(a);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        bw.write("\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            threadCount --;
        }
    }
}
