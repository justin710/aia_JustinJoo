package ex;

public class AbstractInterfaceMain {

	public static void main(String[] args) {
	//	PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);
		
		PesonalNumber pn = new PersonalNumberStorageImpl(100);
		
		pn.addPersonalInfo("손흥민", "950000-1122333");
		pn.addPersonalInfo("박지성", "970000-1122334");
		
		System.out.println(pn.searchName("950000-1122333"));
		System.out.println(pn.searchName("970000-1122334"));
	}
}
