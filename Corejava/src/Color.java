
enum Color {
RED,GREEN,BLUE;
  Color()
 {
	 System.out.println("Hello");
 }
public static void main(String[] args)
{
	for(int i=0;i<3;i++) {
		Color c1= Color.GREEN;
		System.out.println(c1);
	}
}
}