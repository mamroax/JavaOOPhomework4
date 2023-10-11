import java.util.ArrayList;
import java.util.List;

/**
 * -- Создать класс УчительСервис ;(добавляем валидацию)
 */
public class TecherService {

    TecherService() {
        generateSubjects();
    }

    private List<String> subjects = new ArrayList<>();

    private void generateSubjects() {
        for (Subject eFoodStuff : Subject.values()) subjects.add(eFoodStuff.name());
    }

    public boolean isValid(String name, String subject) {
        if (name != null) {
            if (subjects.contains(subject)) {
                return true;
            }
            else {
                System.out.println("Такого предмета нет!");
                return false;
            }
        }
        System.out.println("Неверное имя");
        return false;
    }

    public boolean hasTeacher(Teacher teacher, TeacherGroup teacherGroup) {
        List<Teacher> teachers = teacherGroup.getTeachers();
        for (Teacher el : teachers) {
            if (el.getName().equals(teacher.getName())) {
                System.out.println("Клоны нам нужны!");
                return true;
            }
        }
        return false;
    }

    public List<String> getSubjects(){
        return this.subjects;
    }
}
