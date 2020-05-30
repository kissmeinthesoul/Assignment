package homework2;

public class Main {
    public static void main(String[] args) {
        PostalOffice postalOffice = new PostalOffice();

        postalOffice.addMagazines("FirstMagazine");
        postalOffice.addMagazines("SecondMagazine");
        postalOffice.addMagazines("ThirdMagazine");

        Observer first = new Subscriber("Arman");
        Observer second = new Subscriber("Khazret");
        Observer third = new Subscriber("Alexander");

        postalOffice.addSubscriber(first);
        postalOffice.addSubscriber(second);
        postalOffice.addSubscriber(third);

        postalOffice.addMagazines("FourthMagazine");

        postalOffice.removeSubscriber(third);

        postalOffice.addMagazines("FifthMagazine");


    }
}
