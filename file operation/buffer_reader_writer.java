//5.copy the content of file 1 into file 2 using bufferedclass or printwriter in java
import java.io.*;
public class buffer_reader_writer{
    public static void main(String a[]){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("file1.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("file2.txt"));
            String line;
            while((line=reader.readLine()) != null){
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();

            System.out.println("File Copied successfully..");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}