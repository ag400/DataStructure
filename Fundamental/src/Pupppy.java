
public class Pupppy {
	int puppyAge;

	public Pupppy(String Name) {
		// TODO Auto-generated constructor stub
		System.out.println("Name chosen is:"+ Name);
	}
	
	public void SetAge(int age) {
		puppyAge = age;
	}
	
	public int GetAge( ) {
		System.out.println(" Puppy's age is: "+ puppyAge);
		return puppyAge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pupppy mypuppy = new Pupppy("Tommy");
		mypuppy.SetAge (2);
		mypuppy.GetAge();
		System.out.println("Value is:" + mypuppy.puppyAge);

	}

}
