package OOP3;

public class Student {
    private long id;
    private String fisrtName;
    private String lastName;
    private String birthday;
    private String className;
    private String address;

    private Student(StudentBuilder s) {
        this.id = s.id;
        this.fisrtName = s.fisrtName;
        this.lastName = s.lastName;
        this.birthday = s.birthday;
        this.className = s.className;
        this.address = s.address;
    }

    public long getId() {
        return id;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getClassName() {
        return className;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object b) {
        if (b == null) {
            return false;
        }
        if (b == this) {
            return true;
        }
        if (!(b instanceof Student)) {
            return false;
        }

        Student s = (Student) b;
        return s.id == this.id;
    }


    //Buider Class
    public static class StudentBuilder {

        private long id;
        private String fisrtName;
        private String lastName;
        private String birthday;
        private String className;
        private String address;

        public StudentBuilder(long id, String fisrtName, String lastName) {
            this.id = id;
            this.fisrtName = fisrtName;
            this.lastName = lastName;
        }

        public StudentBuilder setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }

        public StudentBuilder setClassName(String className) {
            this.className = className;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}