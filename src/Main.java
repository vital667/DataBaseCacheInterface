public class Main {

    public static void main(String[] args) {

        Person person = new Person(new DataBase());
        person.save();

        person.setSavable(new Cache());
        person.save();



    }
}
