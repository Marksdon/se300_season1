package com.xzc.se300Season1.array;

public class MyArrayList {
	/**
	 * The value is used for objects storage.
	 */
	private Object[] value;

	/**
	 * The count is the number of objects used.
	 */
	private int size;

	/**
	 * Constructs a object array with no elements in it and an
	 * initial capacity of 16 elements.
	 */
	public MyArrayList(){
		this(16);
	}


	/**
	 * Constructs a object array with no elements in it and an
	 * initial capacity specified by the {@code capacity} argument.
	 *
	 * @param      capacity  the initial capacity.
	 */
	public MyArrayList(int capacity){
		if (capacity < 0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		value = new Object[capacity];
	}

	/**
	 * Constructs a object array with a object element
	 * @param obj the object input
	 */
	public MyArrayList(Object obj){
		value[size] = obj;
		size ++;
	}

	/**
	 * The size of array
	 * @return the size of array
	 */
	public int size(){
		return size;
	}

	/**
	 * Checks if the list is empty
	 * @return true if the list is not empty ,otherwise return false
	 */
	public boolean idEmpty(){
		return size == 0;
	}

	/**
	 * Adds a element to the object array
	 * @param obj the object element {@code obj} 
	 * adding to array
	 */
	public void add(Object obj){
		if (size >= value.length) {
			//extend the capacity of array
			int newCapacity = value.length*2 + 2;
			Object[] newValue = new Object[newCapacity];
			for(int i = 0; i < value.length; i ++){
				newValue[i] = value[i];
			}
			value = newValue;
		}
		value[size] = obj;
		size ++;

	}


	/**
	 * get a object element resulting from the specified {@code index}
	 * @param index the specified index of the array
	 * @return the object of array depend on the specified {@code index}
	 */
	public Object get(int index){
		if (index < 0 || index > value.length-1) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return value[index];
	}


	/**
	 * Returns the index of the first occurrence of the specified element
	 * in this list, or -1 if this list does not contain the element.
	 * More formally, returns the lowest index <tt>i</tt> such that
	 * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
	 * or -1 if there is no such index.
	 */
	public int indexOf(Object obj){
		if (obj == null) {
			return -1;
		} else {
			for(int i = 0; i < size; i ++){
				if (obj.equals(value[i])) {
					return i;
				}
			}
		}
		return -1;
	}


    /**
     * Returns the index of the last occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * More formally, returns the highest index <tt>i</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
     * or -1 if there is no such index.
     */
	public int lastIndexOf(Object obj){
		if (obj == null) {
			return -1;
		} else {
			for(int i = size; i >= 0; i --){
				if (obj.equals(value[i])) {
					return i;
				}
			}
			return -1;
		}

	}
	
    /**
     * Replaces the element at the specified position in this list with
     * the specified element.
     *
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     */
    public Object set(int index, Object obj) {
        rangeCheck(index);
        Object oldValue = value[index];
        value[index] = obj;
        return oldValue;
    }
    
    
    /**
     * Checks if the given index is in range.  If not, throws an appropriate
     * runtime exception.
     * @param index the specified position in this list
     */
    public void rangeCheck(int index){
    	if (index < 0 || index > value.length-1) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    }

}
