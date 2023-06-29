package app.backend.app.leitor;

import app.backend.domain.LoginDomain;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeitorCSV {
    
    private final ArrayList<String> dadosLeitura = new ArrayList<>();

    private final File arquivoCSV;
    
    private FileReader leitor;
    
    public LeitorCSV(File file) {
        this.arquivoCSV = file;
    }
    
    public boolean buscaLoginArquivoCsv(LoginDomain login) throws IOException {
        retornaLeitor();
        leitorDeLinhas(arquivoCSV);
        return verificaLoginNoArquivo(dadosLeitura, login);
    }
    
    public void leitorDeLinhas(File arquivo) throws IOException{
        BufferedReader saida = new BufferedReader(this.leitor);
        String line = "";
        while ((line = saida.readLine()) != null) {
                dadosLeitura.add(line);
        } 
    }

    public boolean verificaLoginNoArquivo(ArrayList<String> dadosLeitura, LoginDomain login) {
        boolean loginNoArquivo = false;
        for (String value : dadosLeitura) {
            String[] linevalue = value.split(",");
            if ((linevalue[1].equals(login.getUsuario())) && (linevalue[2].equals(login.getSenha()))) {
                loginNoArquivo = true;
            }
        }
        return loginNoArquivo;
    }
    
    
    
    public void retornaLeitor() {
        try {
           this.leitor = new FileReader(getArquivoCSV());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public File getArquivoCSV() {
        return this.arquivoCSV;
    }

    public ArrayList<String> getDadosLeitura() {
        return dadosLeitura;
    }
    
    

}
