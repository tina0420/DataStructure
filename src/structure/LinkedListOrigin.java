package structure;

public class LinkedListOrigin {
    //Node類別 (一個Node所擁有的基本資訊)
    class Node{
        String name;
        int number;
        int score;
        int position;
        Node next;
        public Node(String n, int num, int sc, int p){
            this.name=n;
            this.number=num;
            this.score=sc;
            this.position=p;
            this.next=null;
        }
    }
    //LinkedList類別 (裡面寫isEmpty insert delete search print方法)
    public class LinkedList{
        //兩個節點指標
        public Node first;
        public Node last;
        //檢查是否為空 isEmpty()
        public boolean isEmpty(){
            return first == null;
        }
        
        //插入新節點(每一個node要包含那個node的基本資料)
        //直接從最後面加入
        public void insert(String name, int number, int score, int position){
            Node newNode = new Node(name,number, score, position);
            if(this.isEmpty()){
                //串列是空的，那這個點就是第一個也是最後一個節點
                newNode = first;
                newNode = last;
            }else{
                //插在最後面(這裡只需要動到last)
                //先指向最後一個點的後面，再把newNode指派給
                last = last.next;
                newNode = last;
            }
        }
        //把東西印出來 print()
        public void print(){
            //current相當於index的角色，一個個travesal
            Node current = first;
            //走到下一個為null為止
            while(current != null){
                System.out.print(current.name+" "+current.number+"號 "+current.score+"分 第"+current.position+"名");
                current = current.next;
                System.out.println();
            }
        }

        //把節點刪掉 delete()
        public void delete(Node delNode){
            Node newNode;
            //暫時存的Node
            Node tmp;

            //刪除LinkedList的第一個節點
            if(first.number == delNode.number){
                first.next = first;
            }else
                //刪除LinkedList的最後一個節點
                if(last.number == delNode.number){
                    System.out.println("I'm here!");
                    //從頭開始往後一個一個算，直到算到last前面一個停下來
                    newNode = first;
                    while(newNode.next != last){
                        newNode = newNode.next;
                    }
                    newNode.next = last.next;
                    last = newNode;
                }
            else{
                newNode = first;
                tmp = first;
                while(newNode.number != last.number){
                    tmp = newNode;
                    newNode = newNode.next;
                }
                tmp.next = delNode.next;
            }
        }

    }

}
