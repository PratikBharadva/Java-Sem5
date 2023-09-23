import java.util.*;
class format{
    //id=0 : test
    //id=1 : odi
    //id=2 : t20
    int id,runs,wickets,catches;
    int rank,points;
    format(int id){
        this.id=id;
        runs=wickets=catches=rank=0;
    }
    format(int id,int r,int w, int c){
        this.id=id;
        runs=r;
        wickets=w;
        catches=c;
        points= (runs/5) + (wickets/2) + (catches/2); 
    }
    int returnpoint(){
        return points;
    }
    void assign_rank(int r){
        rank = r;
    }
    void display(){
        System.out.println(rank+"\t"+runs+
            "\t"+wickets+"\t"+catches);
    }
}
class cricketer{
    int jersey;
    String name;
    format odi;
    format t20;
    format test;
    cricketer(){
        jersey=0;
        name=null;
        odi = t20 = test = null;
    }
    cricketer(int j,String n){
        jersey=j;
        name=n;
        odi = t20 = test = null;
    }
    void assign(format f){
        if(f.id==0)
            test = f;
        else if(f.id==1)
            odi = f;
        else
            t20 = f;
    }
    void display_c(int id){
        System.out.print(jersey+"\t"+name+"\t");
        if(id==0 && test!=null){
            test.display();            
        }
        else if(id==1 && odi!=null){
            odi.display();
        }
        else if(id==2 && t20!=null){
            t20.display();
        }
    }
}
public class assignment1 {
    public static void main(String[] args) {
        int n=3;
        cricketer []c = new cricketer[n];
        c[0] = new cricketer(18,"Virat");
        c[0].assign(new format(0,200,10,20));
        c[0].assign(new format(1,2000,10,50));

        c[1] = new cricketer(45,"Rohit");
        c[1].assign(new format(0,300,5,17));
        c[1].assign(new format(1,1000,10,25));
        c[1].assign(new format(2,500,10,30));

        c[2] = new cricketer(1,"Rahul");
        c[2].assign(new format(1,1500,0,35));
        c[2].assign(new format(2,5000,0,25));

        cricketer []sp = new cricketer[2];
        //Putting cricketer into array who plays specific format
        for(int i=0,j=0;i<n;i++){
            if(c[i].t20 != null){
                sp[j++] = c[i];
            }
        }
        //Sort data into descending order
        //try{
            Arrays.sort(sp,(a,b)->Integer.compare(b.t20.points,a.t20.points));
            //Assigning and displaying rank
            System.out.println("Jersey\tName\trank\truns\twickets\tcatches");
            int temp=1;
            for(cricketer i:sp){
                i.t20.rank = temp++;
                i.display_c(2);
            }
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
    }
}