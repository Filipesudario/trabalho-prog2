/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.observer;

import java.util.ArrayList;
import java.util.List;

public class Loja implements ILoja {
    private List<ICliente> clientes = new ArrayList<>();

    @Override
    public void adicionarCliente(ICliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void removerCliente(ICliente cliente) {
        clientes.remove(cliente);
    }

    @Override
    public void notificarClientes(String mensagem) {
        for (ICliente c : clientes) {
            c.atualizar(mensagem);
        }
    }

    @Override
    public void iniciarLeilao(String produto, double precoMinimo) {
        notificarClientes("Leilão iniciado! Produto: " + produto + " | Preço mínimo: R$" + precoMinimo);

        double maiorLance = precoMinimo;
        ICliente vencedor = null;

        for (ICliente c : clientes) {
            double lance = c.darLance(precoMinimo);
            System.out.println(">>> " + c.getNome() + " ofereceu R$" + lance);
            if (lance > maiorLance) {
                maiorLance = lance;
                vencedor = c;
            }
        }

        if (vencedor != null) {
            notificarClientes("Produto vendido para " + vencedor.getNome() + " por R$" + maiorLance);
        } else {
            notificarClientes("Nenhum cliente ofereceu acima do preço mínimo.");
        }
    }
}