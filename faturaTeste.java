/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatura;

public class faturaTeste {
      public static void main(String[] args) {
        // cria uma nova fatura
        Fatura fatura = new Fatura("14545", "Teclado USB", 2, 600.0);

        // exibe as informações da fatura
        System.out.println("Numero da fatura: " + fatura.getNumero());
        System.out.println("Descricao: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preco por item: " + fatura.getPreco());

        // exibe o total da fatura
        System.out.println("Total da fatura: " + fatura.getTotalFatura());

        // modifica o preço por item e a quantidade
        fatura.setPreco(-10.0);
        fatura.setQuantidade(-3);

        // exibe o total da fatura novamente
        System.out.println("Total da fatura: " + fatura.getTotalFatura());
    }
}
