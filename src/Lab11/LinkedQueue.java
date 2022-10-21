package Lab11;


public class LinkedQueue<E> extends AbstractQueue<E>{
    class Node<E>{
        Node<E> node=null;
        E item;

        public Node(Node<E> node, E item) {
            this.node = node;
            this.item = item;
        }

        public Node(E item) {
            this.item = item;
        }
        public Node() {

        }
    }
    Node<E> header;
    Node<E> end;




    @Override
    public void enqueue(E e) {
        Node newnode = new Node<E>(null,e);
        if (size==0){

            header=newnode;
            end=newnode;
        }
        else {
            end.node=newnode;
            end=end.node;
        }
        size++;


    }

    @Override
    public E element() {
        return header.item;
    }

    @Override
    public E dequeue() {
        Node<E> tmp=new Node();
        tmp=header;
        header=header.node;
        size--;
        return tmp.item;
    }

    @Override
    public void clear() {
        Node newnode=new Node();
        newnode=header;
        newnode.item=null;
        while (newnode.node!=null){
            newnode.item=null;
            newnode.node=newnode.node;
        }
        newnode.item=null;
    }
    public void print(){
        Node newnode=new Node();
        newnode=header;
        while(newnode.node!=null){
            System.out.println(newnode.item);
            newnode=newnode.node;
        }
        System.out.println(newnode.item);
    }
}
