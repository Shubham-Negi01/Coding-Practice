package streams;

public class Student {

    private String name;
    private String deptt;
    private int semester;

    public Student(String name, String deptt, int semester) {
        this.name = name;
        this.deptt = deptt;
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptt() {
        return deptt;
    }

    public void setDeptt(String deptt) {
        this.deptt = deptt;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
