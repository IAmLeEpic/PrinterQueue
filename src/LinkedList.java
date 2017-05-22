/**
 * Created by sjjo15 on 2017-03-20.
 */
public class LinkedList {
   //Variabler
    Node first;
    Node last;

    //Klassen Node skapas
    private class Node {
        String data;
        Node next;
    }

    //addFirst sätter den valda noden till den första i listan.
    public void addFirst(String s) {
        Node tmpNode = new Node();
        tmpNode.data = s;
        tmpNode.next = first;

        if (isEmpty()) {
            first = tmpNode;
            last = tmpNode;
        } else {
            first = tmpNode;
        }
    }

    //addLast sätter den valda noden till den sista i listan.
    public void addLast(String s) {
        Node tmpNode = new Node();
        tmpNode.data = s;
        tmpNode.next = null;

        if (isEmpty()) {
            first = tmpNode;
            last = tmpNode;
        } else {
            last.next = tmpNode;
            last = tmpNode;
        }
    }

    //Räknar ut storleken på listan
    public int size(){
        int size = 1;
        Node currNode = first;
        while (currNode != last) {
            size++;
            currNode = currNode.next;
        }
        if (currNode == null) {
            size = 0;
        }
        return size;
    }

    //Denna metod tar bort den första noden i listan
    public String removeFirst(){
        Node currNode = first;
        first = currNode.next;

        return currNode.data;
    }

    //Denna metod tar bort den sista noden i listan
    public void removeLast(){
        Node currNode = first;
        while (currNode.next != last ){
            currNode = currNode.next;
        }
        currNode.next = null;
        last = currNode;
    }

    //Kollar om listan är tom, om denn är det ska den returna null
    public boolean isEmpty(){
        return (first == null);
    }

    //Metoden som skapar noder till strings och lägger till pilar för prydnad
    public String toString(){
        String output = "";
        Node currNode = first;
        while (currNode != null){
            output += currNode.data + "->";
            currNode = currNode.next;
        }
        return output;
    }
}
