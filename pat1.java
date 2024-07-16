public class pat1 {
    public static void main(String[] args) {
        int n = 4; // Number of rows
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
Output : 
            * * * * 
            * * * * 
            * * * * 
            * * * * 
 */