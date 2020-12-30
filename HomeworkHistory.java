
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class HomeworkHistory {
    private ArrayList<Homework> homeworksHistory = new ArrayList<Homework>();

    public void addNewhomework(String title, String body, String deadline, int tid) {
        double hid = Math.random() * 1000;
        Homework newhomework = new Homework(title, body, deadline);
        newhomework.setHid((int) hid);
        // format date
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // get current date
        LocalDateTime now = LocalDateTime.now();
        newhomework.setAssignDate(dateFormat.format(now));
        newhomework.setTeacherID(tid);
        homeworksHistory.add(newhomework);
    }

    public void submitHomework(String title, String body, int homeworkid) {
        double sid = Math.random() * 1000;
        Solution solution = new Solution((int) sid, title, body);
        submitToHomeworkid(homeworkid);
        System.out.println(solution.printSolution());
    }

    public ArrayList<Homework> getHomework() {
        return homeworksHistory;
    }

    public void DisplayHomework() {
        if (homeworksHistory.size() == 0) {
            System.out.println("\n-----No homework has been assigned----------");
        } else {
            for (int i = 0; i < homeworksHistory.size(); i++) {
                System.out.println("\n" + homeworksHistory.get(i).printHomeWork());
            }
        }
    }

    public void submitToHomeworkid(int id) {
        for (Homework work : homeworksHistory) {
            if (work.getHid() == id) {
                work.setStatus("submit");
            }
        }
    }
}
