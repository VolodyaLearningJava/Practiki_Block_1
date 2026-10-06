public class Main {
    private static block1.PokerTable poker = new block1.PokerTable();

    public static void main(String[] args) {
        // Блок 1
        block1(args);
        // Блок 2
        block2(args);
    }
    private static void block1(String[] args) {
        System.out.println("Практическая 1");
        block1.Pr1.punkt3();
        block1.Pr1.punkt4while();
        //block1.Pr1.punkt4dowhile();
        block1.Pr1.punkt5(args);
        block1.Pr1.punkt6();
        block1.Pr1.punkt7();

        System.out.println("Практическая 2");
        block1.Pr2.punkt8();
        poker.StartGame();
        block1.HowMany.main();

        System.out.println("Практическая 3");
        block1.Pr3.mr1();
        block1.Pr3 p3 = new block1.Pr3();
        p3.mr2();
        block1.Pr3.mr3();
        block1.Pr3.mr4();
        block1.Pr3.obolochki();

        System.out.println("Практическая 4");
        block1.Pr4.task1();

        System.out.println("Практическая 7");
        block1.Pr7.task4();
        block1.Pr7.task5();
    }
    private static void block2(String[] args) {

    }
}
