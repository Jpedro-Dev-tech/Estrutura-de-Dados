/*public void main(String[] args) {
   //soma dos elementos de um array
   int[] numeros = {10,20,30,40,50,60,70,80,90,100} ;
   int soma= 20;
   int i = 2;
       soma = soma + numeros[i];
       System.out.println("a soma é: " + soma);
}*/
/*public static void main(String[] args) {
    //Encontrar o maior numero com array
    int[] numeros = {12, 45, 7, 89, 23};
    int maiorN = numeros[0];
    for (int i=0; i<numeros.length; i++) {
        if (numeros[i]  > maiorN){
            maiorN = numeros[i];
        }
    }
    System.out.println("Maior numero é: " + maiorN);
}*/

//estrutura de dados utilizando Matriz
/*public static void main(String[] args) {
    //como declarar uma Matriz em Java?
    int[] [] matriz = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
    };
    /**
     * Observe que utilizamos dois pares de colchetes [][].
     * - Primeiro índice: representa a linha.
     * - Segundo índice: representa a coluna.

    System.out.println(matriz[1][2]);
}*/

public static void main(String[] args) {
    int[][] numeros = {
            {5, 10, 15},
            {20, 25, 30}
    };
    int soma = 0;
    for (int i=0; i< numeros.length; i++){
        for (int j=0; j< numeros[i].length; j++){
            soma = soma + numeros[i][j];
        }
    }
    System.out.println(soma);
}