package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class StudentSortEx {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("01", "엄준식", 10, 20, 5));
		studentList.add(new Student("09", "육회평", 30, 20, 10));
		studentList.add(new Student("02", "이상우", 10, 20, 100));
		studentList.add(new Student("05", "이지용", 20, 10, 5));
		studentList.add(new Student("08", "김대덕", 20, 10, 5));
		studentList.add(new Student("06", "곽철우", 30, 80, 70));
		studentList.add(new Student("03", "곽두팔", 30, 10, 70));
		
		System.out.println("정렬 전)");
		for (Student s: studentList) {
			System.out.println(s);
		}
		System.out.println("\n");
		
		Collections.sort(studentList);
		System.out.println("학번 asc정렬 후)");
		for (Student s: studentList) {
			System.out.println(s);
		}
		System.out.println("\n");

		Collections.sort(studentList, new TotalDesc());
		System.out.println("총점 Desc정렬,총점이 같으면 학번도 Desc)");
		for (Student s: studentList) {
			System.out.println(s);
		}
	}

}

class TotalDesc implements Comparator<Student>{
	@Override
	public int compare(Student st1, Student st2) {
		if (st1.getTotalScore()>st2.getTotalScore()) {
			return -1;
		} else if (st1.getTotalScore()==st2.getTotalScore()){
			return st1.getStudentId().compareTo(st2.getStudentId())*-1;
//			return 0;
		} else {
			return 1;
		}
		
	}
	
}



class Student implements Comparable<Student>{
    //field
	private String studentId;
    private String name;
    private int koreanScore;
    private int englishScore;
    private int mathScore;
    private int totalScore;
    private int rank;
    
    //constructor
    public Student(String studentId, String name, int koreanScore, int englishScore, int mathScore) {
        this.studentId = studentId;
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
        this.totalScore = koreanScore + englishScore + mathScore;
    }
	
	//getter(StId, Total)
	public int getTotalScore() {
		return totalScore;
	}
	
    public String getStudentId() {
        return studentId;
    }
    
	//toString
	@Override
	public String toString() {
		return "[Id=" + studentId + " name=" + name + " korScore=" + koreanScore + " engScore="
				+ englishScore + " mathScore=" + mathScore + " totalScore=" + totalScore +"]";
	}

	
	//Override: comparable_compareTo(StudentId asc sort)
	@Override
	public int compareTo(Student st) {
		if (Integer.parseInt(this.getStudentId())>Integer.parseInt(st.getStudentId())) {
			return 1;
		} else if (Integer.parseInt(this.getStudentId())==Integer.parseInt(st.getStudentId())){
			return 0;
		} else {
			return -1;
		}
	}
}