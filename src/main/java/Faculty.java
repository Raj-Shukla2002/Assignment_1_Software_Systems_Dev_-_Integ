public abstract class Faculty implements Person {
    @Override
    public Type type_of_member(){
        return new Admin();
    }

    @Override
    public abstract int age();

}
