import java.security.PublicKey;
import java.util.List;

/**
 * — Создать класс УчительКонтроллер
 *  * (Работа с данными: принимает данные в класс Учитель и отправляет в Учитель вью)
 *  * и реализовать возможность создания, редактирования конкретного учителя
 *  * и отображения списка учителей, имеющихся в системе*/
public class TeacherController {
    private TecherService techerService;
    private TeacherGroup teacherGroup;

    TeacherController(){
        techerService = new TecherService();
        teacherGroup = new TeacherGroup();
    }

    private Teacher createTeacher(String name, String subject){
        if (techerService.isValid(name, subject)){
            return new Teacher(name, subject);
        }
        System.out.println("Такого учителя нам не нужен!");
        return null;
    }

    public void addTeacherToGroup(String name, String subject){
        Teacher teacher = createTeacher(name, subject);
        if (teacher != null) {
            if (!techerService.hasTeacher(teacher, teacherGroup)) {
                teacherGroup.addTeacher(teacher);
            }
        }
    }

    public TeacherGroup getTeacherGroup(){
        return this.teacherGroup;
    }

    public Teacher getTeacher(String argument){
        if (techerService.getSubjects().contains(argument)){
            for (Teacher teacher : teacherGroup.getTeachers()){
                if (teacher.getSubject().equals(argument)){
                    return teacher;
                }
            }
        }
        else {
            for (Teacher teacher : teacherGroup.getTeachers()){
                if (teacher.getName().equals(argument)){
                    return teacher;
                }
            }
        }
        System.out.println("Нет такого учителя!");
        return null;
    }


    // редактирования конкретного учителя
    public void changeTeacher(Teacher teacher, String argument){
        if (techerService.getSubjects().contains(argument)){
            teacher.setSubject(argument);
        }
        else {
            teacher.setName(argument);
        }
    }
}
