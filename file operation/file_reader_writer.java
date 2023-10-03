import java.io.*;
public class file_reader_writer {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("./filewr.txt");
            FileReader fr = new FileReader("./filerd.txt");
            int i;
            while((i=fr.read()) != -1){
                System.out.print((char)i+" ");
                fw.write((char)i);
            }
            fw.close();
            fr.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
