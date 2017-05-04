public class StudentNumO {

	private int studentNum;	

	public void setStudentNum(int studentNumIn) {
		System.out.println("Originator: Setting student number to: " + studentNumIn);
		this.studentNum = studentNumIn;
	}

	public int getStudentNum(){
		return studentNum;
	}

	public StudentNumM saveStudent(){
		System.out.println("Originator: Saving student number");
		return new StudentNumM(studentNum);
	}

	public void getRollBack(StudentNumM m){
		studentNum = m.getStudentNum();
		System.out.println("Originator: Student number changed back to: " + studentNum);
	}

}
