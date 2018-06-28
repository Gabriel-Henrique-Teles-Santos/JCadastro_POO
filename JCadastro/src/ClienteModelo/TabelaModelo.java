package ClienteModelo;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import Cliente.CadCliente;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author1 Gabriel Henrique Teles Santos
 * @author2 Gabriel Dordal Tinelli
 * @since 27/06/18
 * @version 1.0
 */

public class TabelaModelo extends AbstractTableModel {

    private Vector<String> colunas;
    private Vector<Vector> linhas;

    public TabelaModelo() {
        colunas = new Vector<String>();
        colunas.add("Codigo");
        colunas.add("Nome");
        //colunas.add("Email");
        //colunas.add("Password");
        //colunas.add("cep");
        //colunas.add("Data_De_Nascimento");
        //colunas.add("Pais_De_Origem");
       // colunas.add("CPF");
       

        linhas = new Vector<Vector>();
    }

    public void preencher(List<CadCliente> lista) {        
        linhas.removeAllElements();
            
        for (CadCliente rem : lista) {
            Vector<Object> linha = new Vector<Object>();
            
            linha.add(rem.getCodigo());
            linha.add(rem.getNome());
          
            linhas.add(linha);
        }
        fireTableDataChanged();
    }
    
     @Override
    public int getColumnCount() {
        return colunas.size();
    }
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return linhas.get(rowIndex).get(columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return colunas.get(column);
    }
}
