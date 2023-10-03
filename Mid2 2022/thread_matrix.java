/*Declare class called matrix having a reference member used to refer to a 2D matrix of 
 * size n * n. Create n threads, Each thread computes sum of one column and store the result.
 * the order of computation of sum will be of column 0 first and column 1 and then column 2
 * and so on. Include required data members and write a complete program to meet the needs.
 */
class matrix{
    int ar[][],n;
    matrix(int n){
        this.n = n;
        ar = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ar[i][j]=i+j;
            }
        }
    }
    int cal(int tid){
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=ar[i][tid];
        return sum;  
    }
}
class matrix_sum extends Thread{
    int sum=0,counter=0;
    matrix ref;
    matrix_sum(String name,matrix dummy){
        super(name);
        ref=dummy;
        start();
    }
    public void run(){
        for(int j=0;j<ref.n;j++){
            if(counter==j){
                sum+=ref.cal(j);
                System.out.println("Thread "+j+" executed,sum = "+sum);
                counter++;
            }
        }
    }
}
public class thread_matrix{
    public static void main(String[] args) {
        matrix m = new matrix(3);
        matrix_sum ob = new matrix_sum("summm", m);
        try {
            ob.join();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("Total sum = "+ob.sum);
    }
}