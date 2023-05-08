public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println(getName() + "  learns very well!");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println(getName() +  "  walks every day!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(getName()+"  eats a lot of fast foods!");
    }
    public void coding(){
        System.out.println(getName() + "  is coding now!");
    }

    @Override
    public String toString() {
        return "Programmer's name: " + getName() + " | " + " designation:  " + getDesignation() + " | " +
                "  companyName:  " + companyName;
    }
}
