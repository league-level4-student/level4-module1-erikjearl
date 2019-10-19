package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	T[] arr;
	T[] tempArr;
	
	public ArrayList() {
		arr = (T[]) new Object[0];
	}
	
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return arr[loc];
	}
	
	public int size() {
		return arr.length;
	}
	
	public void add(T val) {
		tempArr = (T[]) new Object[arr.length+1];
		for(int i = 0; i < arr.length; i++) {
			tempArr[i] = arr[i];
		}
		tempArr[arr.length] = val;
		arr = tempArr;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		tempArr = (T[]) new Object[arr.length+1];
		for(int i = 0; i < loc; i++) {
			tempArr[i] = arr[i];
		}
		tempArr[loc] = val;
		for(int i = loc+1; i < tempArr.length; i++) {
			tempArr[i] = arr[i-1];
		}
		arr = tempArr;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		tempArr = (T[]) new Object[arr.length-1];
		for(int i = 0; i < loc; i++) {
			tempArr[i] = arr[i];
		}
		for(int i = loc; i < tempArr.length; i++) {
			tempArr[i] = arr[i+1];
		}
		arr = tempArr;
	}
	
	public boolean contains(T val) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == val) {
				return true;
			}
		}
		return false;
	}
}