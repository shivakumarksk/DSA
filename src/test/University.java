package test;

import test.Address;
import test.Course;
import test.CourseCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class University {
    public String name;
    public String id;
    public Address address;
    public Course course;
    public CourseCategory category;
    public Faculty faculty;

    // Constructor
    public University(String name, String id, Address address, Course course, CourseCategory category,Faculty faculty) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.course = course;
        this.category = category;
        this.faculty=faculty;
    }

    // Builder class
    public static class UniversityBuilder {
        private String name;
        private String id;
        private Address address;
        private Course course;
        private CourseCategory category;
        private Faculty faculty;

        // existing methods
        public UniversityBuilder withFaculty(Faculty faculty) {
            this.faculty = faculty;
            return this;
        }
        public UniversityBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public UniversityBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public UniversityBuilder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public UniversityBuilder withCourse(Course course) {
            this.course = course;
            return this;
        }

        public UniversityBuilder withCategory(CourseCategory category) {
            this.category = category;
            return this;
        }

        public University build() {
            return new University(name, id, address, course, category,faculty);
        }
    }

    // Filter universities based on certain criteria
    public static List<University> filterUniversities(List<University> universities, String name, String courseName) {
        return universities.stream()
                .filter(university -> (name == null || university.name.equals(name))
                        && (courseName == null || university.course.courseName.equals(courseName)))
                .collect(Collectors.toList());
    }

    public static List<University> filterUniversitiesByName(List<University> universities, String name) {
        return universities.stream()
                .filter(university -> name == null || university.name.equals(name))
                .collect(Collectors.toList());
    }

    public static List<University> filterUniversitiesByCourseName(List<University> universities, String courseName) {
        return universities.stream()
                .filter(university -> courseName == null || university.course.courseName.equals(courseName))
                .collect(Collectors.toList());
    }

    public static List<University> filterUniversitiesAgain(List<University> universities, String name, String courseName) {
        return filterUniversitiesByCourseName(filterUniversitiesByName(universities, name), courseName);
    }

    public static List<Faculty> getFacultyData(List<University> universities) {
        return universities.stream()
                .map(university -> university.faculty)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        // Create Address objects
        Address address1 = new Address();
        address1.street = "123 Main St";
        address1.door = "101";
        address1.state = "CA";
        address1.district = "San Francisco";

        Address address2 = new Address();
        address2.street = "456 Elm St";
        address2.door = "202";
        address2.state = "NY";
        address2.district = "New York";

        // Create Course objects
        Course course1 = new Course();
        course1.courseName = "Data Structures";
        course1.courseId = "CS101";

        Course course2 = new Course();
        course2.courseName = "Algorithms";
        course2.courseId = "CS202";

        // Create CourseCategory objects
        CourseCategory category1 = new CourseCategory();
        category1.categoryName = "Computer Science";
        category1.categoryId = "CS";

        CourseCategory category2 = new CourseCategory();
        category2.categoryName = "Mathematics";
        category2.categoryId = "MATH";

        // Create University objects using builder pattern
        Faculty faculty1 = new Faculty("John Doe", "F001", "Computer Science");
        University university1 = new UniversityBuilder()
                .withName("MIT")
                .withId("MIT001")
                .withAddress(address1)
                .withCourse(course1)
                .withCategory(category1)
                .withFaculty(faculty1)
                .build();

        Faculty faculty2 = new Faculty("Jane Smith", "F002", "Mathematics");
        University university2 = new UniversityBuilder()
                .withName("Stanford")
                .withId("STAN001")
                .withAddress(address2)
                .withCourse(course2)
                .withCategory(category2)
                .withFaculty(faculty2)
                .build();

        List<University> universities = new ArrayList<>();
        universities.add(university1);
        universities.add(university2);

      /*  List<Faculty> faculties = getFacultyData(universities);
        for (Faculty faculty : faculties) {
            System.out.println("Faculty Name: " + faculty.facultyName);
            System.out.println("Faculty ID: " + faculty.facultyId);
            System.out.println("Department: " + faculty.department);
        }*/
        // Add universities to a list
        /*List<University> universities = new ArrayList<>();
        universities.add(university1);
        universities.add(university2);*/

        // Filter universities
        List<University> filteredUniversities = filterUniversities(universities, "MIT", null);

        // Print filtered university data
        for (University university : filteredUniversities) {
            System.out.println("University Name: " + university.name);
            System.out.println("University ID: " + university.id);
            System.out.println("University Address: ");
            System.out.println("  Street: " + university.address.street);
            System.out.println("  Door: " + university.address.door);
            System.out.println("  State: " + university.address.state);
            System.out.println("  District: " + university.address.district);
            System.out.println("Course Name: " + university.course.courseName);
            System.out.println("Course ID: " + university.course.courseId);
            System.out.println("Course Category Name: " + university.category.categoryName);
            System.out.println("Course Category ID: " + university.category.categoryId);
            System.out.println("Course Category ID: " + university.faculty.department);
            System.out.println("");
        }
    }
}