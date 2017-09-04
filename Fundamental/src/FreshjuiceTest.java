

class Freshjuice{
	enum FreshjuiceSize{ Small, Medium, Large }
	FreshjuiceSize size;
}

public class FreshjuiceTest {
      
	public static void main(String []args) {
		Freshjuice juice = new Freshjuice();
		juice.size = Freshjuice.FreshjuiceSize.Medium;
		System.out.println("Size:" + juice.size);
	}
}
