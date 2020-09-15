import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 numbers: ");
        String n = sc.nextLine();
        Encrypter a= new Encrypter();
        Decrypter b= new Decrypter();
        System.out.println("encrypted: " +a.Encrypt(n));
        System.out.println("decrypted: " +b.Decrypt(n));
    }

}
