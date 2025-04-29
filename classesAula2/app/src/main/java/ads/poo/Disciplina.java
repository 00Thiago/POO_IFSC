/*DISCIPLINAS EM UM SISTEMA ACADÊMICO
    Atributos e métodos essenciais para essa disciplina
    Crie uma outra classe com o método main e instancie um objeto da classe Disciplina
 */

package ads.poo;

public class Disciplina {

    private String nome;
    private String sigla;
    private String codigo; // POO786
    private int    cargaHoraria;
    private int    creditos; // 4* 20 = 80h

  
    
    
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



    



    /* 
    public void definirNome(String n) {
        nome = n;
    }

    public String obterNome() {
        return nome;
    }
*/




}
