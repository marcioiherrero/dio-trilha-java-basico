package one.digitalinnovation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import one.digitalinnovation.dominio.Bootcamp;
import one.digitalinnovation.dominio.Conteudo;
import one.digitalinnovation.dominio.Curso;
import one.digitalinnovation.dominio.Dev;
import one.digitalinnovation.dominio.Mentoria;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        Curso cursoJavaBasico = new Curso();
        cursoJavaBasico.setTitulo("Java Basico");
        cursoJavaBasico.setDescricao("Aprenda os conceitos basicos sobre o Java");
        cursoJavaBasico.setCargaHoraria(8);
        
        Curso cursoDotNet = new Curso();
        cursoDotNet.setTitulo(".NET");
        cursoDotNet.setDescricao("Aprenda os conceitos basicos sobre C#");
        cursoDotNet.setCargaHoraria(8);
        
        Curso cursoJavaAvancado = new Curso();
        cursoJavaAvancado.setTitulo("Java Avancado");
        cursoJavaAvancado.setDescricao("Aprenda os conceitos avancados sobre o Java");
        cursoJavaAvancado.setCargaHoraria(8);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aprendendo Orientacao a Objetos em Java");
        mentoria.setDescricao("Imersao sobre os pilares da Orientacao a Objetos");
        mentoria.setData(LocalDateTime.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GFT START #2 Java");
        bootcamp.setInicio(LocalDate.now());
        bootcamp.setFim(bootcamp.getInicio().plusDays(1));
        List<Conteudo> conteudosBootcamp = Arrays.asList(cursoJavaBasico, cursoJavaAvancado, mentoria);
        bootcamp.setConteudos(conteudosBootcamp);
        
        Dev felipao = new Dev();
        felipao.setNome("Felipao");
        
        Dev marcio = new Dev();
        marcio.setNome("Marcio");
        
        felipao.inscrever(cursoDotNet);
        felipao.inscrever(bootcamp);
        felipao.progredir();
        felipao.progredir();
        
        marcio.inscrever(bootcamp);
        marcio.progredir();
        marcio.progredir();
        marcio.progredir();
        marcio.progredir();
        
        System.out.println(String.format("XP Felipao: %.2f", felipao.calcularTotalXp()));
        System.out.println(String.format("XP Marcio: %.2f", marcio.calcularTotalXp()));
        
        List<Dev> ranking = Arrays.asList(felipao, marcio).stream()
            .sorted((dev1, dev2) -> Double.compare(dev2.calcularTotalXp(), dev1.calcularTotalXp()))
            .collect(Collectors.toList());
        
        for (Dev dev : ranking) {
            System.out.println(dev.getNome());
        }
        
    }
    
}
