package DatasAndFiles;

import TableClass.Grade;
import TableClass.Student;
import TableClass.Subject;
import TableClass.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Datas {
    public static List<Student> students = new ArrayList<>();
    public static List<Teacher> teachers = new ArrayList<>();
    public static List<Grade> grades = new ArrayList<>();
    public static List<Subject> subjects = new ArrayList<>();

   /* public static List<Student> students;
    public static List<Teacher> teachers;
    public static List<Grade> grades;
    public static List<Subject> subjects;
    static{
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        grades = new ArrayList<>();
        subjects = new ArrayList<>();
    }
    */
    public static void dataGenerator(){
        for (int i =1; i<=5; i++){
            grades.add(new Grade(i,"grade"+i));
        }
        for (int i=1; i<=20; i++){
            Subject subject = new Subject(i, "subject"+i);
            teachers.add(new Teacher(i,"teacher_name"+i, "teacher_surname"+i, subject));
        }
        for (int i=1; i<=10; i++){
            students.add(new Student(i,"student_name"+i, "student_surname"+i, grades.get(5), teachers));
        }
    }
}
