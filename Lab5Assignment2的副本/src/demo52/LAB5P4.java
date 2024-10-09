package demo52;

public class LAB5P4 {
	
	public static void main(String[] args){

		System.out.println("Initializing 11 Students in total...");
        Student[] students = new Student[11];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("student-" + (i + 1), 2811 + i);
        }

        System.out.println("Initializing 5 courses in total...");
        Course[] courses = new Course[5];
        for (int i = 0; i < courses.length; i++) {
            courses[i] = new Course("course-" + (i + 1), 3811 + i);
        }

        // Adding courses to the first student
        System.out.println("Adding 4 courses to a student...");
        for (int i = 0; i < 4; i++) {
            if (students[0].addNewCourse(courses[i])) {
                System.out.println("Course added: " + courses[i].getCourseName());
            }
        }

        // Display the details of the first student
        System.out.println("Display the details of the student-1: ");
        students[0].viewStudentDetails();

        // Trying to add one more course
        System.out.println("Add one more course for a student, it will not allow as a student can only enroll in 4 courses:");
        if (!students[0].addNewCourse(courses[4])) {
            System.out.println("Student can not enroll in more than 4 courses.");
        }

        // Display the details of the first course
        System.out.println("Display the details of the course-1 (index 0): ");
        courses[0].viewCourseDetails();

        // Adding 10 students to course-2
        System.out.println("Adding 10 students (student-2 to -11) to a course-2.");
        for (int i = 1; i < 11; i++) {
            System.out.println("Adding Student Name: " + students[i].getStudentName() + " | Student Id: " + students[i].getStudentId() + " to Course Name: " + courses[1].getCourseName() + " | Course Number: " + courses[1].getCourseNumber());
            if (!courses[1].addNewStudent(students[i])) {
                System.out.println("Can't add Student Name: " + students[i].getStudentName() + " | Student Id: " + students[i].getStudentId());
            }
        }

        // Display all the details of the course-2
        System.out.println("Display all the details of the course in which the students were added:");
        courses[1].viewCourseDetails();

        // Trying to add one more student (student-11) to the same course after the class is full
        System.out.println("Try to add one more student (student-11) to the same course after the class is full:");
        if (!courses[1].addNewStudent(students[10])) {
            System.out.println("Course capacity is reached. Can not add more student!");
        }

        // Final output
        System.out.println("Done!");
        System.out.println("CSYE6200, Fall 2024, Prof. Jones Yu");
		
	}

	class Course {
	    private String courseName; // Name of the course
	    private long courseNumber; // Course number
	    private int studentCapacity; // Maximum capacity of students
	    private int currentlyEnrolledStudentCount; // Current number of students enrolled
	    private Student[] studentsEnrolled; // Array of students enrolled in the course

	    public Course(String courseName, long courseNumber) {
	        this.courseName = courseName;
	        this.courseNumber = courseNumber;
	        this.studentCapacity = 10; // Default capacity
	        this.studentsEnrolled = new Student[studentCapacity]; // Initialize the student array
	        this.currentlyEnrolledStudentCount = 0; // Start with zero enrolled students
	    }

	    // Adds a new student to the course if capacity allows
	    public boolean addNewStudent(Student newStudent) {
	        if (currentlyEnrolledStudentCount < studentCapacity) {
	            studentsEnrolled[currentlyEnrolledStudentCount++] = newStudent; // Add student and increment count
	            return true;
	        }
	        return false; // Capacity reached
	    }

	    // Displays details of the course and enrolled students
	    public void viewCourseDetails() {
	        System.out.println("Course Name: " + courseName);
	        System.out.println("Course Number: " + courseNumber);
	        System.out.println("Currently Enrolled Students: " + currentlyEnrolledStudentCount);
	        for (int i = 0; i < currentlyEnrolledStudentCount; i++) {
	            System.out.println(studentsEnrolled[i].getStudentName());
	        }
	    }

	    @Override
	    public String toString() {
	        return "Course{" + "courseName='" + courseName + '\'' + ", courseNumber=" + courseNumber + '}';
	    }
	}

	class Student {
	    private String studentName; // Student's name
	    private long studentId; // Student's ID
	    private int maxCourseEnroll; // Max number of courses a student can enroll
	    private int currentCourseEnrolled; // Current number of courses enrolled
	    private Course[] coursesEnrolled; // Array of courses enrolled

	    public Student(String studentName, long studentId) {
	        this.studentName = studentName;
	        this.studentId = studentId;
	        this.maxCourseEnroll = 4; // Default maximum courses
	        this.coursesEnrolled = new Course[maxCourseEnroll]; // Initialize courses array
	        this.currentCourseEnrolled = 0; // Start with zero enrolled courses
	    }

	    // Adds a new course for the student if they have not reached the limit
	    public boolean addNewCourse(Course courseToAdd) {
	        if (currentCourseEnrolled < maxCourseEnroll) {
	            coursesEnrolled[currentCourseEnrolled++] = courseToAdd; // Add course and increment count
	            courseToAdd.addNewStudent(this); // Add student to course
	            return true;
	        }
	        return false; // Limit reached
	    }

	    // Displays all courses the student is currently enrolled in
	    public void viewAllCourses() {
	        System.out.println("Courses enrolled by " + studentName + ":");
	        for (int i = 0; i < currentCourseEnrolled; i++) {
	            System.out.println(coursesEnrolled[i].toString());
	        }
	    }

	    // Displays student details
	    public void viewStudentDetails() {
	        System.out.println("Student Name: " + studentName);
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Enrolled Courses:");
	        viewAllCourses(); // Show enrolled courses
	    }

	    @Override
	    public String toString() {
	        return "Student{" + "studentName='" + studentName + '\'' + ", studentId=" + studentId + '}';
	    }
	}

}
