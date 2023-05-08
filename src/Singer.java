public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println(getName() + "  " + "likes walking!");
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println(getName() + "  " + "learns very hard!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(getName() + "  " + "eats useful foods!");
    }

    public void singing(){
        System.out.println(getName() + "  " + "singing in the concert!");
    }
    public void playGuitar(){
        System.out.println(getName() + "  " + "plays gitar very well! ");
    }

    @Override
    public String toString() {
        return "Singer's name is:  " + getName() + " | " + "  designation:  " + getDesignation() + " | " +
                "bandName:  " + bandName;
    }
}
