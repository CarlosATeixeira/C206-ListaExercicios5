public class Funcionario {
    private int identificador = 0;
    private String estadoCivil = null;
    private String instrucao = null;
    private int filhos = 0;
    private float salario = 0.0f;

    public Funcionario(int identificador, String estadoCivil, String instrucao, int filhos, float salario){
        this.identificador = identificador;
        this.estadoCivil = estadoCivil;
        this.instrucao = instrucao;
        this.filhos = filhos;
        this.salario = salario;
    }
}
