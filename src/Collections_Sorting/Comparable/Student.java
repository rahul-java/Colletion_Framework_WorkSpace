package Collections_Sorting.Comparable;

public class Student implements Comparable<Student>{

	int id;
	String name;
	int rank;
	public Student(int id, String name, int rank) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}
	@Override
	public int compareTo(Student s) {
		
		//return this.id-s.id;  //comparing by id 
		//return this.name.compareTo(s.name);  //comparing by name
		return this.rank-s.rank;
		//return 0;  //do nothing
	}
	
	
}
