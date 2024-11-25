package stringspackage;

public class LC01 {

    public static void main(String[] args) {
        String s1 = "Knowledge";
        int s1Index = s1.indexOf('w');
        System.out.println(s1Index); // 3
        int s2Index = s1.indexOf("owl");
        int s3Index = s1.indexOf('e');
        int s4Index = s1.lastIndexOf('e'); // 8
        System.out.println(s3Index); // 5 and 8 returns 5 ( first index )
        System.out.println(s2Index); // gives the starting index only 2
        System.out.println(s4Index); // 8
    }
}
