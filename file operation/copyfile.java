//4.Copy file1,file2,file2 content into file4
import java.io.*;
class copyfile{
    public static void main(String a[]){
        try{
            File file1 = new File("file1.txt");
            File file2 = new File("file2.txt");
            File file3 = new File("file3.txt");
            File file4 = new File("file4.txt");

            FileInputStream input1 = new FileInputStream(file1);
            FileInputStream input2 = new FileInputStream(file2);
            FileInputStream input3 = new FileInputStream(file3);
            FileOutputStream output = new FileOutputStream(file4);

            byte []buffer = new byte[1024];
            int bytesRead;
            while((bytesRead=input1.read(buffer)) != -1){
                output.write(buffer,0,bytesRead);
            }
            while((bytesRead=input2.read(buffer)) != -1){
                output.write(buffer,0,bytesRead);
            }
            while((bytesRead=input3.read(buffer)) != -1){
                output.write(buffer,0,bytesRead);
            }
            input1.close();
            input2.close();
            input3.close();
            output.close();
            System.out.println("Files copied successfully");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}