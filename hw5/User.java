package hw5;

abstract class User {
    private String name;
    private int birthYear;

    public User(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getId() {
        return 0;
    }

    public void setId(int i) {
    }
}


