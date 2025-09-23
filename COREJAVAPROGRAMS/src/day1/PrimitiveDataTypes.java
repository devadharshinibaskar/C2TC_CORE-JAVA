package day1;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		byte byteMin=-128;
		byte byteMax=127;
		System.out.println("byteMin-->" + byteMin);
		System.out.println("byteMax-->" + byteMax);
		
		short shortMin=-32768;
		short shortMax=32767;
		System.out.println("shortMin -->" + shortMin);
		System.out.println("shortMax -->" + shortMax);
		
		int minInt=-2147483648;
		int maxInt=2147483647;
		System.out.println("minInt -->" + minInt);
		System.out.println("maxInt -->" + maxInt);
		
		long maxLong=9223372036854775807L;
		long minLong=-9223372036854775808L;
		System.out.println("maxLong -->" + maxLong);
		System.out.println("minLong -->" + minLong);
		
		boolean hi=true;
		System.out.println("HI -->" + hi);
		
		float f=3234.141243278345f;
		double d=3456.14124512345678902345678914f;
		System.out.println("float value" +f+ "\ndouble value" +d);
	}

}
