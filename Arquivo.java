import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Arquivo {
    public void writeFile(ArrayList<Funcionario> funcionarios){
        OutputStream op;
        OutputStreamWriter osw;
        BufferedWriter bw = null;

        try{
            op = new FileOutputStream("FuncionariosSemFilhos.csv", false);
            osw = new OutputStreamWriter(op);
            bw = new BufferedWriter(osw);

            bw.write("Identificador,Est.civil,Inst,Filhos,Salario\n");

            for(Funcionario funcionario : funcionarios){
                bw.write(funcionario.getIdentificador() + "," + funcionario.getEstadoCivil() + "," + funcionario.getInstrucao()
                    + "," + funcionario.getFilhos() + "," + funcionario.getSalario() + "\n");
            }
        }
        catch (IOException e){
            System.out.println(e);
        }

        finally{
            try{
                bw.close();
            }
            catch (IOException e){
                System.out.println(e);
            }
        }
    }

    public ArrayList<Funcionario> readFile(){
        InputStream is;
        InputStreamReader isr;
        BufferedReader br = null;

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        try{
            is = new FileInputStream("funcionarios.csv");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            String linha = br.readLine();
            linha = br.readLine();

            while(linha != null){
                String dados[] = linha.split(",");

                if(Integer.parseInt(dados[3]) != 0){
                    int identificador = Integer.parseInt(dados[0]);
                    String estadoCivil = dados[1];
                    String instrucao = dados[2];
                    int filhos = Integer.parseInt(dados[3]);
                    float salario = Float.parseFloat(dados[4]);

                    Funcionario funcTemp = new Funcionario(identificador, estadoCivil, instrucao, filhos, salario);


                    funcionarios.add(funcTemp);
                }

                linha = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println(e);
        }

        finally{
            try{
                br.close();
                
            }
            catch (IOException e){
                System.out.println(e);
            }
        }

        System.out.println(funcionarios.toString());

        return funcionarios;
    }
}