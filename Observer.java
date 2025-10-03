/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package trabalho.observer;

public class Observer {
    public static void main(String[] args) {
        System.out.println("Demonstração do Leilão com Observer");

        ICliente c1 = new Cliente("Alice");
        ICliente c2 = new Cliente("Bruno");
        ICliente c3 = new Cliente("Carla");

        Loja leiloeiro = new Loja();
        leiloeiro.adicionarCliente(c1);
        leiloeiro.adicionarCliente(c2);
        leiloeiro.adicionarCliente(c3);

        leiloeiro.iniciarLeilao("Notebook Gamer", 1000.0);
    }
}