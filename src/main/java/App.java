import java.util.Scanner;

public class App {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int getNumber(Scanner scan, int index) {
        System.out.println("Type " + index + " number");
        return scan.nextInt();
    }

    public void startProcess() {
        Scanner scan = new Scanner(System.in);
        String cmd;
        int result = 0;
        System.out.println("Hello, Welcome");
        cmd = scan.next();

        while (!cmd.equals("end")) {

            switch (cmd) {
                case "add":
                    result = add(getNumber(scan, 1), getNumber(scan, 2));
                    break;
                case "sub":
                    result = sub(getNumber(scan, 1), getNumber(scan, 2));
                    break;
                case "mul":
                    result = mul(getNumber(scan, 1), getNumber(scan, 2));
                    break;
                case "div":
                    result = div(getNumber(scan, 1), getNumber(scan, 2));
                    break;
                default:
                    cmd = "end";
                    break;
            }
            if (cmd.equals("end")) {
                break;
            }

            System.out.println("Result : " + result);
            System.out.println("If you want end, type 'end'. If not, type 'add', 'sub', 'mul', 'div'");
            cmd = scan.next();
        }

    }

    public static void main(String[] args) {
        new App().startProcess();
    }
}