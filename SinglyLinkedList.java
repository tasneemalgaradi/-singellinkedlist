
public class SinglyLinkedList <E>{

private Node<E>head=null;
private Node<E>tail=null;
private int size=0;

    public SinglyLinkedList() {
    }
  public boolean isEmpty()
  {return size==0;}
  public int size()
  {return size;}
  public E first()
  {if (isEmpty())return null;
      return head.element;
  }
    public E last()
    {if (isEmpty())return null;
        return tail.element;
    }

public void addFirst(E el)
{
    head= new Node<E>(el,head);
    if (isEmpty())
        tail=head;
    size++;
}
public void addLast(E el)
{
    Node<E> newest= new Node<E>(el,null);
    if (isEmpty())
        head=newest;
    else
        tail.next=newest;
    tail=newest;
    size++;
}
public E removeFirst()
{
    if (isEmpty())return null;
    E deleted= head.element;
    head=head.next;
    size--;
    if (isEmpty())
        tail=null;
    return deleted;
}










    private static class Node<E>{
        E element;
        Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
