package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {
	public RedesController() {
		super();
	}
	private String os(){
		String os = System.getProperty("os.name");
		return os;
	}
	public void ip() {
		String process;
		if(os().contains("Windows")) process = "IPCONFIG";
		else process = "IFCONFIG";
		try {
			Process p = Runtime.getRuntime().exec(process);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			BufferedReader buffer2 = new BufferedReader(leitor);
			String linha = buffer.readLine();
			String linha2 = buffer2.readLine();
			while(linha != null) {
				if(linha.contains("Adaptador")) {
						linha2 = buffer2.readLine();
						linha2 = buffer2.readLine();
						linha2 = buffer2.readLine();
						linha2 = buffer2.readLine();
					if(linha2.contains("IPv4")){
						System.out.println(linha);
					}
				}
				linha = buffer.readLine();
				linha2 = linha;
				buffer2 = buffer;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
