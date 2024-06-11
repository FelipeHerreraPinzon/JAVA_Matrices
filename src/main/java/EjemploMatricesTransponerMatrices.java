public class EjemploMatricesTransponerMatrices {
    public static void main(String[] args) {
/*
0	3	6	9
1	4	7	10
2	5	8	11
3	6	9	12
4	7	10	13
5	8	11	14
6	9	12	15
7	10	13	16
 */
        int[][] a,b;
        a = new int[8][4];
        b = new int[4][8];

        for(int i =0; i < a.length; i++){
            for(int j =0; j < a[i].length; j++){
                a[i][j] = i+j*3;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        for(int i =0; i< a.length; i++){
            for(int j =0; j < a[i].length; j++){
                b[j][i]= a[i][j];
            }
        }
        System.out.println("la matriz transpuesta de b:");
        for(int i =0; i<b.length; i++){
            for(int j =0; j<b[i].length; j++){
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
