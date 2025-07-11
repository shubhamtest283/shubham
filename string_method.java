package mini_projects;

public class string_method {
	static String name(String first_name, String last_name) {
		String full_name = (first_name + " " + last_name);
		return full_name;
	}

	public static void main(String[] args) {
         String names = name("Shubham", "Patil");
         System.out.println(names);
	}

}
