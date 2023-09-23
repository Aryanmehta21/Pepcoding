abstract class Student {
  protected String name;
  protected int age;
  protected String department;

  public Student(String name, int age, String department) {
    this.name = name;
    this.age = age;
    this.department = department;
  }

  public abstract String getGrade();
}

class UndergraduateStudent extends Student {
  private double gpa;

  public UndergraduateStudent(String name, int age, String department, double gpa) {
    super(name, age, department);
    this.gpa = gpa;
  }

  @Override
  public String getGrade() {
    if (gpa >= 3.5) {
      return "A";
    } else if (gpa >= 3.0) {
      return "B";
    } else if (gpa >= 2.0) {
      return "C";
    } else {
      return "D";
    }
  }
}

class GraduateStudent extends Student {
  private String thesisTitle;

  public GraduateStudent(String name, int age, String department, String thesisTitle) {
    super(name, age, department);
    this.thesisTitle = thesisTitle;
  }

  @Override
  public String getGrade() {
    return "Not applicable";
  }
  public String getThesis(){
    return thesisTitle;
  }
}

public class StudentAbs {
  public static void main(String[] args) {
    UndergraduateStudent student1 = new UndergraduateStudent("John Doe", 20, "Computer Science", 3.8);
    System.out.println("Student 1's grade: " + student1.getGrade());

    GraduateStudent student2 = new GraduateStudent("Jane Doe", 22, "Mathematics", "The Riemann Hypothesis");
    System.out.println("Student 2's grade: " + student2.getGrade());
    System.out.println("Thesis of Student 2 is " + student2.getThesis());
  }
}
