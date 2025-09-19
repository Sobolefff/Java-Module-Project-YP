import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            String inputName;
            while (true) {
                System.out.print("— Введите название машины №" + i + ":");
                inputName = scanner.nextLine().trim();
                /*System.out.print("— Введите скорость машины №" + i + ":");
                int inputSpeed = scanner.nextInt();*/
                if (!inputName.isEmpty()) break;
                else {
                    System.out.println("Название автомобиля не должно быть пустым");
                    continue;
                }
            }
        }

    }
}

class Car {

    String name;
    int speed;

    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }

}

class Race {
    String leaderName = "";
    int leaderDistance = 0;
    public static final int RACE_HOURS = 24;
    void getLeader(Car car) {
        int distance  = RACE_HOURS * car.getSpeed();
        if (distance > leaderDistance) {
            leaderDistance = distance;
            leaderName = car.getName();
        }
    }
    public String getLeaderName() {
        return leaderName;
    }
}