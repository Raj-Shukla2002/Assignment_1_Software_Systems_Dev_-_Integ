public abstract class Student implements Person {
    @Override
    public Type type_of_member(){
        return new Non_Admin();
    }

    @Override
    public abstract int age();

}
