import org.springframework.jmx.export.naming.IdentityNamingStrategy;

import java.util.NoSuchElementException;

public class MyHeap {

    int[] items;
    int size;

    public MyHeap(int capacity) {//constructor - for create heap
        this.items = new int[capacity];//capacity  what send
        this.size = 0;//reset default value of size
    }

    //get root without remove it
    public int peek(){
        if (size == 0) throw new NoSuchElementException();
        return items[0];//return root value
    }
//insert ()
    public void insert(int value){
        if (size == items.length) throw new IllegalStateException();
        else {
            items[size++] = value;
            bubbleUp();
        }
    }
    public void bubbleUp(){
        //calculate start point(index) last elem add to heap(size-1)
        int index = size - 1;
        //compare until new inserted value(node) in proper place
        //while index > 0 && parent is less than child continue
        while (index > 0 && items[index] > items[parentIndex(index) ]) {
            //swap child and parent
            swap(index, parentIndex(index));
            //calculate next index = parent index
            index = parentIndex(index);//like current = current.next

        }

    }
    //delete (remove) element from Heap
    public int remove(){
        if (size == 0) throw new NoSuchElementException();
        else {//ret int val of root
            int result = items[0];
            //place last item
            items[0] = items[--size];
            bubbleDown();
            return result;
        }
    }
    public void bubbleDown(){
        int index = 0;
        int largerChildIndex;
        while (index <= size &&  !isValidParent(index)){
            largerChildIndex = largerChildIndex(index);
            swap(index, largerChildIndex);
            //switch to next
            index = largerChildIndex;
        }
    }
    public boolean isValidParent(int index){
        //if dont have left child = valid parent
        if ( !hasLeftChild(index)) return true;
        else {//have right child - compare parent and  children
            boolean isValid = false;
            if (hasRightChild(index)){
                isValid = (items[index] >= items[leftChildIndex(index)] && items[index] >= items[rightChildIndex(index)]); //parent - [index]
            }
            return  isValid;
        }
    }
    //swap()
    public void swap(int first, int second){
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }
    //calculate parent index value
    public int parentIndex(int index){ return (index - 1) / 2;}//formula calculate parent index-> parent index =  |(index-1)/2

    //
    public boolean hasLeftChild(int index){//less than size
    return leftChildIndex(index) <= size;//true
    }

    public boolean hasRightChild(int index){//less than size
        return rightChildIndex(index) <= size;//true
    }
    //calculate left child
    public int leftChildIndex(int index){
        return index * 2 +1;
    }
    //calculate with child
    public int rightChildIndex(int index){
        return index * 2 + 2;
    }
    //calculate - return largerChildIndex
    public int largerChildIndex(int index){
        //if not left
        if (!hasLeftChild(index)) return index;
        //have left child - need check both elem-s (pick up greater one)
        else if (!hasRightChild(index)){//have only left child - ret lef ch index
            return leftChildIndex(index);
            }//if have both child - compare - left > return left - or - r> ret r
        return items[leftChildIndex(index)] > items[rightChildIndex(index)] ? leftChildIndex(index) : rightChildIndex(index);

    }
        public void printHeap(){
            for (int i = 0; i < size; i++) {
                System.out.print(items[i]+ ", ");
            }
            System.out.println();
    }
        }



