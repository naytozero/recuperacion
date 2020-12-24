package sumadormatrices ;
 public class sumadorMatrices {

    public static void main (String [] Args) {
        int [][] matriz1 = new int[][] { {164,16,32}, {48,64,80},{16,40,24} };
        int [][] matriz2 = new int[][] { {1,6,2}, {2,8,5},{4,10,3} };
        sumarOtraMatriz (matriz1, matriz2);
    }

    public static int[][] sumarOtraMatriz(int[][] matrizA , int[][] matrizB) {
        int[][] matrizResultado;
        int filasA =matrizA.length;
        int columnasA = matrizA[0].length;

        int filasB =matrizB.length;
        int columnasB = matrizB[0].length;

        System.out.println("Primera matriz:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                System.out.print(matrizA[i][j] + "   ");
            }
            System.out.println("");
        }

        System.out.println("Segunda matriz:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                System.out.print(matrizA[i][j] + "   ");
            }
            System.out.println("");
        }

        if (filasA==filasB && columnasB==columnasA) {

            matrizResultado = new int[filasA][columnasA];
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasA; j++) {
                    matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }

        } else {
            throw new Error("ahi un problema ");
        }
        System.out.println("Matriz resultado:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                System.out.print(matrizResultado[i][j] + "   ");
            }
            System.out.println("");
        }
        return matrizResultado;
    }
}
 

