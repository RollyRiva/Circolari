/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riva_roland
 */
public class Docente {
    private String nome_cognome;
    private String ricevimento;

    public Docente() {
    }

    public Docente(String nome_cognome, String ricevimento) {
        this.nome_cognome = nome_cognome;
        this.ricevimento = ricevimento;
    }

    public String getNome_cognome() {
        return nome_cognome;
    }

    public void setNome_cognome(String nome_cognome) {
        this.nome_cognome = nome_cognome;
    }

    public String getRicevimento() {
        return ricevimento;
    }

    public void setRicevimento(String ricevimento) {
        this.ricevimento = ricevimento;
    }

    @Override
    public String toString() {
        return "Docente{" + "nome_cognome=" + nome_cognome + ", ricevimento=" + ricevimento + '}';
    }
    
    
}
