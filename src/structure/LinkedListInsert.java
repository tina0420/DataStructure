package structure;

public class LinkedListInsert {
    class Node{
       String local;
       int address;
       Node next;
       public void Node(String local, int address){
           this.local=local;
           this.address=address;
           this.next=null;
       }
    }

    class infor{
        public Node first;
        public Node last;
        public boolean isEmpty(){
            return first == null;
        }
        public void print(){
            Node current;
            current = first;
            while(current != null){
                System.out.print(current.address+" "+current.local);
                System.out.println();
                current=current.next;
            }
        }
        
    }
}
