import java.util.Scanner;

public class HowMany {
    public static void main(){
        System.out.print("Ввод в HowMany: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = " " + str;
        int n = 0;
        for (int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {
                n++;
            }
        }
        System.out.println("Всего " + n + " слов");
    }
}
