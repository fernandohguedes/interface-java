package interfaceComparable.model.service;

import interfaceComparable.model.entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ArquivoService {

    /**
     * Método responsável por percorrer um arquivo separado por virgula,
     * e converter as linhas do arquivo para um objeto e adicionar os objetos a uma lista,
     * returnando assim uma lista de objetos, prontos para qualquer objetivo.
     *
     * @return List<Funcionario>
     */
    public List<Funcionario> lerArquivo() {
        // caminho onde o arquivo se encontra.
        String caminho = "C:\\Users\\ferna\\Documents\\interface\\funcionario.txt";

        // instanciando uma lista e definindo qual a implementação que será utilizada.
        List<Funcionario> funcionarios = new ArrayList<>();

        // utilizando try with resources
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(caminho))) {

            String funcionario = bufferedReader.readLine();

            while (Objects.nonNull(funcionario)) {
                // criando um vetor para converter as linhas do arquivo de acordo com as virgulas encontradas
                String[] camposArquivo = funcionario.split(",");

                // cria e adiciona o funcionário a lista
                funcionarios.add(new Funcionario(camposArquivo[0], Double.parseDouble(camposArquivo[1])));

                // Lê a próxima linha do Arquivo
                funcionario = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return funcionarios;
    }

    /**
     * No método a seguir percorremos a lista e vamos imprimi-lá ordenada pelo nome do funcionário,
     * de acordo com a implementação da interface comparable dentro da classe funcionário
     *
     * @param funcionarios
     */
    public void imprimiLista(List<Funcionario> funcionarios) {
        Collections.sort(funcionarios);
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome() + "," + funcionario.getSalario());
        }
    }

}
