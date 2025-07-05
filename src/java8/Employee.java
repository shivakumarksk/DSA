package java8;

public class Employee implements Comparable<Employee>{
    private String name;
    private int id;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    private int age;
    public Employee(String name, int id, int salary, String department, int age) {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.department=department;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private int salary;
private String department;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Employee other) {
        int departmentCompare = this.department.compareTo(other.department);
        if (departmentCompare == 0) {
            return Integer.compare(this.salary,other.salary);
        } else {
            return departmentCompare;
        }
    }
}
