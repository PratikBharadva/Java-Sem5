//linear doubly linkedlist, check data should be in ascending while inserting
class node{
    int info;
    node next,prev;
    node(){
        info=0;
        next=prev=null;
    }
    node(int info){
        next=prev=null;        
        this.info = info;
    }
    void traverse(){
        System.out.println("Linked list traversal->");
        for(node tp=this;tp!=null;tp=tp.next){
            System.out.print(tp.info+" ");
        }
        System.out.println();        
    }
    node insert_node(node new1){
        node tp = this;
        boolean append=false;
        while(tp.info<new1.info){
            if(tp.next==null){
                append=true;
                break;
            }
            tp=tp.next;
        }
        if(append){//inserting at last
            for(tp=this;tp.next!=null;tp=tp.next);//loop till tp point last node
            tp.next=new1;
            new1.prev=tp;
            return this;
        }
        if(tp==this){//inserting in first place
            new1.next=tp;
            tp.prev=new1;
            return new1;
        }
        else{//inserting in middle
            // setting pointer of new node
            new1.prev=tp.prev;
            new1.next=tp;
            // setting pointer of before and after node
            tp.prev.next=new1;
            tp.prev=new1;
            return this;
        }
    }
}
class linear_doubly_ll_2{
    public static void main(String args[]){
        node first = new node(5);
        node new1 = new node(1);
        node new2 = new node(3);
        node new_first=first.insert_node(new1);
        if(new_first!=first){
            first=new_first;
        }
        first=first.insert_node(new2);
        first=first.insert_node(new node(7));        
        first=first.insert_node(new node(10));
        first=first.insert_node(new node(3));  
        first.traverse();
    }
}