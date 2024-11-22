package com.atrah.chamachama.controller;

import com.atrah.chamachama.model.Cliente;
import com.atrah.chamachama.model.Entregas;
import com.atrah.chamachama.model.Estoque;
import com.atrah.chamachama.model.Funcionarios;
import com.atrah.chamachama.model.Pedido;
import com.atrah.chamachama.model.Produtos;
import com.atrah.chamachama.model.Vendas;
import com.atrah.chamachama.service.ClienteService;
import com.atrah.chamachama.service.EntregasService;
import com.atrah.chamachama.service.EstoqueService;
import com.atrah.chamachama.service.FuncionariosService;
import com.atrah.chamachama.service.PedidoService;
import com.atrah.chamachama.service.ProdutosService;
import com.atrah.chamachama.service.VendasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private EntregasService entregasService;
    @Autowired
    private EstoqueService estoqueService;
    @Autowired
    private FuncionariosService funcionariosService;
    @Autowired
    private ProdutosService produtosService;
    @Autowired
    private VendasService vendasService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/configuracoes")
    public String configuracoes() {
        return "configuracoes";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "Página Inicial");
        return "layout";
    }
    
    @GetMapping("/")
    public String raiz() {
        return "layout";
    }

    @GetMapping("/pedidos")
    public String listarPedidos(Model model) {
        List<Pedido> pedidos = pedidoService.listarPedidos();
        model.addAttribute("pedidos", pedidos);
        return "pedidos";
    }

    @GetMapping("/clientes")
    public String listarClientes(Model model) {
        List<Cliente> clientes = clienteService.listarClientes();
        model.addAttribute("clientes", clientes);
        return "clientes";
    }
    
    @GetMapping("/entregas")
    public String listarEntregas(Model model) {
        List<Entregas> entregas = entregasService.listarEntregas();
        model.addAttribute("entregas", entregas);
        return "entregas";
        
    }    
    
    @GetMapping("/estoque")
    public String listarEstoque(Model model) {
        List<Estoque> estoque = estoqueService.listarEstoque();
        model.addAttribute("estoque", estoque);
        return "estoque";
        
    } 
    
    @GetMapping("/funcionarios")
    public String listarFuncionarios(Model model) {
        List<Funcionarios> funcionarios = funcionariosService.listarFuncionarios();
        model.addAttribute("funcionarios", funcionarios);
        return "funcionarios";
        
    }
    
    @GetMapping("/produtos")
    public String listarProdutos(Model model) {
        List<Produtos> produtos = produtosService.listarProdutos();
        model.addAttribute("produtos", produtos);
        return "produtos";
        
    }
    
    @GetMapping("/vendas")
    public String listarVendas(Model model) {
        List<Vendas> vendas = vendasService.listarVendas();
        model.addAttribute("vendas", vendas);
        return "vendas";
    }

    @GetMapping("/teste")
    public String teste() {
        return "teste"; // Nome do arquivo HTML (index.html) em templates
    }

}
