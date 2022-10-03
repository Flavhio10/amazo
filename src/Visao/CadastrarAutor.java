package Visao;

import Controle.ControleAutor;
import Modelo.Autor;
import Modelo.persistencia.AutorDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Flávio e Ramiro
 */
public class CadastrarAutor extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarAutor
     */
    public CadastrarAutor() {
        initComponents();
        this.setLocation(300, 65);
        try {
            lerTabela();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public void lerTabela() {

        List<Autor> listAutores = new ArrayList<>();
        listAutores.addAll(new AutorDao().listarTodos());
        DefaultTableModel modelo = (DefaultTableModel) this.tabelaAutores.getModel();
        this.tabelaAutores.setRowSorter(new TableRowSorter(modelo));
        modelo.setNumRows(0);

        for (Autor autor : listAutores) {
            modelo.addRow(new Object[]{autor.getId(), autor.getNome()});
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
        jLabel2 = new javax.swing.JLabel();
        txtNomeAutor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtIdAutor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAutores = new javax.swing.JTable();
        btnSalvarAutor = new javax.swing.JButton();
        btnEditarAutor = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastrar autor");
        setPreferredSize(new java.awt.Dimension(760, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Novo autor"));

        jLabel2.setText("Nome:");

        jLabel1.setText("Id:");

        txtIdAutor.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Autores"));

        tabelaAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome"
            }
        ));
        tabelaAutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAutoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAutores);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSalvarAutor.setText("Salvar");
        btnSalvarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAutorActionPerformed(evt);
            }
        });

        btnEditarAutor.setText("Alterar");
        btnEditarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAutorActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvarAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarAutor)
                    .addComponent(btnSalvarAutor)
                    .addComponent(btnLimpar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAutorActionPerformed
        
            String nome = this.txtNomeAutor.getText();
            new ControleAutor().cadastrar(new Autor(nome));
            this.txtNomeAutor.setText("");
            lerTabela();
        
    }//GEN-LAST:event_btnSalvarAutorActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.txtNomeAutor.setText("");
        this.txtIdAutor.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tabelaAutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAutoresMouseClicked
        int indice = this.tabelaAutores.getSelectedRow();
        this.txtIdAutor.setText(this.tabelaAutores.getValueAt(indice, 0).toString());
        this.txtNomeAutor.setText(this.tabelaAutores.getValueAt(indice, 1).toString());
    }//GEN-LAST:event_tabelaAutoresMouseClicked

    private void btnEditarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAutorActionPerformed
       
            long id = Long.parseLong(this.txtIdAutor.getText());
            String nome = this.txtNomeAutor.getText();
            new ControleAutor().alterar(new Autor(id, nome));
            this.txtNomeAutor.setText("");
            this.txtIdAutor.setText("");
            lerTabela();
        
    }//GEN-LAST:event_btnEditarAutorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarAutor;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvarAutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAutores;
    private javax.swing.JTextField txtIdAutor;
    private javax.swing.JTextField txtNomeAutor;
    // End of variables declaration//GEN-END:variables
}
