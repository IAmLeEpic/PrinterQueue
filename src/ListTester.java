/**
 * Created by sjjo15 on 2017-03-20.
 */
public class ListTester {
    public static void main (String[] args){
        LinkedList l = new LinkedList();
        PrinterQueue p = new PrinterQueue();

        p.enQueue("testQueue");
        p.enQueue("testQueue1");
        p.enQueue("testQueue2");
        p.enQueue("testQueue3");
        String data =  p.deQueue();
        String data2 =  p.deQueue();
        System.out.println(p.toString());

        System.out.println("Köns storlek är " + p.size());
        System.out.println("Dina Utskrivna köer är följande: " + data + " " + data2);
    }
}
