
public class Homework {
    private int hid = 1;
    private String title;
    private String body;
    private String assignDate;
    private String deadline;
    private String status = "unsubmit";
    private int teacherID;

    public Homework(String title, String body, String deadline) {
        this.title = title;
        this.body = body;
        this.deadline = deadline;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignDate() {
        return this.assignDate;
    }

    public void setAssignDate(String assignDate) {
        this.assignDate = assignDate;
    }

    public String getDeadline() {
        return this.deadline;
    }

    public void setTeacherID(int tid) {
        this.teacherID = tid;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public int getHid() {
        return this.hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String printHomeWork() {
        return "id: " + hid + "\ttitle: " + title + "\tbody: " + body + "\tTeacherID: " + teacherID + "\tassignDate: "
                + assignDate + "\tdeadLine: " + deadline + "\tstatus: " + status;
    }

}
