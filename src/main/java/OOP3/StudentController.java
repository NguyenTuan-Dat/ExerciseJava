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

    public void addStudent(Student student) throws IOException {
        Student build = new Student.StudentBuilder(student.getId(), student.getFisrtName(), student.getLastName())
                .setBirthday(student.getBirthday())
                .setClassName(student.getClassName())
                .setAddress(student.getAddress())
                .build();
        students.add(build);
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
        for (Student i : students) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public List<Student> findByName(String firstName, String lastName) {
        List<Student> result = new ArrayList<>();
        for (Student i : students) {
            if (i.getFisrtName().equals(firstName) && i.getLastName().equals(lastName)) result.add(i);
        }
        return result;
    }

    public List<Student> findByClassName(String className) {
        List<Student> result = new ArrayList<>();
        for (Student i : students) {
            if (i.getClassName().equals(className)) result.add(i);
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

        if(this.students.size()!=studentController.students.size()) return false;

        for (int i = 0; i < this.students.size(); i++) {
            if (!this.students.get(i).equals(studentController.students.get(i))) return false;
        }

        return true;
    }
}
