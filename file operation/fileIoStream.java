// import java.io.File;
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.IOException;
import java.io.*;

public class fileIoStream {
    static void copy(File fx,File fy){
        try {
            FileInputStream fin = new FileInputStream(fx);
            FileOutputStream fout = new FileOutputStream(fy);
            int j;
            while((j=fin.read()) != -1){
                fout.write(j);
            } 
            System.out.println("File Copied Successfully..");
            fin.close();
            fout.close();   
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        try{
            File fx = new File("file1.txt");
            File fy = new File("file2.txt");

            copy(fx,fy); 
        }
        catch(Exception e){
            System.out.println(e);
        }      
    }
}
