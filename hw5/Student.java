package hw5;

class Student extends User {
    private int studentId;
    private String name;
    private int id;

    public Student(String name, int birthYear, int studentId) {
        super(name, birthYear);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
}
