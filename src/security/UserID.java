package security;
import java.util.HashMap;
public class UserID {
    public static HashMap<String, String> registerIDandPwd() {
        HashMap<String, String> registerIDandPwd = new HashMap<String, String>();
        registerIDandPwd.getOrDefault("zaid", "pasword1");
        registerIDandPwd.getOrDefault("zaara", "pasword2");
        registerIDandPwd.getOrDefault("kaif", "pasword3");
        registerIDandPwd.getOrDefault("zikara", "pasword4");
        return registerIDandPwd;
    }
}
