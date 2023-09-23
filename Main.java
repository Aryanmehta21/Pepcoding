// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int i = 0;
//         int j = s.length();
//         List<String> list = new ArrayList<>();
//         StringBuilder sb = new StringBuilder();
//         while(i<j){
//             Character ch = s.charAt(i);
//             // if(i == 0) sb.append(Character.toUpperCase(ch));
//             if(ch >= 'A' && ch <= 'Z'){
//                 list.add(sb.toString());
//                 sb.setLength(0);
//                 sb.append(Character.toLowerCase(ch));
//             }else{
//                 sb.append(Character.toUpperCase(ch));
//             }
//             i++;
//         }
//         list.add(sb.toString());
//         System.out.println(list);
//         for(String st: list){
//             System.out.println(st);
//         }
//     }
// }


import java.util.*;

// abstract class Student{
//     String name;
//     int marks1;
//     int marks2;
//  abstract int totalMarks();
//  void name(){
//      System.out.println(this.name);
//  }
// }
// class Marks extends Student{
//     int totalMarks(){
//         return marks1 + marks2;
//     }
// }


// interface Student{
//     void name(String name);
//     void marks1(int m1);
//     void marks2(int m2);
// }

// class Student1 implements Student{
//     String name;
//     int marks1, marks2;
//     @Override
//     public void name(String getName){
//         name = getName;
//     }
//     @Override
//     public void marks1(int m1){
//         marks1 = m1;
//     }
//     @Override
//     public void marks2(int m2){
//         marks2 = m2;
//     }

//     public void getTotal(){
//         System.out.println(name);
//         System.out.print("Total Marks out of 200 is:");
//         System.out.println(marks1 + marks2);
//     }

    
// }
// public class Main{
//     public static void main(String[] args){
//         Student1 s1 = new Student1();
//         s1.name("Aryan");
//         s1.marks1(50);
//         s1.marks2(70);
//         s1.getTotal();

//         Student1 s2 = new Student1();
//         s2.name("makms");
//         s2.marks1(90);
//         s2.marks2(70);
//         s2.getTotal();
//     }
// }


// class Circle{

//     public double radius;

//     public double area(){
        
//         return Math.PI*radius*radius;
//     }
    
//     public double perimeter(){
//         return 2*Math.PI*radius;
//     }
    
//     public double circumference()
//     {
//         return perimeter();
//     }
// }
// public class Main {
    
//  public static void main(String[]args){

//    Circle c1=new Circle();
//    Circle c2=new Circle();

//    c1.radius= 7;
//    c2.radius=14;

//    System.out.println(c1.area());
// 	System.out.println(c1.perimeter());
// 	System.out.println(c1.circumference());
	
// 	System.out.println(c2.area());
// 	System.out.println(c2.perimeter());
// 	System.out.println(c2.circumference());

//  }

// }


// interface Student{
//     void name(String name);
//     void marks(int m1, int m2);
//     void grade();
// }

// class Undergrad implements Student{
//     String name;
//     int marks;
//     @Override
//     public void name(String name){
//         this.name = name;
//         // System.out.println(name);
//     }
    
//     @Override
//     public void marks(int m1, int m2){
//         marks = m1 + m2;
//         // System.out.println(marks);
//     }
    
//     @Override
//     public void grade(){
//         if(marks>= 90){
//             System.out.println("A");
//         }else if(marks>=80 && marks<90){
//             System.out.println("B");
//         }else{
//             System.out.println("C");
//         }
//     }
    
//     public void StudentInfo(){
//         System.out.println(name);
//         System.out.println(marks);
       
//     }
// }


// public class Main
// {
// 	public static void main(String[] args) {
// 		Undergrad s1 = new Undergrad();
// 		s1.name("Aryan");
// 		s1.marks(50,70);
// 		s1.StudentInfo();
// 		s1.grade();
		
// 		Undergrad s2 = new Undergrad();
// 		s2.name("asadasdasd");
// 		s2.marks(60,90);
// 		s2.StudentInfo();
// 		s2.grade();
// 	}
// }


class Student{
    private String name;
    private int rollNo;
    private int marks;
    
    
    public void setName(String getName){
        name = getName;
    }
    
    public String getName(){
        return name;
    }
    
    public void setRoll(int roll){
        rollNo = roll;
    }
    
    public int getRoll(){
        return rollNo;
    }
    
    public void setMarks(int getMarks){
        marks = getMarks;
    }
    
    public int getMarks(){
        return marks;
    }
}


public class Main{
    public static void main(String[] args){
        Student s1 = new Student();
        
        s1.setName("Aryan");
        s1.setRoll(14);
        s1.setMarks(90);
        
        System.out.println(s1.getName());
        System.out.println(s1.getRoll());
        System.out.println(s1.getMarks());
    }
}