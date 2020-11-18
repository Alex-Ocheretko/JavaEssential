package Work_2;

public class Main {
    public static void main(String[] args) {
        ClassRoom[] room = new ClassRoom[3];

        room[0] = new ClassRoom(new ExcelendPupil());
        room[1] = new ClassRoom(new GoogPupil());
        room[2] = new ClassRoom(new BadPupil());
    }
}
