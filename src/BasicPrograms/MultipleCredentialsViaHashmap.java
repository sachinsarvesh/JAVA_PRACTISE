package BasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class MultipleCredentialsViaHashmap {

    public static void main(String[] args){
        HashMap<String,String> creds = new HashMap<>();
        creds.put("user1"," tomsmith:SuperSecretPassword!");
        creds.put("users2","admin:admin123");

        for(String user : creds.keySet()){
            String[] cred = creds.get(user).split(":");
            System.out.println("***** Credentials for User : " + user + " *****");
            System.out.println("Username : " + cred[0]);
            System.out.println("Password : " + cred[1] + "\n");
        }
    }
}
