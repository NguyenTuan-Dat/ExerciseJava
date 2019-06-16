package OOP3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class StudentController {
    private List<Student> students = new ArrayList<>();
    private final String fileTest = "Test.json";

    public void addStudent(long id, String firstName, String lastName, String birthday, String className, String address) throws IOException {
        Student student = new Student.StudentBuilder(id, firstName, lastName)
                .setBirthday(birthday)
                .setAddress(address)
                .setClassName(className)
                .build();
        students.add(student);
        this.saveToFile();
    }

    public void addStudent(Student s) throws IOException {
        Student student = new Student.StudentBuilder(s.getId(), s.getFisrtName(), s.getLastName())
                .setBirthday(s.getBirthday())
                .setClassName(s.getClassName())
                .setAddress(s.getAddress())
                .build();
        students.add(student);
        this.saveToFile();
    }

    public void deleteStudentById(long id) throws IOException {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) students.remove(i);
        }
        this.saveToFile();
    }

    public void deleteStudent(Student student) throws IOException {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(student)) students.remove(i);
        }
        this.saveToFile();
    }

    public Student getById(long id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return students.get(i);
            }
        }
        return null;
    }

    public List<Student> findByName(String firstName, String lastName) {
        List<Student> result = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            Student a = students.get(i);
            if (a.getFisrtName().equals(firstName) && a.getLastName().equals(lastName)) result.add(a);
        }
        return result;
    }

    public List<Student> findByClassName(String className) {
        List<Student> result = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            Student a = students.get(i);
            if (a.getClassName().equals(className)) result.add(a);
        }
        return result;
    }

    public void saveToFile() throws IOException {
        FileWriter file = new FileWriter(fileTest);
        Gson gson = new Gson();
        file.write(gson.toJson(this.students, new TypeToken<List<Student>>() {
        }.getType()));
        file.flush();
    }

    public void loadFromFile() throws IOException {
        FileInputStream file = new FileInputStream(fileTest);
        Gson gson = new Gson();
        BufferedReader br = new BufferedReader(new InputStreamReader(file));
        String input = br.readLine();
        students = gson.fromJson(input, new TypeToken<List<Student>>() {
        }.getType());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof StudentController)) return false;

        StudentController studentController = (StudentController) obj;

        for (int i = 0; i < this.students.size(); i++) {
            if (!this.students.get(i).equals(studentController.students.get(i))) return false;
        }

        return true;
    }
}
