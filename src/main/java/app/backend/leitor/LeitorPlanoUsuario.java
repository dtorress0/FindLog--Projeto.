/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.backend.app.leitor;

import app.backend.domain.LoginDomain;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author gustavo.felix
 */
public class LeitorPlanoUsuario {

    private ArrayList<String> dadosLeitura = new ArrayList<>();

    private File arquivoCSV;

    private FileReader leitor;
    
    private Planos plano;

    public LeitorPlanoUsuario(File file) {
        this.arquivoCSV = file;
        
        retornaLeitor();
    }

    public String verificaPlanoUsuario(String usuario) throws IOException {
        leitorDeLinhas(getLeitor());
        buscaESetaTipoDePlano(getDadosLeitura(), usuario);
        if (getPlano() == null) {
            setPlano(Planos.N);
        }
        return getPlano().name();
    }
    
    public void leitorDeLinhas(FileReader fileReader) throws IOException {
        BufferedReader saida = new BufferedReader(fileReader);
        String line = "";
        while ((line = saida.readLine()) != null) {
            this.dadosLeitura.add(line);
        }
    }


    public void buscaESetaTipoDePlano(ArrayList<String> dadosLeitura, String usuario) {

        for (String value : dadosLeitura) {
            String[] lineValue = value.split(",");
            if ((lineValue[0].equals(usuario)) && (lineValue[1].equalsIgnoreCase("N"))) {
                this.plano = Planos.N;
            } else {
                if (lineValue[1].equalsIgnoreCase(Planos.Basic.name())) {
                    this.plano = Planos.Basic;
                } else if (lineValue[1].equalsIgnoreCase(Planos.Starter.name())) {
                    this.plano = Planos.Starter;
                } else if (lineValue[1].equalsIgnoreCase(Planos.Pro.name())) {
                    this.plano = Planos.Pro;
                }
            }
        }
    }

    public boolean naoTemPlano(String[] lineValue, String usuario) {
        return (lineValue[1].equals(usuario)) && (lineValue[2].equalsIgnoreCase("N"));
    }


    public void retornaLeitor() {
        try {
            this.leitor = new FileReader(this.arquivoCSV);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getDadosLeitura() {
        return dadosLeitura;
    }

    public void setDadosLeitura(ArrayList<String> dadosLeitura) {
        this.dadosLeitura = dadosLeitura;
    }

    public File getArquivoCSV() {
        return arquivoCSV;
    }

    public void setArquivoCSV(File arquivoCSV) {
        this.arquivoCSV = arquivoCSV;
    }

    public FileReader getLeitor() {
        return leitor;
    }

    public void setLeitor(FileReader leitor) {
        this.leitor = leitor;
    }

    public Planos getPlano() {
        return plano;
    }

    public void setPlano(Planos plano) {
        this.plano = plano;
    }
    
    
    
    
}
