public class MyArrays {
    public static void main(String[] args) {
        int[][] myarr = {

                // 3 dept with 4 students each
                {11,22,33,44},
                {55,66,77,88},
                {101,110,210,410}
        };
        System.out.println(myarr.length);
        System.out.println(myarr[0]);
        System.out.println(myarr[1]);
        System.out.println(myarr[2]);
        System.out.println("Length of each element of an array ");
        System.out.println(myarr[0].length);
        System.out.println(myarr[1].length);
        System.out.println(myarr[0].length);
        System.out.println("to find element 77");
        System.out.println(myarr[1][2]);
    }
}
