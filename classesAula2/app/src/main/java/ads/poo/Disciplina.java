/*DISCIPLINAS EM UM SISTEMA ACADÊMICO
    Atributos e métodos essenciais para essa disciplina
    Crie uma outra classe com o método main e instancie um objeto da classe Disciplina
 */

package ads.poo;

public class Disciplina {

    private String nome;
    private String sigla;
    private String codigo; // POO786
    private int    cargaHoraria; // 20h
    private int    creditos; // 4* 20 = 80h
/*
    public void setSigla(String siglaApp){
        sigla = siglaApp;
    }

    public void setNome(String nomeApp){
    nome = nomeApp;
    }

    public void setCodigo(String codigoApp){
        codigo = codigoApp;
    }

    public void setCH(int CHApp){
        cargaHoraria = CHApp;
    }

    public void setCreditos(int creditosApp){
        creditos = creditosApp;
    }
*/
    public void POO() {
        nome = "Programação Orientada a Objetos";
        sigla = "POO";
        codigo = "POO786";
        cargaHoraria = 20;
        creditos = 80;
    }

    public void COE(){
        nome = "Comunicação e Expressão";
        sigla = "COE";
        codigo = "COE786";
        cargaHoraria = 20;
        creditos = 40;
    }
        
    public void escolherDisciplina(String siglaApp) {
        sigla = siglaApp;
        switch (sigla) {
            case "POO" -> POO();
            case "COE" -> COE();
            default -> System.out.println("Disciplina inválida!");
        }
    }

    public String getDisciplina(){
        return ("Nome: " + nome + 
                "\nSigla: " + sigla + 
                "\nCódigo: " + codigo + 
                "\nCarga Horária: " + cargaHoraria + 
                "\nCréditos: " + creditos);
    }
  
    /*
    
    public Disciplina(String nome, String sigla, String codigo, int cargaHoraria, int creditos) {
        this.nome = nome;
        this.sigla = sigla;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.creditos = creditos;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public int getCreditos() {
        return creditos;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
    @Override
    public String toString() {
        return "Disciplina [nome=" + nome + ", sigla=" + sigla + ", codigo=" + codigo + ", cargaHoraria=" + cargaHoraria
                + ", creditos=" + creditos + "]";
    }
*/


    



    /* 
    public void definirNome(String n) {
        nome = n;
    }

    public String obterNome() {
        return nome;
    }
*/




}
