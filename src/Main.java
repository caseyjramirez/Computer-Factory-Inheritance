public class Main {
    public static void main(String[] args) {
        ComputerCase computerCase = new ComputerCase("2208", "Dell", "240");
        Monitor monitor = new Monitor("27 inch monitor", "Dell", 27, "4k");
        MotherBoard motherBoard = new MotherBoard("BJ-200", "Acer", 4, 6, "v2.44");

        PersonalComputer caseysPC = new PersonalComputer("Macbook M1", "Apple", computerCase, monitor, motherBoard);

//        caseysPC.getMonitor().drawPixelAt(5, 4, "Yellow");
//        caseysPC.getMotherBoard().loadProgram("macOS");
//        caseysPC.getComputerCase().pressPowerButton();

        caseysPC.powerUp();
    }
}