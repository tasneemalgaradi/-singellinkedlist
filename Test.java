
public class Test {
    public static void main(String[] args) {
        SinglyLinkedList<Integer>list= new SinglyLinkedList<Integer>();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.addFirst(11);
        list.addLast(12);
        list.addLast(13);
        list.addFirst(14);
        while (!list.isEmpty())
        {
            System.out.print(list.removeFirst()+"\t");
        }


    }
}
