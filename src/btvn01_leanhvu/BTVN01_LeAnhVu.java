package btvn01_leanhvu;

public class BTVN01_LeAnhVu {
        
    private Node head;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    
    public int length(){
        int count;
        if(head==null) return 0;
        else count=1;
        Node temp = head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    
    public int getNodeByPosition(int index){
        if(index<0 || index>=length()) return 0;
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.getData();
    }
    
    public void printListNode(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.getData());
            temp=temp.next;
            if(temp!=null) System.out.print(" -> ");
            else System.out.println("");
        }
    }

    public static void main(String[] args) {
         BTVN01_LeAnhVu l3 = new BTVN01_LeAnhVu();
          l3.addFirst(5);
          l3.addFirst(4);
          l3.addFirst(3);
          l3.addFirst(2);
          l3.addFirst(1);
          l3.printListNode();
          System.out.println(l3.getNodeByPosition(1));
    }
    
}
