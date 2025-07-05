package java8;

class Student1 {
    private String name;
    private int grade;

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public Student1(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
