//package com.devinhouse.devagro.config;
//
//import com.devinhouse.devagro.models.Empresa;
//import com.devinhouse.devagro.models.Fazenda;
//import com.devinhouse.devagro.models.Funcionario;
//import com.devinhouse.devagro.models.Grao;
//import com.devinhouse.devagro.models.enums.Sexo;
//import com.devinhouse.devagro.repositories.EmpresaRepository;
//import com.devinhouse.devagro.repositories.FazendaRepository;
//import com.devinhouse.devagro.repositories.FuncionarioRepository;
//import com.devinhouse.devagro.repositories.GraoRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//
//import java.time.LocalDate;
//import java.util.Arrays;
//
//@Configuration
//@Profile("test")
//public class TestConfig implements CommandLineRunner {
//
//    @Autowired
//    private EmpresaRepository empresaRepository;
//
//    @Autowired
//    private FuncionarioRepository funcionarioRepository;
//
//    @Autowired
//    private GraoRepository graoRepository;
//
//    @Autowired
//    private FazendaRepository fazendaRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        Empresa emp1 = new Empresa (null, "A Sociedade da Fazenda", "86.039.334/0001-94", "Rua das Folhas, 1001, Valfenda");
//        Empresa emp2 = new Empresa (null, "Complexo Duas Torres", "35.089.663/0001-09", "Rua Pontal da Torre, 6066, Isengard");
//        Empresa emp3 = new Empresa(null, "Regresso do Rei LTDA", "82.419.559/0001-15", "Av. Árvore Branca, s/n, Gondor");
//
//        Funcionario func1 = new Funcionario(null, "Eowyn", "de Rohan", "897.498.840-27", "Rua Rohan ,700, Gondor","(11) 944532341", Sexo.FEMININO, LocalDate.parse("1990-11-24"), LocalDate.parse("2007-10-30"), emp2);
//        Funcionario func2 = new Funcionario(null, "Arwen", "Undómiel", "991.180.210-85", "Av. Lothlórien, 70, Valfenda ","(81) 944532343", Sexo.FEMININO, LocalDate.parse("1999-03-11"), LocalDate.parse("2015-01-13"), emp1);
//        Funcionario func3 = new Funcionario(null, "Gandalf", "o Cinzento", "728.847.100-43", "Rua cinzenta, s/n, Floresta Velha","(32) 944532344", Sexo.MASCULINO, LocalDate.parse("1987-05-12"), LocalDate.parse("1998-03-05"), emp3);
//        Funcionario func4 = new Funcionario(null, "Sméagol", "Gollum", "360.252.630-51", "Alameda preciosa, 101, Campos de Lis","(31) 944532345", Sexo.OUTRO, LocalDate.parse("2003-09-24"), LocalDate.parse("2020-11-15"), emp3);
//        Funcionario func5 = new Funcionario(null, "Saruman", "o Branco", "670.980.570-02", "Rua da Torre, 666, Isengard","(21) 944532346", Sexo.MASCULINO, LocalDate.parse("1987-05-03"), LocalDate.parse("1999-12-25"), emp2);
//        Funcionario func6 = new Funcionario(null, "Frodo", "Bolseiro", "880.007.290-91", "Rua do Condado, n. 5, Floresta Velha","(32) 944532347", Sexo.MASCULINO, LocalDate.parse("1992-06-24"), LocalDate.parse("2000-02-18"), emp1);
//        Funcionario func7 = new Funcionario(null, "Barbárvore", "Fangorn", "863.448.910-84", "Alameda dos Ents Queridos, s/n, Floresta de Fangorn","(92) 944536747", Sexo.MASCULINO, LocalDate.parse("1963-07-07"), LocalDate.parse("1995-02-18"), emp2);
//        Funcionario func8 = new Funcionario(null, "Uruk", "Hai", "518.671.630-80", "Rua da Torre, n. 666, subsolo, Isengard","(21) 944532999", Sexo.MASCULINO, LocalDate.parse("1988-01-30"), LocalDate.parse("2010-07-13"), emp1);
//
//        empresaRepository.saveAll(Arrays.asList(emp1, emp2, emp3));
//        funcionarioRepository.saveAll(Arrays.asList(func1, func2, func3, func4, func5, func6, func7, func8));
//
//        Grao gr1 = new Grao(null, "Milho", 60, emp1);
//        Grao gr2 = new Grao(null, "Arroz", 90, emp2);
//        Grao gr3 = new Grao(null, "Café", 100, emp1);
//        Grao gr4 = new Grao(null, "Trigo", 45, emp2);
//        Grao gr5 = new Grao(null, "Milho", 75, emp3);
//        Grao gr6 = new Grao(null, "Trigo", 50, emp3);
//
//        graoRepository.saveAll(Arrays.asList(gr1, gr2, gr3, gr4, gr5, gr6));
//
//        Fazenda faz1 = new Fazenda(null, "Rancho do Condado", "Rua Bilbo Baggins, s/n, Floresta Velha", 300.50, LocalDate.parse("2022-03-10"), emp2, gr2);
//        Fazenda faz2 = new Fazenda(null, "ValFazenda", "Alameda Rivendell, 324, Valfenda", 320.700, LocalDate.parse("2022-03-10"), emp2, gr4);
//        Fazenda faz3 = new Fazenda(null, "Feudo de Mordor", "Estrada de Sauron, s/n, Mordor", 700.300, LocalDate.parse("2022-03-10"), emp3, gr5);
//        Fazenda faz4 = new Fazenda(null, "Sítio de Helm", "Av. Morro da luz, 132344, Rohan", 1100.00, LocalDate.parse("2022-03-10"), emp3, gr6);
//        Fazenda faz5 = new Fazenda(null, "Fazenda Árvore Branca", "Alameda Pétala Branca, 434, Gondor", 300.90, LocalDate.parse("2022-03-10"), emp1, gr1);
//        Fazenda faz6 = new Fazenda(null, "Granjas Thirith", "Av. das Minas, 565, Fortaleza Branca", 900.400, LocalDate.parse("2022-03-10"), emp1, gr3);
//
//        fazendaRepository.saveAll(Arrays.asList(faz1, faz2, faz3, faz4, faz5, faz6));
//
//    }
//}
