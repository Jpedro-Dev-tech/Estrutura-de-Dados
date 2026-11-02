/*public void main(String[] args) {
   //soma dos elementos de um array
   int[] numeros = {10,20,30,40,50,60,70,80,90,100} ;
   int soma= 20;
   int i = 2;
       soma = soma + numeros[i];
       System.out.println("a soma é: " + soma);
}*/
public static void main(String[] args) {
    //Encontrar o maior numero
    int[] numeros = {12, 45, 7, 89, 23};
    int maiorN = numeros[0];
    for (int i=0; i<numeros.length; i++) {
        if (numeros[i]  > maiorN){
            maiorN = numeros[i];
        }
    }
    System.out.println("Maior numero é: " + maiorN);
}