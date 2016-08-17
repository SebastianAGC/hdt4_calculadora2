import java.util.Iterator;

/**
 * @author Rodrigo Arriaza
 */
public class ListaEnlazada<E> extends AbstractList<E> implements Stack<E>{


    protected int count; // list size
    protected Node<E> head; // ref. to first element

    public ListaEnlazada()
    // post: generates an empty list
    {
        head = null;
        count = 0;
    }

    @Override
    public void push(E item) {
        addFirst(item);
    }

    @Override
    public E pop() {
        return removeFirst();
    }

    @Override
    public E peek() {
        return head.data;
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }

    public int size()
    // post: returns number of elements in list
    {
        return count;
    }

    public void addFirst(E value)
    // post: value is added to beginning of list
    {
        // note order that things happen:
        // head is parameter, then assigned
        head = new Node<E>(value, head);
        count++;
    }

    public E removeFirst()
    // pre: list is not empty
    // post: removes and returns value from beginning of list
    {
        Node<E> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
    }

    public E getFirst()
    // pre: list is not empty
    // post: returns first value in list
    {
        return head.value();
    }

    public void addLast(E value)
    // post: adds value to end of list
    {
        // location for new value
        Node<E> temp = new Node<E>(value,null);
        if (head != null)
        {
            // pointer to possible tail
            Node<E> finger = head;
            while (finger.next() != null)
            {
                finger = finger.next();
            }

            finger.setNext(temp);
        } else head = temp;

        count++;

    }


    public boolean contains(E value)
    // pre: value is not null
    // post: returns true iff value is found in list
    {
        Node<E> finger = head;

        while (finger != null &&
                !finger.value().equals(value))
        {
            finger = finger.next();
        }
        return finger != null;
    }





    @Override
    public void clear() {

    }



    @Override
    public E getLast() {
        return null;
    }


    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public E remove(E value) {
        return null;
    }

    @Override
    public void add(E value) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E get() {
        return null;
    }

    @Override
    public int indexOf(E value) {
        return 0;
    }

    @Override
    public int lastIndexOf(E value) {
        return 0;
    }

    @Override
    public E get(int i) {
        return null;
    }

    @Override
    public E set(int i, E o) {
        return null;
    }

    @Override
    public void add(int i, E o) {

    }

    @Override
    public E remove(int i) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}