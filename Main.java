public class Main {
    public static void main(String[] args) {

        Teacher[] teachers = new Teacher[]{
                new Teacher(1, Branch.CS),
                new Teacher(2, Branch.ENG),
                new Teacher(3, Branch.MATH),
                new Teacher(4, Branch.PHYSICS)
        };
        System.out.println("*********************************************");
        for (Teacher teacher : teachers) {
            System.out.println("Teacher ID: " + teacher.getId() + ", Branch: " + teacher.getBranch() + " - " + teacher.getBranch().info);
 }

    }
}