package OOP3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class StudentController {
    List<Student> students = new ArrayList<>();

    public void addStudent(long id, String fN, String lN, String birthday, String className, String address) {
        Student.StudentBuilder studentBuilder = new Student.StudentBuilder(id, fN, lN);
        studentBuilder.setBirthday(birthday);
        studentBuilder.setAddress(address);
        studentBuilder.setClassName(className);
        students.add(studentBuilder.build());
    }

    public void addStudent(Student s) throws IOException {
        Student.StudentBuilder studentBuilder = new Student.StudentBuilder(s.getId(), s.getFisrtName(), s.getLastName());
        studentBuilder.setBirthday(s.getBirthday());
        studentBuilder.setClassName(s.getClassName());
        studentBuilder.setAddress(s.getAddress());
        students.add(studentBuilder.build());
        this.saveToFile();
    }

    public void deleteStudent(long id) throws IOException {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) students.remove(i);
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

    public List<Student> findByName(String fN, String lN) {
        List<Student> result = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            Student a = students.get(i);
            if (a.getFisrtName() == fN && a.getLastName() == lN) result.add(a);
        }
        return result;
    }

    public List<Student> findByClassName(String cN) {
        List<Student> result = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            Student a = students.get(i);
            if (a.getClassName() == cN) result.add(a);
        }
        return result;
    }

    public void saveToFile() throws IOException {
        FileWriter file = new FileWriter("Test.json");
        Gson gson = new Gson();
        file.write(gson.toJson(this.students, new TypeToken<List<Student>>() {
        }.getType()));
        file.flush();
    }

    public void loadFromFile() throws IOException {
        FileInputStream file = new FileInputStream("Test.json");
        Gson gson = new Gson();
        BufferedReader br = new BufferedReader(new InputStreamReader(file));
        String input = br.readLine();
        students = gson.fromJson(input, new TypeToken<List<Student>>() {
        }.getType());
    }

}
