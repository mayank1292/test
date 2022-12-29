package test;


public class TestSomething {
	
	public static void main(String[] args) {
		User user = new User();
		
		String isoCode = user.getAddress().getCountry().getIsoCode().toUpperCase();
		
		System.out.println(isoCode);
		
	}

}
