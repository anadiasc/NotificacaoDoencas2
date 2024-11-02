package br.edu.ifpi.notificacaodoencas.Controllers;

import br.edu.ifpi.notificacaodoencas.Models.Notificacao;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/notificacao")
public class NotificacaoController {
    private List<Notificacao> notificacoes = new ArrayList<>();
    private Logger logger = Logger.getLogger(HomeController.class.getName());


    @GetMapping
    public String getPaginaProduto(Model model,
                                   @RequestParam(required = false) UUID id) {

        model.addAttribute("notificacoes", notificacoes);

        if (id != null) {
            Notificacao notificacao = notificacoes
                    .stream()
                    .filter(n -> n.getId().equals(id))
                    .findFirst().get();
            model.addAttribute("notificacao", notificacao);
            return "formNotificacao";
        }

        model.addAttribute("notificacao", new Notificacao());
        return "formNotificacao";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("notificacoes", notificacoes);

        return "listarNotificacao";
    }

    @PostMapping("/criar")
    public String cadastrarNotificacao(Notificacao notificacao, Model model) {
        model.addAttribute("notificacao", notificacao); //criar um novo objeto (new Notificacao)
        notificacao.setId(UUID.randomUUID());

        logger.info("Notificação cadastrada com ID: "+notificacao.getId());

        notificacoes.add(notificacao);

        return "redirect:/notificacao/listar";
    }

    @PutMapping("/editar")
    public String editarNotificacao(@ModelAttribute Notificacao notificacao, Model model) {
        notificacoes.forEach(n -> {
            if (n.getId().equals(notificacao.getId())) {
                n.setDoenca(notificacao.getDoenca());
                n.setCodigoCID(notificacao.getCodigoCID());
                n.setDataNotificacao(notificacao.getDataNotificacao());
                n.setUnidadeFederativa(notificacao.getUnidadeFederativa());
                n.setMunicipioNotificacao(notificacao.getMunicipioNotificacao());
                n.setUnidadeSaude(notificacao.getUnidadeSaude());
                n.setNomePaciente(notificacao.getNomePaciente());
                n.setDataNascimento(notificacao.getDataNascimento());
                n.setIdade(notificacao.getIdade());
                n.setSexo(notificacao.getSexo());
                n.setNumCartaoSus(notificacao.getNumCartaoSus());
                n.setNomeMae(notificacao.getNomeMae());
                n.setUnidadeFederativaPaciente(notificacao.getUnidadeFederativaPaciente());
                n.setMunicipioResid(notificacao.getMunicipioResid());
                n.setBairro(notificacao.getBairro());
                n.setLogradouro(notificacao.getLogradouro());
                n.setCep(notificacao.getCep());
                n.setNumero(notificacao.getNumero());
                n.setNumero(notificacao.getNumero());
                n.setTelefone(notificacao.getTelefone());
            }
        });
        return "redirect:/notificacao/listar";
    }

    @DeleteMapping("/{id}/deletar")
    public String deletar(@PathVariable UUID id) {

        notificacoes.removeIf(n -> n.getId().equals(id));
        return "redirect:/notificacao/listar";
    }

    //implementacao endpoint requisição ajax
    @GetMapping("/buscar")
    public String buscarPorDoencas(@RequestParam("termo") String termo, Model model){
        List<Notificacao> resultados = new ArrayList<>();

        notificacoes.forEach(n -> {
            if(n.getDoenca().equals(termo)){
                resultados.add(n);
            }
        });

        model.addAttribute("resultados", resultados);

        return "fragments/notificacoes-fragments.html :: linhasTabela";
    }
}