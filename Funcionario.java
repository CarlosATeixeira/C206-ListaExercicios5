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

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(String instrucao) {
        this.instrucao = instrucao;
    }

    public int getFilhos() {
        return filhos;
    }

    public void setFilhos(int filhos) {
        this.filhos = filhos;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
