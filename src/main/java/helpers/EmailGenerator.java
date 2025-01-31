package helpers;

public class EmailGenerator {

    public static String generateEmail(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Lenght must be possitive...");
        }
        StringBuilder email = new StringBuilder();
        for (int i=0; i<a;i++){
            email.append(randomChar());
        }
        email.append("@");
        for (int i=0; i<b;i++){
            email.append(randomChar());
        }
        email.append(".");
        for (int i=0; i<c; i++){
            email.append(randomChar());
        }
        return email.toString();
    }

    private static char randomChar(){
        return (char) ('a' + Math.random()*('z' -'a') + 1);

    }

    public static void main(String[] args) {
  //      System.out.println("Symbol: " + generateEmail(5, 5, 3));
    }
}
