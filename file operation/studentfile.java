import java.util.*;
import java.io.*;
import static java.lang.System.out;
class studentfile {
    public static void main(String arg[]) throws IOException{
        // FileWriter ob=new FileWriter("C:/Users/Student/Documents/21cp039/textfile.txt");
        // ob.write("hello world");
        // ob.close();
        // FileReader readerob= new FileReader("C:/Users/Student/Documents/21cp039/textfile.txt");
        // int character;
        // while((character=readerob.read())!=-1){
        //     out.print((char) character);
        // }
        // readerob.close();

        Scanner ob=new Scanner(System.in);
        //Insert student data into file
        // FileWriter writer=new FileWriter("student.csv");
        // System.out.print("Enter number of record you want to insert:");
        // int n = ob.nextInt();
        // out.println("Enter details of n students: ");
        // while(n!=0){
        //     out.println("enter following details-(id,name,contact,cpi)");
        //     String id = ob.next();
        //     String name= ob.next();
        //     String contact=ob.next();
        //     String cpi=ob.next();
        //     writer.write(id+","+name+","+contact+","+cpi+"\n");
        //     n--;
        // }
        // writer.close();

        //Search student from file using id
        out.print("Enter ID to search:");
        String id=ob.next();
        BufferedReader br= new BufferedReader(new FileReader("student.csv"));
        String temp;
        while((temp=br.readLine())!=null){
            if(id.equals(temp.substring(0, 1))){
                out.println(temp);
            }
        }
        br.close();
        
        ob.close();
    }
}