//super class data_structure which have two subclasses my_stack and my_queue
abstract class data_structure{
    int[] info;
    int size;
    data_structure(){
        info = new int[100];
        size=100;
    }
    data_structure(int size){
        this.size=size;
        info = new int[size];
    }
    abstract int get_data();
    abstract void put_data(int val);
}
class my_stack extends data_structure{
    int top;
    my_stack(){
        super();
        top=-1;
    }
    my_stack(int size){
        super(size);
        top=-1;
    }
    void put_data(int val){ //push operation of stack
        try{
            if(top>=size-1) throw new Exception();
            info[++top]=val;
            // System.out.println("top: "+top);
        }
        catch(Exception e){
            System.out.println("Stack overflow!!");
        }
    }
    int get_data(){ //pop operation of stack
        try{
            if(top<0) throw new Exception();
            // System.out.println("top: "+top);
            return info[top--];
        }
        catch(Exception e){
            System.out.println("Pop::Stack underflow!!");
            return -1;
        } 
    }
    void display(){
        try{
            if(top<0) throw new Exception();
            System.out.println("Stack data->");
            for(int i=0;i<=top;i++){
                System.out.print(info[i]+" ");
            }
            System.out.println();
        }
        catch(Exception e){
            System.out.println("Display::Stack underflow!!");
        } 
    }
}
class my_queue extends data_structure{
    int rear,front;
    my_queue(){
        super();
        rear=-1;
        front=-1;
    }
    my_queue(int size){
        super(size);
        rear=-1;
        front=-1;
    }
    void put_data(int val){ //push operation of queue
        try{
            if(rear>=size-1) throw new Exception();
            if(rear==-1 && front==-1){
                front++;
            }
            info[++rear]=val;
        }
        catch(Exception e){
            System.out.println("Queue overflow!!");
        }
    }
    int get_data(){ //pop operation of queue
        try{
            if(front>rear || front>=size-1) throw new Exception();
            // System.out.println("top: "+top);
            if(front==rear){
                int temp = info[front];
                front=-1;
                rear=-1;
                return temp;
            }
            return info[front++];
        }
        catch(Exception e){
            System.out.println("Pop::Queue underflow!!");
            return -1;
        } 
    }
    void display(){
        try{
            if(front<0 || rear<front) throw new Exception();
            System.out.println("Queue data->");
            for(int i=front;i<=rear;i++){
                System.out.print(info[i]+" ");
            }
            System.out.println();
        }
        catch(Exception e){
            System.out.println("Display::Queue underflow!!");
        }
    }
}
public class ds_main_3 {
    public static void main(String[] args) {
        // my_stack stack = new my_stack(3);
        // stack.put_data(10);
        // stack.display();
        // int i=stack.get_data();
        // System.out.println("Popped value: "+i);
        // stack.display();

        my_queue queue = new my_queue(3);
        queue.put_data(10);
        queue.display();
        int i=queue.get_data();
        System.out.println("Popped value: "+i);
        i=queue.get_data();
        System.out.println("Popped value: "+i);
        queue.display();

    }
}
