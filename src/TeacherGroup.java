import java.util.ArrayList;
import java.util.List;

/** Создать класс ГруппаУчителей
 * --Добавить поле учитель в учебную группу
 * */
public class TeacherGroup {
    private List<Teacher> teachers = new ArrayList();


    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List teachers) {
        this.teachers = teachers;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
}
