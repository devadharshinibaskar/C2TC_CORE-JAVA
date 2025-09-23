package day1;

public class TypeCastingDemo {

	public static void main(String[] args) {
		byte b=25;
		int i=b;
		System.out.println(i);
		
		float f=3.55f;
		double d=f;
		System.out.println(d);
		
		char c='K';
		int ic=c;
		System.out.println(ic);
		
		char var1='\u00A7';
		int ic1=var1;
		System.out.println(ic1);
		
		double d1=10.52f;
		long l=(long) d1;
		System.out.println(l);
		
		float f2=37.57f;
		int i1=(int) f2;
		System.out.println(i1);
		 
		byte b1=77;
		char ch2=(char) b1;
		System.out.println(ch2);
		
		long l1= 92337203;
		int i2=(int) l1;
		System.out.println(i2);
	}

}
