package view;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		RedesController rede = new RedesController();
		//String os = rede.os();
		//System.out.println(os);
		int opc = 0;
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "Entre com a opção desejada:\n"
					+ "1 - Método IP\n"
					+ "2 - Método PING\n"
					+ "9 - Finalizar Programa"));
			switch (opc) {
			case 1: {
				rede.ip();
				break;
			}
			//case 2: rede.ping();
			case 9: {
				JOptionPane.showMessageDialog(null,"*** Fim do Programa ***");
				break;
			}
			default: JOptionPane.showMessageDialog(null, "Opção Inválida!");
				;
			}
		}
		
	}
}
