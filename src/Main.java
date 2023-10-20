import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите наименование товара: ");
        String product = scanner.nextLine();
        System.out.print("Введите количество товара: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("ВВедите контактный телефон: ");
        String phone = scanner.nextLine();
        System.out.print("Введите адрес доставки: ");
        String adress = scanner.nextLine();
        System.out.printf("Ваш заказ принят.\n" + "Товар: %s, в количестве: %d, прибудет к вам в ближайшее время.\n" +
                "Товар доставим по адресу %s. Ваш контактный номер %s. ", product, quantity, adress, phone);
        scanner.close();
    }
}