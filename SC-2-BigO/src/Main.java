public class Main {

    /*
    BigO - Intro

    Como definir se dois códigos que fazem a mesma coisa, porém é escrito de formas diferentes?
    BigO é uma forma de comparar de forma matematica qual código é mais eficiente de duas formas:
    Time Complexity irá verificar quanto tempo demora mais principalmente quantas "ordens" precisaram ser executadas.
    Space Complexity irá ver quanto de espaço o código ocupa e a sua eficiencia.

    Omega - Theta - BigO
    Numa array de números inteiros [1, 2, 3, 4, 5, 6, 7]
    O número 1 será o Omega - Melhor cenario
    O número 4 será o Theta - Pior cenario
    O número 7 será o BigO o pior dos piores cenarios

     */

    // O(n) n - neste caso seria a quantidade de vezes que loopamos
    static void printItems(int n){
        for(int i = 0;i < n; i++){
            for(int j = 0;j < n; j++){
                System.out.println(i + " " + j);
            }
        }

        /*
        for(int j = 0;j < n; j++){
            System.out.println(j);
        }
        */

    }

    /*
    * Em gráficos n seria o eixo x onde é o número que estmos operando e no eixo y o número de operações executadas
    * O(n) sempre será uma linha reta, o que chamamos de proporcional
    *
    * (eixo y)
    *      O
    *   20 |      /
    *   15 |     /
    *   10 |    /
    *    5 |   /
    *    0 |  /
    *       _____________________________   n (eixo x)
    *       0 2 4 6 8 10 12 14 16 18 20
    *
    *   Simplificação:
    *
    *   Drop Constants - Mesmo que repetimos n vezes, a anotação sempre será O(n)
    *
    *   O(n^2) - Quando há um loop dentro de outro loop, o tempo de complexidade é maior, o que não queremos
    *   deve-se sempre focar em escrever o código 0(n) pois segue a proporcionalidade
    *
    *
    * */



    public static void main(String[] args) {

        printItems(10);
    }
}