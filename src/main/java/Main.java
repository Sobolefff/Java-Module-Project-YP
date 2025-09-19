import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 1; i <= 3; i++) {
            String inputName;
            int inputSpeed;

            while (true) {
                System.out.print("— Введите название машины №" + i + ":");
                inputName = scanner.next().trim();
                if (!inputName.isEmpty()) break;
                System.out.println("Название автомобиля не должно быть пустым");
            }
            while (true) {
                System.out.print("— Введите скорость машины №" + i + ":");
                try {
                    inputSpeed = scanner.nextInt();
                    if (inputSpeed > 0 && inputSpeed <= 250) break;
                    else System.out.println("Скорость должна быть от 1 до 250");
                }
                catch (InputMismatchException e) {
                    System.out.println("Введите целое число");
                    scanner.next();
                }
            }
            Car car = new Car(inputName, inputSpeed);
            race.updateLeader(car);
        }

        System.out.println("Самая быстрая машина: " + race.getLeaderName());

    }
}