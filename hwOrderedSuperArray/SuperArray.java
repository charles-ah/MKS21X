
public class SuperArray {
    private int[] data;
    private int size;

    public SuperArray() {
	data = new int[10];
	size = 0;
    }   

    public SuperArray(int[] ary) {
	//????WHAT GOES HERE?!?!?!?
    }   

    public SuperArray(int initialCapacity) {
	if (initialCapacity < 0) {
	    throw new IllegalArgumentException();
	}
	data = new int[initialCapacity];
	size = 0;
    }
    
    public int size() {
	return size;
    }

    public void clear() {
	size = 0;
    }

    public boolean isEmpty() {
	return size == 0;
    }

    public int get(int index) {
	if(index < 0 || index >= size()) {
	    throw new IndexOutOfBoundsException();
	}
	return data[index];
    }

    public int set(int index, int element) {
	if(index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	int res = data[index];
	data[index] = element;
	return res;
    }

    public int[] toArray() {
	int[] ans = new int[size];
	for(int i = 0; i < size; i++){
	    ans[i] = data[i];
	}
	return ans;
    }

    public String toString(){
	String ans = "[";
	for(int i = 0; i < size ; i++) {
	    if(i == size - 1) {
		return ans + data[i] + "]";
	    }
	    ans += data[i] + ", ";
	}
	return ans + "]";
    }  

    public String toStringDebug() {
	String ans = "[";
	if(size == data.length) {
	    return toString();
	}
	for(int i = 0; i < data.length ; i++) {
	    if(i < size) {
		ans += data[i] + ", ";
	    } else if(i < data.length - 1) {
		ans += "X, ";
	    } else {
		return ans+"X]";
	    }
	}
	return ans + "]";
    }  




    /* Adding and removing things*/
    
    private void grow() {
	int newSize;
	if(size == 0) {
	    newSize = 2;
	}
	else {
	    newSize  = size * 2;
	}

	int[] resized  = new int[newSize];
	for(int i = 0; i < size; i++) {
	    resized[i] = data[i];
	}
	data = resized;
    }

    public boolean add(int element) {
	add(size,element);
	return true;
	
    }

    public void add(int index, int element) {
	if(index < 0 || index > size()) {
	    throw new IndexOutOfBoundsException();
	}
	if(size == data.length) {
	    grow();
	}   
	
	for(int i = size; i > index; i--) {
	    data[i] = data[i - 1];
	}
	data[index] = element;
	size++;
	
    }

    public int remove(int index) {
	if(index < 0 || index >= size()) {
	    throw new IndexOutOfBoundsException();
	}
	int res = get(index);
	for(int i = index; i < size - 1; i++) {
	    data[i] = data[i + 1];
	}
	size--;
	return res;
    }

}