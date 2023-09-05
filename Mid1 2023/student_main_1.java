import java.util.*;
class student{
    int id,rank;
    student(){
        id=0;
        rank=0;
    }
    student(int id,int rank){
        this.id = id;
        this.rank = rank;
    }
    void display(){
        System.out.println(id);
    }
    boolean check_rank(int r1,int r2){
        if(rank>=r1 && rank<=r2){
            return true;
        }
        return false;
    }
}
public class student_main_1{
    public static void main(String args[]){
        int n=3;
        Scanner sc = new Scanner(System.in);
        student []s = new student[n];
        s[0] = new student(1,3);
        s[1] = new student(2,10);
        s[2] = new student(4,5);

        System.out.print("Enter range r1:");
        int r1 = sc.nextInt();
        System.out.print("Enter range r2:");
        int r2 = sc.nextInt();
        try{
            if(r1<0 || r2<0) throw new Exception();
        }
        catch(Exception e){
            System.out.println("Negative range not allowed-> "+e);
        }
        try{
            if(r1>r2) throw new Exception();
            System.out.println("Ranked student between "+r1+" and "+r2);
            for(int i=0;i<n;i++){
                if(s[i].check_rank(r1,r2)){
                    s[i].display();
                }
            } 
        }
        catch(Exception e){
            System.out.println("Not valid range-> "+e);
        }
        sc.close();   
    }
}