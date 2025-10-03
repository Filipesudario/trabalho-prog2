/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.observer;

public interface ILoja {
    void adicionarCliente(ICliente cliente);
    void removerCliente(ICliente cliente);
    void notificarClientes(String mensagem);
    void iniciarLeilao(String produto, double precoMinimo);
}