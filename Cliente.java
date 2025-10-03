/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.observer;

import java.util.Random;

public class Cliente implements ICliente {
    private String nome;
    private double lance;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Cliente " + nome + " recebeu: " + mensagem);
    }

    @Override
    public double darLance(double precoMinimo) {
        // Para simplificar: cada cliente dá um lance aleatório acima do preço mínimo
        Random rand = new Random();
        lance = precoMinimo + (rand.nextInt(200) + 1);
        return lance;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public double getLance() {
        return lance;
    }
}