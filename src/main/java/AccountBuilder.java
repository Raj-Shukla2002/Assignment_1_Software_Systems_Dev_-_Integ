public class AccountBuilder {
    public Accounts prepFaculty(){
        Accounts account = new Accounts();
        account.addPerson(new Professor());
        account.addPerson(new Staff());
        return account;
    }

    public Accounts prepStudent(){
        Accounts account = new Accounts();
        account.addPerson(new Science_Student());
        account.addPerson(new Tech_Student());
        return account;
    }

}
