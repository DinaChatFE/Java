
import java.util.Scanner;

public class App {
    private static HomeworkHistory homeworkHistory = new HomeworkHistory();
    private static Login login = new Login();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        homeworkHistory.addNewhomework("title", "body", "deadLine", 2012);
        homeworkHistory.DisplayHomework();
        while (true) {
            System.out.print(
                    "\n----------LOGIN FORM---------------\n- press 1 login as teacher, \n- press 2 login as student\nchoose: ");
            switch (scan.nextLine()) {
                case "1":
                    System.out.println("\nLOGIN TO YOUR TEACHER ACCOUNT \n please login your Teacher account");
                    System.out.print("---your id: ");
                    int tid = scan.nextInt();

                    System.out.print("---your Name: ");
                    scan.nextLine();
                    String name = scan.nextLine();
                    System.out.print("---teacher type , press 1 if u are a foreigner, any key if u are not ");
                    String typeScan = scan.nextLine();
                    PersonType personType = new Local();
                    switch (typeScan) {
                        case "1":
                            personType = new Foreigner();
                            break;
                        default:
                            break;
                    }
                    // bridge throw persontype class
                    Person personasTeacher = login.loginPerson(new Teacher(personType), tid, name);
                    boolean stand = true;
                    while (stand) {
                        System.out.print(
                                "\n-------------MENU-------------\npress 1- to add new homework,\npress 2- Display homework\npress 3- to see your profile detail\npress 4- request for dormitory\npress 0-, log out : ");
                        switch (scan.nextLine()) {
                            case "1":
                                System.out.print("---input  title: ");
                                String title = scan.nextLine();
                                System.out.print("---input body: ");
                                String body = scan.nextLine();
                                System.out.print("---input deadline: ");
                                String deadLine = scan.nextLine();
                                homeworkHistory.addNewhomework(title, body, deadLine, tid);
                                break;
                            case "2":
                                homeworkHistory.DisplayHomework();
                                break;
                            case "3":
                                login.printLoginPerson(personasTeacher);
                                break;
                            case "4":
                                personasTeacher.callrequestDorm(personType);
                                break;
                            case "0":
                                stand = false;
                        }
                    }
                    break;
                case "2":
                    System.out.println("\nLOGIN TO YOUR STUDENT ACCOUNT \n please login your Teacher account");
                    System.out.print("---your id: ");
                    int stuid = scan.nextInt();
                    System.out.print("---your Name: ");
                    scan.nextLine();
                    String stuname = scan.nextLine();
                    System.out.print("---student type , press 1 if u are a foreigner, any key if u are not ");
                    String stutypescan = scan.nextLine();
                    PersonType personTypeasstudent = new Local();
                    switch (stutypescan) {
                        case "1":
                            personTypeasstudent = new Foreigner();
                            break;
                        default:
                            break;
                    }
                    // * bridge throw persontype class
                    Person personasStudent = login.loginPerson(new Student(personTypeasstudent), stuid, stuname);
                    boolean stand1 = true;
                    while (stand1) {
                        System.out.print(
                                "\n-------------MENU-------------\npress 1- to submit solution\npress 2- to see your profile detail\npress 3- to see homework to submit\npress 4- request for dormitory\npress 0-, log out : ");
                        switch (scan.nextLine()) {
                            case "1":
                                System.out.print("---input homwork id to submit: ");
                                int homeworkid = scan.nextInt();
                                System.out.print("---input title solution: ");
                                scan.nextLine();
                                String stitle = scan.nextLine();
                                System.out.println("---input body solution");
                                String body = scan.nextLine();
                                homeworkHistory.submitHomework(stitle, body, homeworkid);
                                break;
                            case "2":
                                login.printLoginPerson(personasStudent);
                                break;
                            case "3":
                                homeworkHistory.DisplayHomework();
                                break;
                            case "4":
                                // * calling request dormitory
                                personasStudent.callrequestDorm(personTypeasstudent);
                                break;
                            case "0":
                                stand1 = false;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }

        }

    }

}
