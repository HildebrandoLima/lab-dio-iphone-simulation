package lab_dio_iphone_simulation;

import java.util.Random;
import java.util.Scanner;

public class StartiPhone {

	private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private static final String[] domains = {"example.com", "testsite.org", "mywebsite.net"};

	public static void main(String[] args) {

        iPhone iPhone = new iPhone();
        boolean start = true;

        while (start) {
            menu();
            int op = getOp();

            switch (op) {
                case 1:
                	iPhone.playMusic();
                	iPhone.pauseMusic();
                	iPhone.pauseMusic();
                	iPhone.adjustVolume(10);
                	iPhone.stopMusic();
                break;
                case 2:
                	iPhone.makeCall(generatePhoneNumber());
                	iPhone.receiveCall();
                	iPhone.receiveCall();
                break;
                case 3:
                	iPhone.openUrl(generateUrl());
                	iPhone.bookmarkPage();
                	iPhone.refreshPage();
                break;
                case 4:
                    System.out.println("Saindo...");
                    start = false;
                break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void menu() {
        System.out.println("\n ----- Menu: ----- \n");
        System.out.println("1. Usar Reprodutor Musical");
        System.out.println("2. Fazer uma Chamada"); 
        System.out.println("3. Navegar na Internet");
        System.out.println("4. Sair");
        System.out.print("\nEscolha uma opção: \n");
        System.out.print("\n----- ----- ----- -----\n");
    }

    private static int getOp() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Digite um número.");
            scanner.next();
            menu();
        }
        return scanner.nextInt();
    }

	public static String generatePhoneNumber() {
        int ddd = random.nextInt(90) + 10;
        int number = random.nextInt(900000000) + 100000000;
        return String.format("(%02d) %05d-%04d", ddd, number / 10000, number % 10000);
    }

    public static String generateUrl() {
        String domain = domains[random.nextInt(domains.length)];
        String path = generateRandomString(10);
        return String.format("https://www.%s/%s", domain, path);
    }

    private static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

}
