package ie.atu.Class;

public class ClassRoom {
    private String name;
    private String email;
    private String course;

    public ClassRoom() {
        this.name = 0;
        this.email = 0;
        this.course = 0;
    }

    public ClassRoom(String name, String email) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

}
