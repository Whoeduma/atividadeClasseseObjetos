/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empregado;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Jose", "Silva", 1800.0);
        Empregado empregado2 = new Empregado("Maria", "Santos", 4000.0);
        
        System.out.printf("Salario anual do empregado 1: %.2f%n", empregado1.getSalarioAnual());
        System.out.printf("Salario anual do empregado 2: %.2f%n", empregado2.getSalarioAnual());
        
        empregado1.aumentarSalario(10);
        empregado2.aumentarSalario(10);
        
        System.out.printf("Novo salario anual do empregado 1: %.2f%n", empregado1.getSalarioAnual());
        System.out.printf("Novo salario anual do empregado 2: %.2f%n", empregado2.getSalarioAnual());
    }
}


