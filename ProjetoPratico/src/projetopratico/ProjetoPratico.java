package projetopratico;

import java.util.Scanner;

/**
 *
 * @author Daniel Brandão
 */
public class ProjetoPratico {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String entrada;
        String estado = "q0";
        System.out.println("Por favor digite a atribuição a ser validada: ");
        entrada = ler.nextLine();
        int tamanhoEntrada = entrada.length();
        int posicaoEntrada = 0;
        System.out.println("Iniciou no estado " + estado);
        if (tamanhoEntrada > 0) {
            if (entrada.charAt(posicaoEntrada) >= 97 && entrada.charAt(posicaoEntrada) <= 122) {
                estado = "q1";
                System.out.println(entrada.charAt(posicaoEntrada) + " - Entrou no estado " + estado);
                if (tamanhoEntrada > 1) {
                    posicaoEntrada++;
                    //Verifica se pertence ao token identifador                
                    posicaoEntrada = identificador(entrada, posicaoEntrada, tamanhoEntrada, estado);
                    if (entrada.charAt(posicaoEntrada) == 61) {
                        estado = "q2";
                        System.out.println(entrada.charAt(posicaoEntrada) + " - Entrou no estado " + estado);
                        posicaoEntrada++;

                        if (entrada.charAt(posicaoEntrada) >= 48 && entrada.charAt(posicaoEntrada) <= 57) {
                            estado = "q4";
                            System.out.println(entrada.charAt(posicaoEntrada) + " - Entrou no estado " + estado);
                            posicaoEntrada++;
                            posicaoEntrada = numero(entrada, posicaoEntrada, tamanhoEntrada, estado);
                            if (entrada.charAt(posicaoEntrada) == 59) {
                                estado = "q6";
                                System.out.println(entrada.charAt(posicaoEntrada) + " - Entrou no estado " + estado);
                                System.out.println("Atribuição Válida");
                            } else {
                                System.out.println("Atribuição Inválida");
                            }
                        } else {
                            if (entrada.charAt(posicaoEntrada) >= 97 && entrada.charAt(posicaoEntrada) <= 122) {
                                estado = "q3";
                                System.out.println(entrada.charAt(posicaoEntrada) + " - Entrou no estado" + estado);
                                posicaoEntrada++;
                                posicaoEntrada = identificador(entrada, posicaoEntrada, tamanhoEntrada, estado);
                                if (entrada.charAt(posicaoEntrada) == 59) {
                                    estado = "q6";
                                    System.out.println(entrada.charAt(posicaoEntrada) + " - Entrou no estado" + estado);
                                    System.out.println("Atribuição Válida");

                                } else {
                                    System.out.println("Atribuição Inválida");

                                }
                            } else {
                                System.out.println("Atribuição Inválida");
                            }
                        }
                    } else {
                        System.out.println("Atribuição Inválida");
                    }
                } else {
                    System.out.println("Atribuição Inválida");
                }
            } else {
                System.out.println("Atribuição Inválida");
            }
        } else {
            System.out.println("Atribuição Inválida");
        }
    }

    public static int identificador(String entrada, int posicaoEntrada, int tamanhoEntrada, String estado) {
        while (posicaoEntrada < tamanhoEntrada - 1
                && entrada.charAt(posicaoEntrada) >= 97
                && entrada.charAt(posicaoEntrada) <= 122
                || posicaoEntrada < tamanhoEntrada - 1
                && entrada.charAt(posicaoEntrada) == 95
                || posicaoEntrada < tamanhoEntrada - 1
                && entrada.charAt(posicaoEntrada) >= 48
                && entrada.charAt(posicaoEntrada) <= 57) {

            System.out.println(entrada.charAt(posicaoEntrada) + " - Se manteve no estado " + estado);
            posicaoEntrada++;
        }
        return posicaoEntrada;
    }

    public static int numero(String entrada, int posicaoEntrada, int tamanhoEntrada, String estado) {
        while (posicaoEntrada < tamanhoEntrada - 1
                && entrada.charAt(posicaoEntrada) >= 48
                && entrada.charAt(posicaoEntrada) <= 57) {
            System.out.println(entrada.charAt(posicaoEntrada) + " - Se manteve no estado " + estado);
            posicaoEntrada++;
        }
        if (posicaoEntrada < tamanhoEntrada - 1
                && entrada.charAt(posicaoEntrada) == 46) {
            estado = "q7";
            System.out.println("Entrou no estado " + estado);
            posicaoEntrada++;
            if (posicaoEntrada < tamanhoEntrada - 1
                    && entrada.charAt(posicaoEntrada) >= 48
                    && entrada.charAt(posicaoEntrada) <= 57) {
                estado = "q5";
        while (posicaoEntrada < tamanhoEntrada - 1
                && entrada.charAt(posicaoEntrada) >= 48
                && entrada.charAt(posicaoEntrada) <= 57) {
            System.out.println(entrada.charAt(posicaoEntrada) + " - Se manteve no estado " + estado);
            posicaoEntrada++;
        }
            } else {
                posicaoEntrada--;
            }
        }
        return posicaoEntrada;
    }
}
