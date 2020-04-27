package ex;   //A쪽에서 만든것

//class PersonalNumberStorageImpl extends PersonalNumberStorage {
class PersonalNumberStorageImpl implements PesonalNumber{
	
	PersonalNumInfo[] perArr;
	int numOfPerInfo;

	public PersonalNumberStorageImpl(int sz) {
		perArr = new PersonalNumInfo[sz];
		numOfPerInfo = 0;
	}

	public void addPersonalInfo(String name, String perNum) {
		perArr[numOfPerInfo] = new PersonalNumInfo(name, perNum);
		numOfPerInfo++;
	}

	public String searchName(String perNum) {
		for (int i = 0; i < numOfPerInfo; i++) {
			if (perArr[i].getNumber().equals(perNum)) {
				return perArr[i].getName();
		}
		}
		return null;
	}
}