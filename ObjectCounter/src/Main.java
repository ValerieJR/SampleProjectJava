//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TeacherInfo t1 = new TeacherInfo();
        t1.setTeacherID(1234);
        System.out.println("The teacher ID is: " + t1.getTeacherID());
        t1.printObjectCounter();
        TeacherInfo t2 = new TeacherInfo();
        t2.printObjectCounter();
    }
}