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
        Student d = new Student.StudentBuilder(2, "La", "Trinh")
                .setClassName("17TCLC2")
                .setAddress("asdasd")
                .setBirthday("04/05/1999")
                .build();
        Student e = a.getById(6);

        Student g = new Student.StudentBuilder(1, "Nguyen", "Dat")
                .setClassName("17TCLC2")
                .setAddress("dfgd")
                .setBirthday("21/03/1999")
                .build();

        Assert.assertTrue(b.equals(d));
        Assert.assertFalse(b.equals(e));
        Assert.assertTrue(b.equals(b));
        Assert.assertFalse(b.equals(a));
        Assert.assertFalse(b.equals(g));
    }

    @Test
    public void test_saveToFile() throws IOException {
        StudentController a = new StudentController();

        a.addStudent(new Student.StudentBuilder(1, "Nguyen", "Dat")
                .setClassName("17TCLC2")
                .setAddress("dfgd")
                .setBirthday("21/03/1999")
                .build());

        a.addStudent(new Student.StudentBuilder(2, "La", "Trinh")
                .setClassName("17TCLC2")
                .setAddress("asdasd")
                .setBirthday("04/05/1999")
                .build());

        a.addStudent(3, "Hoang", "Hieu", "04/07/1999", "12A2", "asdasdasda");

        a.saveToFile();

        StudentController controller = new StudentController();
        controller.loadFromFile();

        Assert.assertTrue(a.equals(controller));
    }

    @Test
    public void test_loadToFile() throws IOException {
        StudentController a = new StudentController();
        a.loadFromFile();

        StudentController controller = new StudentController();

        controller.addStudent(new Student.StudentBuilder(1, "Nguyen", "Dat")
                .setClassName("17TCLC2")
                .setAddress("dfgd")
                .setBirthday("21/03/1999")
                .build());

        controller.addStudent(new Student.StudentBuilder(2, "La", "Trinh")
                .setClassName("17TCLC2")
                .setAddress("asdasd")
                .setBirthday("04/05/1999")
                .build());

        controller.addStudent(3, "Hoang", "Hieu", "04/07/1999", "12A2", "asdasdasda");

        Assert.assertTrue(a.equals(controller));
    }

    @Test
    public void test_addStudent() throws IOException {
        StudentController a = new StudentController();

        a.addStudent(new Student.StudentBuilder(1, "Nguyen", "Dat")
                .setClassName("17TCLC2")
                .setAddress("dfgd")
                .setBirthday("21/03/1999")
                .build());

        StudentController b = new StudentController();
        b.loadFromFile();
        b.deleteStudentById(2);
        b.deleteStudentById(3);

        Assert.assertTrue(a.equals(b));
    }

    @Test
    public void test_deleteStudentById() throws IOException {
        StudentController a = new StudentController();
        a.loadFromFile();
        a.deleteStudentById(1);

        StudentController b = new StudentController();

        b.addStudent(new Student.StudentBuilder(2, "La", "Trinh")
                .setClassName("17TCLC2")
                .setAddress("asdasd")
                .setBirthday("04/05/1999")
                .build());

        b.addStudent(3, "Hoang", "Hieu", "04/07/1999", "12A2", "asdasdasda");

        Assert.assertTrue(a.equals(b));
    }

    @Test
    public void test_deleteStudent() throws IOException {
        StudentController a = new StudentController();
        a.loadFromFile();

        a.deleteStudent(new Student.StudentBuilder(1, "Nguyen", "Dat")
                .setClassName("17TCLC2")
                .setAddress("dfgd")
                .setBirthday("21/03/1999")
                .build());

        StudentController b = new StudentController();

        b.addStudent(new Student.StudentBuilder(2, "La", "Trinh")
                .setClassName("17TCLC2")
                .setAddress("asdasd")
                .setBirthday("04/05/1999")
                .build());

        b.addStudent(3, "Hoang", "Hieu", "04/07/1999", "12A2", "asdasdasda");

        Assert.assertTrue(a.equals(b));
    }

    @Test
    public void test_findByName() throws IOException {
        StudentController a = new StudentController();
        a.loadFromFile();

        List<Student> b = a.findByName("La", "Trinh");
        List<Student> f = a.findByName("La", "Tri");
        List<Student> e = a.findByName("Le", "Trinh");
        List<Student> g = a.findByName("Le", "Trin");

        List<Student> d = new ArrayList<>();
        d.add(new Student.StudentBuilder(2, "La", "Trinh")
                .setClassName("17TCLC2")
                .setAddress("asdasd")
                .setBirthday("04/05/1999")
                .build());

        for (int i = 0; i < b.size(); i++) {
            Assert.assertTrue(b.get(i).equals(d.get(i)));
        }
        Assert.assertTrue(f.isEmpty());
        Assert.assertTrue(e.isEmpty());
        Assert.assertTrue(g.isEmpty());
    }

    @Test
    public void test_findByClass() throws IOException {
        StudentController a = new StudentController();
        a.loadFromFile();

        List<Student> b = a.findByClassName("17TCLC2");

        List<Student> d = new ArrayList<>();
        d.add(new Student.StudentBuilder(1, "Nguyen", "Dat")
                .setClassName("17TCLC2")
                .setAddress("dfgd")
                .setBirthday("21/03/1999")
                .build());
        d.add(new Student.StudentBuilder(2, "La", "Trinh")
                .setClassName("17TCLC2")
                .setAddress("asdasd")
                .setBirthday("04/05/1999")
                .build());

        for (int i = 0; i < d.size(); i++) {
            Assert.assertTrue(b.get(i).equals(d.get(i)));
        }

        List<Student> f = a.findByClassName("17TCLC1");
        Assert.assertTrue(f.isEmpty());
    }

    @Test
    public void test_equalsOfStudentController() throws IOException {
        StudentController a = new StudentController();
        a.loadFromFile();
        StudentController b = new StudentController();
        b.loadFromFile();
        StudentController c = null;
        Assert.assertTrue(a.equals(a));
        Assert.assertTrue(a.equals(b));
        Assert.assertFalse(a.equals(c));
        Assert.assertFalse(a.equals(a.getById(1)));
        b.deleteStudentById(1);
        Assert.assertFalse(a.equals(b));
        b.addStudent(3, "Hoang", "Hieu", "04/07/1999", "12A2", "asdasdasda");
        Assert.assertFalse(a.equals(b));
    }
}