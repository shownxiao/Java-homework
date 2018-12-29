package Unite5;
/* 综合样例 */
class Node {
    int data;
    Node next;
}

public class Link {
    Node header;
    public Link(int n){
        Node p, q;
        header = new Node();
        header.data = (int)(Math.random()*100);
        p = header;
        for(int k = 1; k <= n - 1; k++){
            q = new Node();
            q.data = (int)(Math.random()*100);
            p.next = q;
            p = q;
        }
    }
    void outputLink(){
        Node p = header;
        while (p != null){
            System.out.print(p.data+"-->");
            p = p.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        Link x = new Link(10);
        x.outputLink();
        Node q = new Node();
        q.data = 100;
        q.next = x.header;
        x.header = q;
        x.outputLink();
        Node p = x.header;
        while (p != null){
            q = p;
            p = p.next;
        }
        p = new Node();
        q.data = 100;
        q.next = p;
        x.outputLink();
    }
}
