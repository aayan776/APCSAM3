import java.util.ArrayList;
class Course{
    private String name;
    private int credits;
    private double grade;

    public Course(String name, int credits){
        this.name = name;
        this.credits = credits;
        this.grade = 0.0;
    }

    public void setGrade(double grade){
        this.grade = grade;
    }
    public String getName(){
        return name;
    }
    public int getCredit(){
        return credits;
    }
    public double getGrade(){
        return grade;
    }

    public String getLetter(){
        if (grade >= 4.0) return "A*";
        else if (grade >= 3.7) return "A";
        else if (grade >= 3.3) return "B";
        else if (grade >= 2.7) return "C";
        else return "D";
    }
}
class Student{
    private String name;
    private int id;
    private ArrayList<Course> courses;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
        courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }
    public void removeCourse(Course course){
        courses.remove(course);
    }

    public double getGPA(){
        if (courses.isEmpty()) return 0.0;

        double total = 0;
        for (Course course : courses){
            total += course.getGrade();
        }
        return total/courses.size();
    }
    public String getTranscript(){
        StringBuilder transcript = new StringBuilder();
        transcript.append("Name: ").append(name).append("\n");
        transcript.append("ID: ").append(id).append("\n");

        for (Course course : courses){
            transcript
            .append("Course: ").append(course.getName())
            .append(" (").append(course.getCredit()).append(" credits)\n")
            .append("Grade: ").append(course.getGrade())
            .append(" (").append(course.getLetter()).append(")\n\n");
        }
        return transcript.toString();
    }
}
class Grade{
    public static void main(String[] args) {
        //Alice
        Course cs = new Course("Computer Science", 4);
        cs.setGrade(3.8);
        
        Student Alice = new Student("Alice", 1234);
        Alice.addCourse(cs);
        System.out.println("Initial GPA: " + Alice.getGPA());

        Course math = new Course("Mathematics", 3);
        math.setGrade(4.0);

        Alice.addCourse(math);
        System.out.println("Updated GPA: " + Alice.getGPA());

        System.out.println("Alice's transcript: \n" + Alice.getTranscript());
        //Bob
        Course csbob = new Course("Computer Science", 4);
        csbob.setGrade(3.4);
        
        Student Bob = new Student("Bob", 4321);
        Bob.addCourse(csbob);
        System.out.println("Initial GPA: " + Bob.getGPA());

        Course mathbob = new Course("Mathematics", 3);
        math.setGrade(3.5);
        
        Bob.addCourse(math);
        System.out.println("Updated GPA: " + Bob.getGPA());

        System.out.println("Bob's transcript: \n" + Bob.getTranscript());
    }
}