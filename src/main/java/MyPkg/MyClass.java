package MyPkg;
public class MyClass {
	public int add(int a, int b) {
		return (a + b);
	}
	public int sub(int a, int b) {
		return (a - b);	
	}
	public int mul(int a, int b) {
		return (a * b);	
	}
	public int div(int a, int b) {
		return (a / b);
	}


	public static void main(String[] args) {
		MyClass ob = new MyClass();
		System.out.println(ob.add(100, 52));
		System.out.println(ob.sub(100, 52));		
		System.out.println(ob.mul(100, 52));		
		System.out.println(ob.div(100, 52));
	}
}
