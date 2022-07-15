/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.nataly;

import controlador.personaNataly.PersonaGrafoController;
import controlador.tda.lista.ListaEnlazada;
import javax.swing.JOptionPane;
import vista.nataly.modelo.ModeloTablaPersona;

/**
 *
 * @author sebastian
 */
public class FrmNatalyDisntacia extends javax.swing.JDialog {

    private PersonaGrafoController pgc;
    private ModeloTablaPersona mtp = new ModeloTablaPersona();

    /**
     * Creates new form FrmNatalyDisntacia
     */
    public FrmNatalyDisntacia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        
    }

    private void crear() {

        Integer nro = Integer.parseInt(cbxnro.getSelectedItem().toString());
        pgc = new PersonaGrafoController(nro);
        jPanel2.setVisible(true);
        jPanel4.setVisible(true);
        jPanel5.setVisible(true);
        String[] aux = {""};
        jList1.setListData(aux);
        btnModificar.setEnabled(false);
        cargarTabla();
        cargarcbxVertices();
    }

    private void cargarTabla() {
        mtp.setGrafo(pgc.getGend());
        mtp.fireTableStructureChanged();
        mtp.fireTableDataChanged();
        tbltabla.setModel(mtp);
        tbltabla.updateUI();
        System.out.println(pgc.getGend().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtlat = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtlong = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltabla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbxnro = new javax.swing.JComboBox<>();
        btnCrear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbxorigen = new javax.swing.JComboBox<>();
        btnVincular = new javax.swing.JButton();
        cbxdestino = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel1.setText("Nombres completos");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 30, 150, 17);

        jLabel2.setText("Latitud");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 110, 110, 17);

        jLabel3.setText("Longitud");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 70, 110, 17);
        jPanel2.add(txtlat);
        txtlat.setBounds(170, 90, 190, 23);
        jPanel2.add(txtnombre);
        txtnombre.setBounds(170, 10, 190, 23);
        jPanel2.add(txtlong);
        txtlong.setBounds(170, 50, 190, 23);

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar);
        btnModificar.setBounds(200, 140, 110, 23);

        tbltabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbltabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbltablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbltabla);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(390, 10, 270, 160);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 90, 680, 190);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jLabel4.setText("Nro personas");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 20, 90, 17);

        cbxnro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "5", "6", "7", "8", "9", "10" }));
        jPanel3.add(cbxnro);
        cbxnro.setBounds(120, 10, 130, 23);

        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel3.add(btnCrear);
        btnCrear.setBounds(300, 10, 90, 23);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 10, 680, 60);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel5.setText("Origen");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(20, 20, 90, 17);

        cbxorigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(cbxorigen);
        cbxorigen.setBounds(120, 10, 130, 23);

        btnVincular.setText("VINCULAR");
        btnVincular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVincularActionPerformed(evt);
            }
        });
        jPanel4.add(btnVincular);
        btnVincular.setBounds(560, 10, 110, 30);

        cbxdestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(cbxdestino);
        cbxdestino.setBounds(400, 10, 130, 23);

        jLabel6.setText("Destino");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(300, 20, 90, 17);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 300, 680, 60);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        jButton1.setText("Camino");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(570, 30, 80, 30);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(10, 10, 230, 80);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(10, 370, 680, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 700, 490);

        setSize(new java.awt.Dimension(734, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        crear();
    }//GEN-LAST:event_btnCrearActionPerformed
    private void cargarVista() {
        Integer fila = -1;
        fila = tbltabla.getSelectedRow();
        try {

            if (fila >= 0) {
                pgc.setPersona(pgc.getGend().obtenerEtiqueta(fila + 1));
                txtlat.setText(String.valueOf(pgc.getPersona().getUbicacion().getLatitud()));
                txtlong.setText(String.valueOf(pgc.getPersona().getUbicacion().getLongitud()));
                btnModificar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Elija una fila", "Advertencia", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }

    }

    private void cargarcbxVertices() {
        cbxdestino.removeAllItems();
        cbxorigen.removeAllItems();
        try {
            for (int i = 1; i <= pgc.getGend().numVertices(); i++) {
                cbxorigen.addItem(pgc.getGend().obtenerEtiqueta(i).toString());
                cbxdestino.addItem(pgc.getGend().obtenerEtiqueta(i).toString());
            }
        } catch (Exception e) {
        }

    }
    private void tbltablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbltablaMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            //Datos a mostrar en pantalla Modificar
            cargarVista();

        }
    }//GEN-LAST:event_tbltablaMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        try {
            modificar();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnVincularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVincularActionPerformed
        // TODO add your handling code here:
        try {
            adyacencia();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnVincularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            camino();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void Limpiar() {
        txtlat.setText("");
        txtlong.setText("");
        txtnombre.setText("");
        pgc.setPersona(null);
        btnModificar.setEnabled(false);
        cargarTabla();

    }

    private void modificar() throws Exception {
        if (txtnombre.getText().trim().length() == 0
                || txtlong.getText().trim().length() == 0
                || txtlat.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Campos vacios", "Advertencia", JOptionPane.ERROR_MESSAGE);

        } else {
            try {
                Integer pos = pgc.getGend().obtenerCodigo(pgc.getPersona());
                pgc.getPersona().setNombres(txtnombre.getText());
                pgc.getPersona().getUbicacion().setLatitud(Double.parseDouble(txtlat.getText()));
                pgc.getPersona().getUbicacion().setLongitud(Double.parseDouble(txtlong.getText()));
                if (pgc.getGend().modificar(pgc.getGend().obtenerEtiqueta(pos), pgc.getPersona())) {
                    cargarcbxVertices();
                    Limpiar();
                    JOptionPane.showMessageDialog(null, "Datos Modificados", "Exito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo Modificar", "Advertencia", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error", "Advertencia", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    private void adyacencia() {
        Integer origen = (cbxorigen.getSelectedIndex() + 1);
        Integer destino = (cbxdestino.getSelectedIndex() + 1);
        if (origen == destino) {
            JOptionPane.showMessageDialog(null, "Escoja clientes diferentes", "Advertencia", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Double distancia = pgc.calcularDistancia(pgc.getGend().obtenerEtiqueta(origen), pgc.getGend().obtenerEtiqueta(destino));
                pgc.getGend().insertarArista(pgc.getGend().obtenerEtiqueta(origen), pgc.getGend().obtenerEtiqueta(destino), distancia);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString(), "Advertencia", JOptionPane.ERROR_MESSAGE);
            }

        }

    }
    private void camino(){
    
     Integer origen = (cbxorigen.getSelectedIndex() + 1);
        Integer destino = (cbxdestino.getSelectedIndex() + 1);
        if (origen == destino) {
            JOptionPane.showMessageDialog(null, "Escoja clientes diferentes", "Advertencia", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                ListaEnlazada<Integer> lista = pgc.getGend().caminoMinimo(origen, destino);
               String[] aux = new String[lista.getSize()];
                for (int i = 0; i < lista.getSize(); i++) {
                    aux[i]= pgc.getGend().obtenerEtiqueta(lista.obtenerDato(i)).toString();
                }
                jList1.setListData(aux);
               
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmNatalyDisntacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNatalyDisntacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNatalyDisntacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNatalyDisntacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmNatalyDisntacia dialog = new FrmNatalyDisntacia(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVincular;
    private javax.swing.JComboBox<String> cbxdestino;
    private javax.swing.JComboBox<String> cbxnro;
    private javax.swing.JComboBox<String> cbxorigen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbltabla;
    private javax.swing.JTextField txtlat;
    private javax.swing.JTextField txtlong;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
