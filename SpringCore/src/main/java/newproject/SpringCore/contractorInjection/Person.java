package newproject.SpringCore.contractorInjection;

public class Person {
	private String name;
	private int persionId;
	private Certi certi;
	
	public Person() {
		super();
	}
	public Person(String name,int persionId,Certi certi) {
		this.name=name;
		this.persionId=persionId;
		this.certi=certi;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", persionId=" + persionId + ", certi=" + certi + "]";
	}
}
