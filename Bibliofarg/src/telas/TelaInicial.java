
package telas;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPainel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1Arquivo = new javax.swing.JMenu();
        jMenu1Arquivo.setFont(new Font("Arial", Font.PLAIN, 13));
        jMenu2Cliente = new javax.swing.JMenu();
        jMenu2Cliente.setFont(new Font("Arial", Font.PLAIN, 13));
        menuItemClientesCadastrar = new javax.swing.JMenuItem();
        menuItemClientesCadastrar.setFont(new Font("Arial", Font.PLAIN, 12));
        menuItemClientesEmprestimo = new javax.swing.JMenuItem();
        menuItemClientesEmprestimo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        jMenu3Livros = new javax.swing.JMenu();
        jMenu3Livros.setFont(new Font("Arial", Font.PLAIN, 13));
        menuItemCadastrarLivros = new javax.swing.JMenuItem();
        menuItemCadastrarLivros.setFont(new Font("Arial", Font.PLAIN, 12));
        menuItemCadastrarLivros.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        setPreferredSize(new java.awt.Dimension(1024, 768));

        jMenu1Arquivo.setText("Arquivo");
        jMenuBar1.add(jMenu1Arquivo);

        jMenu2Cliente.setText("Clientes");

        menuItemClientesCadastrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
        menuItemClientesCadastrar.setText("Cadastrar");
        menuItemClientesCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClientesCadastrarActionPerformed(evt);
            }
        });
        jMenu2Cliente.add(menuItemClientesCadastrar);

        menuItemClientesEmprestimo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
        menuItemClientesEmprestimo.setText("Empr\u00E9stimo");
        menuItemClientesEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClientesEmprestimoActionPerformed(evt);
            }
        });
        jMenu2Cliente.add(menuItemClientesEmprestimo);

        jMenuBar1.add(jMenu2Cliente);

        jMenu3Livros.setText("Livros");

        menuItemCadastrarLivros.setText("Cadastrar");
        menuItemCadastrarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLivrosGerenciarActionPerformed(evt);
            }
        });
        jMenu3Livros.add(menuItemCadastrarLivros);

        jMenuBar1.add(jMenu3Livros);
        
        JMenuItem menuItemLivrosRelatorio = new JMenuItem("Relat\u00F3rio");
        menuItemLivrosRelatorio.setFont(new Font("Arial", Font.PLAIN, 12));
        menuItemLivrosRelatorio.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        jMenu3Livros.add(menuItemLivrosRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPainel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPainel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemClientesCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClientesCadastrarActionPerformed
        
        FormClientes tela = new FormClientes();
        jdpPainel.add( tela );
        tela.setVisible( true );
        
    }//GEN-LAST:event_menuItemClientesCadastrarActionPerformed

    private void menuItemLivrosGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLivrosGerenciarActionPerformed
        FormLivros tela = new FormLivros();
        jdpPainel.add( tela );
        tela.setVisible( true );
    }//GEN-LAST:event_menuItemLivrosGerenciarActionPerformed
    
    
    private void menuItemClientesEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLivrosGerenciarActionPerformed
        FormEmprestimo tela = new FormEmprestimo();
        jdpPainel.add( tela );
        tela.setVisible( true );
    }//GEN-LAST:event_menuItemLivrosGerenciarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1Arquivo;
    private javax.swing.JMenu jMenu2Cliente;
    private javax.swing.JMenu jMenu3Livros;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpPainel;
    private javax.swing.JMenuItem menuItemClientesCadastrar;
    private javax.swing.JMenuItem menuItemClientesEmprestimo;
    private javax.swing.JMenuItem menuItemCadastrarLivros;
}