package exceptionsuserdefined;

public class Election {
	public void checkEligiblility(int age) throws InvalidAgeException{
	if(age<18)
		throw new InvalidAgeException ("Invalid age to vote");
	else
		System.out.println("you are eligible");
	}
}
