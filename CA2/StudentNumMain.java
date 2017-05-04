public class StudentNumMain {
	public static void main(String[] args){
		StudentNumO studentO = new StudentNumO();
		StudentNumC studentC = new StudentNumC();
		studentO.setStudentNum("X00121654");
		studentO.setStudentNum("X00121123");
		studentC.addStudentNum(studentO.saveStudent());
		studentO.setStudentNum("X00121456");
		studentC.addStudentNum(studentO.saveStudent());
		studentO.setStudentNum("X00121789");
		studentO.getRollBack(studentC.get(0));
	}
}
