package task_4;

public class Computer {
    String exemplar;

    public static void main(String[] args) {

        Computer[] computers = new Computer[5];
        computers[0] = new Computer();
        computers[1] = new Computer();
        computers[2] = new Computer();
        computers[3] = new Computer();
        computers[4] = new Computer();

        for (int i = 0; i < 5; i++) {
            computers[i].exemplar = "detail_" + i;
        }

        // Вывод в цикле for each
        for (Computer comp : computers) {
            System.out.println("detail: " + comp.exemplar);
        }
    }
}