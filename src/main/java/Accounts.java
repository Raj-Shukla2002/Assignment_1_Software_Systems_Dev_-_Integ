import java.util.ArrayList;
import java.util.List;

public class Accounts {
    private List<Person> accounts = new ArrayList<Person>();

    public void addPerson(Person person){
        accounts.add(person);
    }

    public void showAccounts(){

        for(Person person : accounts){
            System.out.print("Name: " + person.name());
            System.out.print(", Age: " + person.age());
            System.out.print(", Gender: " + person.gender());
            System.out.println(", Account Type: " + person.type_of_member().type());
        }
    }
}
