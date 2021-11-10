import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Arquivo arq = new Arquivo();
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        
        funcionarios = arq.readFile();

        arq.writeFile(funcionarios);
    }
}