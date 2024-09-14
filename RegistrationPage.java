// this is a sample code to fill out an registration page on a web site with diff username and password according to a particular role using HashMap concept

package HashMapConcepts;

import java.util.HashMap;

public class RegistrationPage {

    public static void doLogin( String name, String emailID, String pwd, String city, String pinCode){
      // Selenium code comes here
        // System.out.println(name+"  " + emailID + " "+pwd +" "+city+ " "+ pinCode);
        System.out.println("Name is :" + name);
        System.out.println("email id is " + emailID);
        System.out.println("password is : " + pwd);
        System.out.println("city is : " + city);
        System.out.println("pinCode is : " + pinCode);
    }
    public static String getregMap(String role){
        HashMap<String,String> regMap = new HashMap<String,String>();
        regMap.put("admin","UserAdmin:admin@ymail.com:ABC:India");
        regMap.put("seller","UserSeller:admin@ymail.com:Delhi:India");
        regMap.put("customer","userCustomer:admin@ymail.com:jakarta:India");
        regMap.put("vendor","UserVendor:vendor@ymail.com:Kolkata:India");
        return regMap.get(role);
    }

    public static void main(String[] args) {

       String loginData= getregMap("seller");
        System.out.println(loginData);
        String [] regData = loginData.split(":");
        String userName = regData[0];
        String userEmail = regData[1];
        String userCity = regData[2];
        String userCountry = regData[3];

        doLogin(userName,userEmail,"TestPwd",userCity,userCountry);


    }
}

