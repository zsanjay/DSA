package interview;

public class CustomArrayList<T> {

	private Object arr[];
	private int size = 10;
	private int index = 0;
	private T element;
	
	public static void main(String[] args) {
		
		
		CustomArrayList<String> list = new CustomArrayList<>();
		
		list.add("Sanjay");
		list.add("Rohit");
		list.add("Vinay");
		list.add("Jatin");
		
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.contains("Sanjay"));
		
		System.out.println(list.contains("fjdskjf"));
		
		System.out.println(list.remove(2));
		
		System.out.println(list);

	}
	
	public CustomArrayList()
	{
		arr = new Object[size];
	}
	
	public CustomArrayList(int size)
	{
		arr = new Object[size];
		this.size = size;
	}
	
	public void add(T e)
	{
		element = e;
		
		if(arr.length >= size)
			increaseSize();
			
			arr[index] = element;
			index++;
	}
	
	public boolean contains(T e)
	{
		for(int i=0;i < index;i++)
		{
			if(arr[i].equals(e))
				return true;
			
		}
		
		return false;
	}
	

	private void increaseSize() {
		
		size = size + (int)(size * 0.5);
		
		Object newArr[] = new Object[size];
		
		System.arraycopy(arr, 0, newArr, 0, arr.length);
		
		arr = newArr;
		
	}
	
	public int size()
	{
		return index;
	}

	public Object get(int index)
	{
		if(index < size)
		{
			return arr[index];
		}
		
		throw new IndexOutOfBoundsException("Array size is "+ size);
		
	}
	
	public T remove(int index)
	{
		Object temp = null;
		
		if(index < size)
		{
			temp = arr[index];
			
			for(int i = index;i < this.index;i++)
				arr[i] = arr[i + 1];
			
			
			this.index--;
			
			
		}
		else
		throw new IndexOutOfBoundsException("Array size is "+ size);
		
		return (T)temp;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder("");
		
		for(int i=0; i < index;i++)
			sb.append(((T)arr[i]) + " ");
		
		return sb.toString();
	}
}
