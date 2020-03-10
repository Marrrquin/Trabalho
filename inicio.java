

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrabalhoJr extends JFrame {
	private Container c1;
	private JMenuBar mnBarra;
	private JMenu mnArquivo, mnformatar, mnexibir;
	private JMenuItem miSair, miLimpar, misalvar , miigor, mifonte, micor, mimaiusculo, miminusculo;

	public TrabalhoJr() {
		inicializarComponentes();
		definirEventos();
	}

	private void inicializarComponentes() {
		c1 = getContentPane();
		mnBarra = new JMenuBar();
		mnArquivo = new JMenu("ARQUIVO");
		mnArquivo.setMnemonic('A');
		mnformatar = new JMenu("FORMATAR");
		mnformatar.setMnemonic('F');
		mnexibir = new JMenu("EXIBIR");
		mnexibir.setMnemonic('E');
		miSair = new JMenuItem("Sair");
		miLimpar = new JMenuItem("Limpar");
		misalvar = new JMenuItem("Salvar");
		miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
		misalvar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		miigor = new JMenuItem("Negrito");
		mifonte = new JMenuItem("Fonte");
		micor = new JMenuItem("Cor");
		mimaiusculo = new JMenuItem("MAIUSCULO");
		miminusculo = new JMenuItem("minusculo");
		

		mnArquivo.add(miSair);
		mnArquivo.add(miLimpar);
		mnArquivo.add(misalvar);
		mnexibir.add(miigor);
		mnexibir.add(micor);
		mnformatar.add(mimaiusculo);
		mnformatar.add(miminusculo);
		mnformatar.add(mifonte);
		mnBarra.add(mnArquivo);
		mnBarra.add(mnexibir);
		mnBarra.add(mnformatar);
		setJMenuBar(mnBarra);

	}

	private void definirEventos() {
		miSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	
	}

	public static void main(String args[]) {
		JFrame frame = new TrabalhoJr();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setBounds(0, 0, 9000, 99600);
		frame.setVisible(true);

	}

}
