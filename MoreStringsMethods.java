package stringspackage;

public class LC03 {
    public static void main(String[] args) {
        String s1 = " this is my car";
        String s1Replaced =s1.replace("car","bike");
        System.out.println(s1);
        System.out.println("After replacement .... ");
        System.out.println(s1Replaced);

        String k = "   hello  ";
        String trimmedK = k.trim();
        System.out.println(k);
        System.out.println("After trimming the extra spaces .... ");
        System.out.println(trimmedK);


    }
}
