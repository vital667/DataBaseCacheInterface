public class Person {

    private Savable savable;

    public Person(Savable savable) {
        this.savable = savable;
    }

    public void setSavable(Savable savable) {
        this.savable = savable;
    }

    void save(){
        savable.save();
    }
}
