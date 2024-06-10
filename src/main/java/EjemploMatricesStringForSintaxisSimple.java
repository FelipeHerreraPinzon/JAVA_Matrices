public class EjemploMatricesStringForSintaxisSimple {
    public static void main(String[] args) {

        // aplicarlo solo cuando conocemos los datos bien
        String[][] nombres = {{"Pepe", "Juan"},{"Daniel", "Oscar"},{"Felipe", "Matías"}};


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
