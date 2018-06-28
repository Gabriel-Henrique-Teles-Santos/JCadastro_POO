package ClienteModelo;

import Cliente.CadCliente;
import Cliente.DaoCliente;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author1 Gabriel Henrique Teles Santos
 * @author2 Gabriel Dordal Tinelli
 * @since 27/06/18
 * @version 1.0
 */
public class ComboModelo extends AbstractListModel<String> implements ComboBoxModel<String> {

    private List<String> lista;
    private String selecionado;

    public ComboModelo() {
        try {
            lista = DaoCliente.class.newInstance().findAllNames();
            lista.add(0, "SELECIONE UM CLIENTE");
        }
        catch (Exception ex) {
            Logger.getLogger(ComboModelo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Cliente", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public String getElementAt(int index) {
        return lista.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado = (String) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selecionado;
    }
}