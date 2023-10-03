import java.io.*;
public class printStream_example {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("./file0.txt");
            PrintStream pout = new PrintStream(fout);
            pout.println("Hello world..");
            pout.close();
            fout.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
