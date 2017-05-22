/**
 * Created by sjjo15 on 2017-03-27.
 */
public class PrinterQueue {
    LinkedList l;

    //Konstruktur
    public PrinterQueue() {
        l = new LinkedList();
    }

    //Lägger till en nod sist i kön
    public void enQueue (String data){
        l.addLast(data);
    }

    //Tar bort en nod först i kön
    public String deQueue(){
        return l.removeFirst();
    }

    //Räknar ut storleken på kön
    public int size(){
        return l.size();
    }

    //Kollar om kön är tom, om den är det returnar den null
    public boolean isEmpty(){
        return (l.first == null);
    }

    //Gör den nya kön till en String som går att printa ut
    public String toString(){
        return l.toString();
    }
}
