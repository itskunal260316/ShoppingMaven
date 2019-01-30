package Stringham;

public class Builder {
	
	public static void main(String[] args) {
		String s1="Java";
		String s2="Java";
		String s3= new String("Java");
		String s4= new String("Java");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s1.equals (s2));
		System.out.println(s3.equals (s4));
		
		String s5="JAVA";
	//	String s6=s1.toUpperCase();                //new memory location change
		String s6=s1.toUpperCase().intern();
		System.out.println(s5==s6);           
		
		//Here another string object is created and it wil not be created in the pool
		//Only hard coded string will be kept in the pool 
		
		String s7="Hello";
		String s8="World";
		String s9="HelloWorld";
		String s10=s7+s8;
		//String s10=s9.intern();
		 s10=s10.intern();
		System.out.println(s9 == s10);
		
		//the most expensive operation is String  concatenation
		
		String str="dsfdsfsd";
		String str1=" ";
		
		long ns1=System.nanoTime();
		for(int i=0;i<str.length();i++)
			for(int j=0;j<=i;j++)
				str1=str1+str.charAt(j);
		
		long ns2=System.nanoTime();
		System.out.println(str1);
	//	System.out.println("Time ns1:"+ns1);
		System.out.println("Time ns2:"+(ns2-ns1));
		
		//using String buffer
		StringBuffer buffer=new StringBuffer();
		 ns1=System.nanoTime();
		for(int i=0;i<str.length();i++)
			for(int j=0;j<=i;j++)
				buffer.append(str.charAt(j));
		
		 ns2=System.nanoTime();
		System.out.println(str1);
		
		System.out.println(buffer);
		System.out.println("Approx time taken:"+(ns2-ns1)+"nanoseconds");
		
		//String Builder
		
		StringBuilder builder=new StringBuilder();
		 ns1=System.nanoTime();
		for(int i=0;i<str.length();i++)
			for(int j=0;j<=i;j++)
				builder.append(str.charAt(j));
		
		 ns2=System.nanoTime();
		System.out.println(str1);
		
		System.out.println(builder);
		System.out.println("Approx time taken:"+(ns2-ns1)+"nanoseconds");
		
	}

}
