
package self.practice;

import java.util.Arrays;

public class New {
	public static void main(String[] args) {
		String [] str2D = new String [] {"aaa","bbb"};
		String [] str2D2 = new String []  {"aaa","bbb"};
		System.out.println(Arrays.equals(str2D,str2D2));

	}
}
interface Comparator{
	int compare(Object o1,Object o2);
	boolean equals(Object obj);
}
interface Comparable{
	public int compareTo(Object o);
}


final class Integer extends Number implements Comparable{
	public int compareTo(Object o) {
		return compareTo((Integer)o);
	}
	public int compareTo(Integer anotherInteger) {
		int thisVal=this.value();
		int anotherVal=anotherInteger.value();
		return (thisVal<anotherVal ? -1 : (thisVal==anotherVal ? 0: 1));
	}

	private int value() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}