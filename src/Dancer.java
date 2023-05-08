public class Dancer extends Person{
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println(getName() + " " + "is walking now!" );
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println(getName() + " " + "learns very well!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(getName() + "  " + "eats a lot of vegetables!"  );
    }

    public void dancing(){
        System.out.println(getName() + "  " + "dancing tango!");
    }

    @Override
    public String toString() {
        return "Dancer's name is:  " + getName() + " | " + " designation:  " + getDesignation() + " | " +
                "groupName:  " + groupName;

    }
}
