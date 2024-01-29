import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    
    public static void main(String[] args) throws Exception {
        //REFERÊNCIA  OBJETO          INSTÂNCIA
        Curso         curso1          = new Curso();
        Curso         curso2          = new Curso();
        Mentoria      mentoria1       = new Mentoria();
        //uso de polimorfismo
        Conteudo      cursoDelphi     = new Curso();
        
        curso1.setTitulo("Curso 1");
        curso1.setDescricao("Desc. curso 1");
        curso1.setCargaHoraria(8);
        
        curso2.setTitulo("Curso 2");
        curso2.setDescricao("Desc. curso 2");
        curso2.setCargaHoraria(4);
        
        cursoDelphi.setTitulo("Curso Delphi");
        cursoDelphi.setDescricao("Desc. curso delphi");
        //método setCargaHoraria() não disponível para o objeto "cursoDelphi" porque
        //os métodos são disponibilizados pelo tipo do objeto referenciado e
        //NÃO do tipo do objeto instanciado.
        //neste caso a classe Conteudo não tem o método setCargaHoraria().
        
        mentoria1.setTitulo("Mentoria Curso 1");
        mentoria1.setDescricao("Desc. mentoria curso 1");
        mentoria1.setData(LocalDate.now());
        
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp XYZ");
        bootcamp.setDescricao("Desc. bootcamp xyz");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        
        Dev devMarcio = new Dev();
        devMarcio.setNome("Marcio");
        devMarcio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de " + devMarcio.getNome() + ": " + devMarcio.getConteudosInscritos());
        devMarcio.progredir();
        System.out.println("Conteudos inscritos de " + devMarcio.getNome() + ": " + devMarcio.getConteudosInscritos());
        System.out.println("Conteudos concluidos de " + devMarcio.getNome() + ": " + devMarcio.getConteudosConcluidos());
        System.out.println("XP Dev " + devMarcio.getNome() + " " + devMarcio.calcularTotalXP());
        
        Dev devFulano = new Dev();
        devFulano.setNome("Fulano");
        devFulano.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de " + devFulano.getNome() + ": " + devFulano.getConteudosInscritos());
        devFulano.progredir();
        devFulano.progredir();
        devFulano.progredir();
        System.out.println("Conteudos inscritos de " + devFulano.getNome() + ": " + devFulano.getConteudosInscritos());
        System.out.println("Conteudos concluidos de " + devFulano.getNome() + ": " + devFulano.getConteudosConcluidos());
        System.out.println("XP Dev " + devFulano.getNome() + " " + devFulano.calcularTotalXP());
        
    }
    
}
