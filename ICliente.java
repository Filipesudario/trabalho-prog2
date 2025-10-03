/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.observer;

public interface ICliente {
    void atualizar(String mensagem);
    double darLance(double precoMinimo);
    String getNome();
}