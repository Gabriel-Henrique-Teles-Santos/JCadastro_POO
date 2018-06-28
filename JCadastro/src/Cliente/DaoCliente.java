/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.ResultSet;
import util.ConexaoRegistro;

/**
 *
 * @author1 Gabriel Henrique Teles Santos
 * @author2 Gabriel Dordal Tinelli
 * @since 27/06/18
 * @version 1.0
 */
public class DaoCliente {
    private static Connection conexao;
    
    public boolean salvar(CadCliente c1) {
        return true;
    }
    
    public DaoCliente(){
        try {
            conexao = ConexaoRegistro.conectar();
        } catch (Exception ex) {
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean inserir(CadCliente c) {
        //salvar dados no banco         
        String sql = "insert into cliente values(null,'" + c.getNome() + "')";
        StringBuffer sb = new StringBuffer(sql);
        PreparedStatement statement;
        try {
            statement = conexao.prepareStatement(sb.toString());
            //ResultSet resultset = statement.executeQuery();
            statement.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
     
        
    }

    public List<String> findAllNames() {
        //banco de dados
        CadCliente c1 = new CadCliente(20, "Mateus","gmail","123",12345678,12031990,"Brasil");
        CadCliente c2 = new CadCliente(10, "João","hotmail","234",98765432,23082006,"Estados Unidos");

        List cdClientes = new ArrayList<CadCliente>();
        cdClientes.add(c1.getNome());
        cdClientes.add(c2.getNome());
        
        return cdClientes;
    }
    
    public List<CadCliente> findAll() {
        CadCliente c1 = new CadCliente(20, "Mateus","gmail","123",12345678,12031990,"Brasil");
        CadCliente c2 = new CadCliente(10, "João","hotmail","234",98765432,23082006,"Estados Unidos");

        List cdClientes = new ArrayList<CadCliente>();
        cdClientes.add(c1);
        cdClientes.add(c2);
        
        return cdClientes;
    }
    
}
