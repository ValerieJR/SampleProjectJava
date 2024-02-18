public class TeacherInfo {
    private String teacherName = "Jane Doe";
    private int teacherID = 0;
    public static int objectCounter = 0;

    TeacherInfo() {
        objectCounter++;
    }
    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }
    public int getTeacherID() {
        return this.teacherID;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public String getTeacherName() {
        return this.teacherName;
    }
    public void printObjectCounter() {
        System.out.println("The current object count is: " + objectCounter);
    }
}
