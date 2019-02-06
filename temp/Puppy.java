public class Puppy{
	int puppyage;
	public Puppy(String name){
		System.out.println("The name of puppy is " + name);
	}

	public void setAge(int num){
		puppyage = num;
	}

	public int getAge(){
		System.out.println("The old of puppy is " + puppyage);
		return puppyage;
	}

	public static void main(String[] args) {
	Puppy mypuppy = new Puppy("Dog");
	mypuppy.setAge(2);
	mypuppy.getAge();
	System.out.println("The age is " + mypuppy.puppyage);	
	}
}