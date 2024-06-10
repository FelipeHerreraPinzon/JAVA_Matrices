public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        String[][] nombres = new String[3][2];

        nombres[0][0] = "Pepe";
        nombres[0][1] = "Juan";
        nombres[1][0] = "Daniel";
        nombres[1][1] = "Oscar";
        nombres[2][0] = "Felipe";
        nombres[2][1] = "Matías";

        // iterando con for
        System.out.println("iterando con for");
        for(int i =0; i< nombres.length; i++){
            for(int j =0; j < nombres[i].length; j++){
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("iterando con for each");

        for(String[] fila:nombres){
            for(String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }

    }
}
