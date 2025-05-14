import java.util.*;

public class StudentQueryService {

    public static Map<String, List<StudentInfo>> getStudentInfosPerClassroom(Map<String, List<String>> classrooms) {
        // TODO: Implement splitting logic here
        return Collections.emptyMap();
    }

    public static void main(String[] args) {
        Map<String, List<String>> classrooms = new HashMap<>();
        classrooms.put("A", List.of("John", "Jane", "Alex", "Michael", "Samantha"));
        classrooms.put("B", List.of("Tom", "Jerry", "Ali", "Eve", "Adam", "Sven", "Jonathan", "LoooooongNameHere"));

        Map<String, List<StudentInfo>> result = getStudentInfosPerClassroom(classrooms);

        result.forEach((classroom, infoList) -> {
            System.out.println("Classroom " + classroom + ":");
            infoList.forEach(System.out::println);
        });
    }

    class StudentInfo {
        String name;
        String details;

        public StudentInfo(String name, String details) {
            this.name = name;
            this.details = details;
        }

    }
}