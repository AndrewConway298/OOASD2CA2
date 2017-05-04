public class StudentNumMain {
	public static void main(String[] args){
		StudentNumO studentO = new StudentNumO();
		StudentNumC studentC = new StudentNumC();
		studentO.setStudentNum(121654);
		studentO.setStudentNum(121123);
		studentC.addStudentNum(studentO.saveStudent());
		studentO.setStudentNum(121456);
		studentC.addStudentNum(studentO.saveStudent());
		studentO.setStudentNum(121789);
		studentO.getRollBack(studentC.get(0));
	}
}
