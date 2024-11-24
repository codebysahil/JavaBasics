// Jagged 2-D array
public class MA02 {

    public static void main(String[] args) {
        int arr[][] = {
                {10,20},
                {30,49,50},
                {90,12,144}

        };
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }


        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("Traversing an 2 d array using enhanced for loop ...");

        for ( int[] k  : arr){
            for( int j : k) {
                System.out.print(j+ " ");

            }
            System.out.println();
        }
    }
}
