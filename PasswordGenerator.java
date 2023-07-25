import java.security.SecureRandom;
public class PasswordGenerator{
    private static final String CHAR_POOL="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuopasdfghjklzxcvbnm123456789!@#$%^&*()_";
    private static final  int DEFAULT_LENGTH=14;
    public static void main(String[] args){
        System.out.println(passwordgenerator(14));
        System.out.println(passwordgenerator(12));
        System.out.println(passwordgenerator(16));
        System.out.println(passwordgenerator(20));
        System.out.println(passwordgenerator(10));
    }
    public static String passwordgenerator(int length){
        if(length<2){
            length=DEFAULT_LENGTH;
        }
        SecureRandom random=new SecureRandom();
        StringBuilder password =new StringBuilder();
        for(int i=0;i<length;i++){
            int index=random.nextInt(CHAR_POOL.length());
            password.append(CHAR_POOL.charAt(index));
        }
        return password.toString();
    }


}