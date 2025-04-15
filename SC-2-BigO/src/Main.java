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
    // 0(n^2)
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

        // 0(n)
        for(int k = 0; k < n; k++){
            System.out.println(k);
        }

        // juntos 0(n^2 + n)
        // como 0(n^2) é o dominante, e n é exponencial, podemos tirar ele e ficarmos só com  0(n^2), isto é ->
        // Drop Non-Dominants
    }

    /*
    * Em gráficos n seria o eixo x onde é o número que estamos operando e no eixo y o número de operações executadas
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

    // O(1)
    // O(1) é sempre consistente pois os números de operações sempre serão 1 não importa quantos n sejam inseridos

    /*
    * (eixo y)
    *      O
    *   20 |
    *   15 |
    *   10 |
    *    5 |
    *    0 |
    *      |_____________________________ O(1)   n (eixo x)
    *       0 2 4 6 8 10 12 14 16 18 20
    *
    * */
    public static int addItems(int n){
        return n + n + n;
    }

    /*
    *
    * O(log n)
    * Quando precisamos procurar um elemento dentro de uma array, em vez de procurarmos elemento a elemento
    * cortamos a array ao meio e descartamos a parte que não há o número e vamos fazendo isso até acharmos o elemento
    * que queremos.
    * Ex:
    *
    *   Queremos achar o número 2
    *   [1, 2, 3, 4, 5, 6, 7, 8]
    *
    *   [1, 2, 3, 4]  -> [5, 6, 7, 8] <-
    *                     Descartado
    *
    *   [1, 2]   -> [3, 4] <-
    *               Descartado
    *
    *   -> [1] <-       [2]
    *      Descartado
    *
    *   [2]
    *   Achamos
    *
    * Foram 3 etapas até acharmos o elemento
    * a anotação é o mesmo que 2^3 = 8
    * ou em logaratimo
    * log\/2 8 = 3
    *
    * (eixo y)
    *      O
    *   20 |
    *   15 |
    *   10 |
    *    5 |
    *    0 | ___________________________0(log n)
    *      |/_____________________________   n (eixo x)
    *       0 2 4 6 8 10 12 14 16 18 20
    *
    * */

    public static void main(String[] args) {

        printItems(10);
    }
}