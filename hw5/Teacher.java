package hw5;

class Teacher extends User {
    private int teacherId;

    public Teacher(String name, int birthYear, int teacherId) {
        super(name, birthYear);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }
}

