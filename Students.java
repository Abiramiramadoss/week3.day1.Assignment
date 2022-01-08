package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
		
		}
	public void getStudentInfo(int id,String name) {
		System.out.println(id+","+name);
		}
	public void getStudentInfo(String email,int phoneNumber) {
		System.out.println(email+","+phoneNumber);
		
}
	
public static void main(String[] args) {
	Students stn = new Students();
	stn.getStudentInfo(4454);
	stn.getStudentInfo(547,"abi");
	stn.getStudentInfo("abisangeetha1606@gmail.com", 356295);
	}

}
