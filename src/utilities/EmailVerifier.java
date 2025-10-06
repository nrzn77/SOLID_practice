package utilities;

public class EmailVerifier {
    public static boolean verifyEmail(String email) {
        return email.contains("@");
    }
}
