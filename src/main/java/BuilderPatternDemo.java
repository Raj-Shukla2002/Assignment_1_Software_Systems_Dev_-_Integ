public class BuilderPatternDemo {
    public static void main(String[] args){

        AccountBuilder accountbuilder = new AccountBuilder();

        Accounts faculty = accountbuilder.prepFaculty();
        System.out.println("Faculty Members");
        faculty.showAccounts();

        Accounts student = accountbuilder.prepStudent();
        System.out.println("\nStudent Members");
        student.showAccounts();
    }
}
