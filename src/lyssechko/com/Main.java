package lyssechko.com;

public class Main {

    public static void main(String[] args) {
        AITUJobSite teachers = new AITUJobSite();
        teachers.addVacancy("Advanced Programming C# teacher");
        teachers.addVacancy("Advanced Programming Java teacher");

        Observer firstTeacher = new Teachers("Vladislav Yevstigneev");
        Observer secondTeacher = new Teachers("Shyngyskhan Kalybayev");

        teachers.addObserver(firstTeacher);
        teachers.addObserver(secondTeacher);

        teachers.addVacancy("Advanced Programming Phyton teacher");
        teachers.removeVacancy("Advanced Programming Phyton teacher");
    }
}
