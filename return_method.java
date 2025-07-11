package mini_projects;

public class return_method {
	
	static int multply(int a, int b) {
		int result = a*b;
		return result;
	}

	public static void main(String[] args) {
     int total= multply(10,20);
     System.out.println("multplication is: " + total);
	}

}
