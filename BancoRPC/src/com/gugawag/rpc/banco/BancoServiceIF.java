package com.gugawag.rpc.banco;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BancoServiceIF extends Remote {

    double saldo(String conta) throws RemoteException;
    int quantidadeContas() throws RemoteException;
    String adicionarConta(String numero, double saldo) throws RemoteException;
    String pesquisarConta(String numero) throws RemoteException;
    String removerConta(String numero) throws RemoteException;
}
