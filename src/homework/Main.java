package homework;

public class Main {

    public static void main(String[] args) {
        Character orc = new Character();
        Character elve = new Character();
        Character vampire = new Character();
        Character pegasus = new Character();
        Character troll = new Character();

        orc.setActivity(new Walk());
        System.out.print("Orc is ");
        orc.executeActivity();


        pegasus.setActivity(new Fly());
        System.out.print("Pegasus is ");
        pegasus.executeActivity();
        pegasus.setActivity(new Walk());
        System.out.print("Pegasus is ");
        pegasus.executeActivity();


        elve.setActivity(new Fly());
        System.out.print("Elve is ");
        elve.executeActivity();
        elve.setActivity(new Walk());
        System.out.print("Elve is ");
        elve.executeActivity();


        vampire.setActivity(new Walk());
        System.out.print("Vampire is ");
        vampire.executeActivity();

        troll.setActivity(new Walk());
        System.out.print("Troll is ");
        troll.executeActivity();

    }
}
