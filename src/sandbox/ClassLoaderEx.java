package sandbox;
public class ClassLoaderEx{
	public static void main(String [] args) {
	
		Class c = ClassLoaderEx.class;
		System.out.println(c.getClassLoader());
		
	}
}