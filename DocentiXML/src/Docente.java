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
    private String id;
    private String nome_cognome;
    private String ricevimento;
    private String classe;
    private String lotto;

    public Docente() {
    }

    public Docente(String id, String nome_cognome, String ricevimento, String classe, String lotto) {
        this.id = id;
        this.nome_cognome = nome_cognome;
        this.ricevimento = ricevimento;
        this.classe = classe;
        this.lotto = lotto;
    }

    @Override
    public String toString() {
        return "Docente{" + "id=" + id + ", nome_cognome=" + nome_cognome + ", ricevimento=" + ricevimento + ", classe=" + classe + ", lotto=" + lotto + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getLotto() {
        return lotto;
    }

    public void setLotto(String lotto) {
        this.lotto = lotto;
    }

   
    
    
}
