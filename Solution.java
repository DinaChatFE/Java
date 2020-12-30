
public class Solution {
    private int sid;
    private String title;
    private String body;

    public Solution(int sid, String title, String body) {
        this.title = title;
        this.body = body;
    }

    public int getSid() {
        return this.sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
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

    public String printSolution() {
        return "solution id: " + sid + "\ttitle: " + title + "\tsolution: " + body;
    }

}
