public class Main {
    public static void main(String[] args) {
        KidUser kid1 = new KidUser(10, "kids");
        KidUser kid2 = new KidUser(18, "fiction");

        kid1.registerAccount();
        kid2.registerAccount();

        kid1.requestBook();
        kid2.requestBook();

        AdultUser adult1 = new AdultUser(5, "Kids");
        AdultUser adult2 = new AdultUser(23, "Fiction");

        adult1.registerAccount();
        adult2.registerAccount();

        adult1.requestBook();
        adult2.requestBook();
    }
}