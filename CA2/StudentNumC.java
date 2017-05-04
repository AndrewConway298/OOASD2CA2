import java.util.ArrayList;
import java.util.List;

public class StudentNumC {

	private List<StudentNumM> studentNums = new ArrayList<StudentNumM>();

	public void addStudentNum(StudentNumM m) {
		studentNums.add(m);
	}

	public StudentNumM get(int index) {
		return studentNums.get(index);
	}

	public void getStudentNum() {
		// TODO - implement StudentNumC.getStudentNum
		throw new UnsupportedOperationException();
	}

}
