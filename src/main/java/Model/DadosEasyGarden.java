package Model;

import Model.exceptions.EnderecoRepetido;
import Model.exceptions.IdRepetido;
import Model.exceptions.NovoEspacoComServicos;

import java.util.LinkedList;

public class DadosEasyGarden {
    private final LinkedList<Espaco> espacos;

    private static final DadosEasyGarden instance = new DadosEasyGarden();

    public static DadosEasyGarden getInstance() {
        return instance;
    }

    DadosEasyGarden() {
        this.espacos = new LinkedList<>();
    }

    /**
     * Função para obter a lista de espaços
     * @return Lista de espaços
     */
    public LinkedList<Espaco> getEspacos() {
        return new LinkedList<>(espacos);
    }

    /**
     * Função para adicionar um novo espaco à lista de espaços, esse espaço é validado antes de ser inserido.
     * A inserção é impedida caso o espaço viole alguma regra de integridade de dados.
     * @param espaco Espaço a ser inserido
     */
    public void registarEspaco(Espaco espaco) {
        // Validar unicidade do id
        for (Espaco e : espacos)  {
            if (e.getId() == espaco.getId()) {
                throw new IdRepetido(espaco.getId());
            }
        }

        // Validar unicidade do endereço
        for (Espaco e : espacos) {
            if (e.getEndereco().equals(espaco.getEndereco())) {
                throw new EnderecoRepetido(espaco.getEndereco());
            }
        }

        // Validar serviços, um novo espaço não deve ter serviços associados
        if (espaco.getServicos().size() != 0) {
            throw new NovoEspacoComServicos();
        }
    }

    /**
     * Função para editar um espaço, o espaço passado por parâmetro vai subsituir um dos espaços da lista.
     * Se o espaço passado não existir na lista, nenhum espaço é alterado.
     * @param espaco Espaço com os novos dados.
     */
    public void editarEspaco(Espaco espaco) {
        for (Espaco e : espacos) {
            if (e.getId() == espaco.getId()) {
                espacos.remove(e);
                espacos.add(espaco);
                break;
            }
        }
    }

    /**
     * Função para agendar um serviço a um espaço.
     * @param espaco Espaço que irá ter o serviço
     * @param servico Serviço a ser agendado.
     */
    public void agendarServico(Espaco espaco, Servico servico) {
        espaco.adicionarServico(servico);
    }

    /**
     * Função para editar o serviço de um espaço.
     * @param servico
     */
    public void editarServico(Servico servico) {
        for (Espaco e : espacos) {
            if (e == servico.getEspaco()) {
                e.adicionarServico(servico);
                e.removerServico(servico);
            }
        }
    }

}
