import OOP3.Student;
import OOP3.StudentController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class OOP3Test {

    @Before
    public void before() throws IOException {
        FileInputStream a = new FileInputStream("Test-origin.json");
        FileOutputStream b = new FileOutputStream("Test.json");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(b));
        BufferedReader br = new BufferedReader(new InputStreamReader(a));

        bw.write(br.readLine());
        bw.close();
        br.close();
    }

    @Test
    public void test_getById() throws IOException {
        StudentController a = new StudentController();
        a.loadFromFile();

        Student b = a.getById(2);
        Student.StudentBuilder c = new Student.StudentBuilder(2, "La", "Trinh");
        c.setClassName("17TCLC2");
        c.setAddress("asdasd");
        c.setBirthday("04/05/1999");
        Student d = c.build();
        Student e = a.getById(6);

        Assert.assertTrue(b.equals(d));
        Assert.assertFalse(b.equals(e));
        Assert.assertTrue(b.equals(b));
        Assert.assertFalse(b.equals(a));
    }

    @Test
    public void test_saveToFile() throws IOException {
        StudentController a = new StudentController();

        Student.StudentBuilder b = new Student.StudentBuilder(1, "Nguyen", "Dat");
        b.setClassName("17TCLC2");
        b.setAddress("dfgd");
        b.setBirthday("21/03/1999");
        a.addStudent(b.build());

        Student.StudentBuilder c = new Student.StudentBuilder(2, "La", "Trinh");
        c.setClassName("17TCLC2");
        c.setAddress("asdasd");
        c.setBirthday("04/05/1999");
        a.addStudent(c.build());

        a.addStudent(3, "Hoang", "Hieu", "04/07/1999", "17TCLC2", "asdasdasda");

        a.saveToFile();
    }

    @Test
    public void test_loadToFile() throws IOException {
        StudentController a = new StudentController();
        a.loadFromFile();
    }

    @Test
    public void test_addStudent() throws IOException {
        StudentController a = new StudentController();

        Student.StudentBuilder b = new Student.StudentBuilder(1, "Nguyen", "Dat");
        b.setClassName("17TCLC2");
        b.setAddress("dfgd");
        b.setBirthday("21/03/1999");
        a.addStudent(b.build());
    }

    @Test
    public void test_deleteStudent() throws IOException {
        StudentController a = new StudentController();
        a.loadFromFile();
        a.deleteStudent(1);
    }

    @Test
    public void test_findByName() throws IOException {
        StudentController a = new StudentController();
        a.loadFromFile();

        List<Student> b = a.findByName("La", "Trinh");
        Student.StudentBuilder c = new Student.StudentBuilder(2, "La", "Trinh");
        c.setClassName("17TCLC2");
        c.setAddress("asdasd");
        c.setBirthday("04/05/1999");

        List<Student> d = new ArrayList<>();
        d.add(c.build());

        for (int i = 0; i < b.size(); i++) {
            Assert.assertTrue(b.get(i).equals(d.get(i)));
        }
    }

    @Test
    public void test_findByClass() throws IOException {
        StudentController a = new StudentController();
        a.loadFromFile();

        List<Student> b = a.findByClassName("17TCLC2");
        Student.StudentBuilder e = new Student.StudentBuilder(1, "Nguyen", "Dat");
        e.setClassName("17TCLC2");
        e.setAddress("dfgd");
        e.setBirthday("21/03/1999");

        Student.StudentBuilder c = new Student.StudentBuilder(2, "La", "Trinh");
        c.setClassName("17TCLC2");
        c.setAddress("asdasd");
        c.setBirthday("04/05/1999");

        List<Student> d = new ArrayList<>();
        d.add(e.build());
        d.add(c.build());

        for (int i = 0; i < b.size(); i++) {
            Assert.assertTrue(b.get(i).equals(d.get(i)));
        }
    }
}
