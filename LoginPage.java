package HashMapConcepts;

import java.util.HashMap;

public class LoginPage {

    public static void doLogin(String uname, String pwd){

        // selenium code comes here
        System.out.println("successfully login:" + uname +" with " + pwd);
    }
    public static String getUserCredentials(String role){

        HashMap<String,String> credMap = new HashMap<String,String>();
        credMap.put("admin","admin@ymail.com:admin123");
        credMap.put("seller","seller@ymail.com:seller123");
        credMap.put("customer","customer@ymail.com:customer123");
        credMap.put("vendor","vendor@ymail.com:vendor123");
        return credMap.get(role);

    }
    public static void main(String[] args) {

        String cred = getUserCredentials("vendor");
        System.out.println(cred);
        String [] loginCred = cred.split(":");
        String userName = loginCred[0];
        String pwd = loginCred[1];
        System.out.println(userName);
        System.out.println(pwd);
        doLogin(userName,pwd);


    }
}
