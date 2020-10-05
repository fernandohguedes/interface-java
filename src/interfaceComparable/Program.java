package interfaceComparable;

import interfaceComparable.model.entities.Funcionario;
import interfaceComparable.model.service.ArquivoService;

import java.util.List;

public class Program {

    public static void main(String[] args) {

        ArquivoService service = new ArquivoService();
        List<Funcionario> funcionarios = service.lerArquivo();
        service.imprimiLista(funcionarios);

    }
}
