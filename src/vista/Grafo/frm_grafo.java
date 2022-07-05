/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista.Grafo;

import controlador.tda.grafo.GrafoD;
import controlador.tda.grafo.GrafoND;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import vista.Grafo.Ejemplo.FmrVistaGrafo;
import vista.Grafo.ModeloTablas.ModeloTablaGrafo;
import vista.Grafo.ModeloTablas.ModeloTablaGrafoNoDirigido;

/**
 *
 * @author javisarango
 */
public class frm_grafo extends javax.swing.JDialog {
    
    private GrafoD grafoD;
    private GrafoND grafoND;
    private ModeloTablaGrafo mtg = new ModeloTablaGrafo();
    private ModeloTablaGrafoNoDirigido mtgnd = new ModeloTablaGrafoNoDirigido();

    /**
     * Creates new form frm_grafo
     */
    public frm_grafo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        PaneldeTabla.setVisible(false);
    }
    
    private void generarGrafo() {
        Integer v = Integer.parseInt(cbxNumV.getSelectedItem().toString());
        Integer tipografo = cbxGrafo.getSelectedIndex();
        
        if (tipografo == 0) {
            
            this.grafoD = new GrafoD(v);
            
        } else if (tipografo == 1) {
            
            this.grafoD = new GrafoND(v);
        }
        
        cbxVOrigen.removeAllItems();
        cbxVDestino.removeAllItems();
        for (int i = 1; i <= v; i++) {
            cbxVOrigen.addItem(String.valueOf(i));
            cbxVDestino.addItem(String.valueOf(i));
        }
        cargarTabla();
        PaneldeTabla.setVisible(true);
        
    }
    
    private void cargarTabla() {
        
        mtg.setGrafoD(grafoD);
        tblAdyacencias.setModel(mtg);
        mtg.fireTableStructureChanged();
        
        tblAdyacencias.updateUI();
    }
    
    private void adyacencias() {
        try {  
        Double peso = Double.parseDouble(txtPeso.getText().trim());
        Integer i = Integer.parseInt(cbxVOrigen.getSelectedItem().toString());
        Integer f = Integer.parseInt(cbxVDestino.getSelectedItem().toString());
                  
            if (i == f) {
                JOptionPane.showMessageDialog(null, "Vertices Iguales", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    grafoD.insertarArista(i, f, peso);
                    cargarTabla();
                } catch (Exception e) {
                    System.out.println("Error en adyacencias");
                    JOptionPane.showMessageDialog(null, "No se pudo Insertar", "ERROR", JOptionPane.ERROR_MESSAGE);
                    
                }
                
            }
        } catch (Exception e) {
            System.out.println("Error al añadir adyacencias");
            JOptionPane.showMessageDialog(null, "No se puede Insertar"+e.toString().toUpperCase(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
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
        cbxNumV = new javax.swing.JComboBox<>();
        jButtonGenerar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbxGrafo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbxVOrigen = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbxVDestino = new javax.swing.JComboBox<>();
        jButtonGenerarGrafo = new javax.swing.JButton();
        txtPeso = new javax.swing.JTextField();
        PaneldeTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdyacencias = new javax.swing.JTable();
        btnMostrarGrafo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nro Vertices:");

        cbxNumV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "5", "6", "7", "8", "9" }));

        jButtonGenerar.setText("Generar");
        jButtonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo de Grafo:");

        cbxGrafo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dirigido", "No Dirigido" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxNumV, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(jButtonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxNumV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 700, 50);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jLabel2.setText("Vértice Origen:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 10, 100, 30);

        cbxVOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));
        jPanel3.add(cbxVOrigen);
        cbxVOrigen.setBounds(110, 10, 60, 30);

        jLabel3.setText("Vértice Destino:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(190, 10, 100, 30);

        cbxVDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));
        jPanel3.add(cbxVDestino);
        cbxVDestino.setBounds(300, 10, 80, 30);

        jButtonGenerarGrafo.setText("OK");
        jButtonGenerarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarGrafoActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonGenerarGrafo);
        jButtonGenerarGrafo.setBounds(600, 10, 90, 30);
        jPanel3.add(txtPeso);
        txtPeso.setBounds(410, 10, 120, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 70, 700, 60);

        PaneldeTabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PaneldeTabla.setLayout(null);

        tblAdyacencias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblAdyacencias);

        PaneldeTabla.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 680, 210);

        btnMostrarGrafo.setText("Mostrar");
        btnMostrarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarGrafoActionPerformed(evt);
            }
        });
        PaneldeTabla.add(btnMostrarGrafo);
        btnMostrarGrafo.setBounds(300, 230, 100, 30);

        jPanel1.add(PaneldeTabla);
        PaneldeTabla.setBounds(10, 140, 700, 270);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 420);

        setSize(new java.awt.Dimension(728, 447));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarActionPerformed
        // TODO add your handling code here:
        generarGrafo();
    }//GEN-LAST:event_jButtonGenerarActionPerformed

    private void jButtonGenerarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarGrafoActionPerformed
        // TODO add your handling code here:
        adyacencias();
    }//GEN-LAST:event_jButtonGenerarGrafoActionPerformed

    private void btnMostrarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarGrafoActionPerformed
        // TODO add your handling code here:
        FmrVistaGrafo ventana = new FmrVistaGrafo(grafoD);
        ventana.setSize(new Dimension(400, 400));
        ventana.setVisible(true);
    }//GEN-LAST:event_btnMostrarGrafoActionPerformed

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
            java.util.logging.Logger.getLogger(frm_grafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_grafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_grafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_grafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frm_grafo dialog = new frm_grafo(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel PaneldeTabla;
    private javax.swing.JButton btnMostrarGrafo;
    private javax.swing.JComboBox<String> cbxGrafo;
    private javax.swing.JComboBox<String> cbxNumV;
    private javax.swing.JComboBox<String> cbxVDestino;
    private javax.swing.JComboBox<String> cbxVOrigen;
    private javax.swing.JButton jButtonGenerar;
    private javax.swing.JButton jButtonGenerarGrafo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAdyacencias;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
