import java.util.List;

/** — Создать класс УчительВью;(Выводим в консоль) */
public class TeacherView {
    public void print(Teacher teacher){
        System.out.println(teacher.toString());
    }

    public void printAll(TeacherController teacherController){
        System.out.println(teacherController.getTeacherGroup().getTeachers());
    }
}
