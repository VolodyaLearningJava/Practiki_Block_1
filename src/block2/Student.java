package block2;

public class Student implements Comparable<Student> {
    private int id=0, course=2, points=0;
    private String name="Vladimir", surname="M", group="ПВБО-01-25", speciality="Информатика и вычислительная техника";
    public Student(int _id, int _course, String _name, String _surname, String _group, String _speciality) {
        this.id = _id;
        this.course = _course;
        this.name = _name;
        this.surname = _surname;
        this.group = _group;
        this.speciality = _speciality;
    }
    public Student(int _id) { this.id = _id; }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Student(int _id, int _points) { this.id = _id; this.points = _points; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getCourse() { return course; }
    public void setCourse(int course) { this.course = course; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }
    public String getSpeciality() { return speciality; }
    public void setSpeciality(String speciality) { this.speciality = speciality;}

    @Override
    public int compareTo(Student o) {
        if (this.id < o.getId())
            return -1;
        if (this.id > o.getId())
            return 1;
        return 0;
    }


}
