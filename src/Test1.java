
public class Test1 {
	
	
	private String name;
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void disp(){
		System.out.println("name is "+name);
	}

	public static void main(String[] args) {
		
		Test1 ob = new Test1();
		ob.setName("jay");
		ob.disp();
		// TODO Auto-generated method stub

	}

}
