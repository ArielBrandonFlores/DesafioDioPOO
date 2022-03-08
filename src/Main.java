import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição curso sobre Java");
        curso1.setCargaHoraria(60);

        Curso curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("Descrição curso sobre JavaScript");
        curso2.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBrandon = new Dev();
        devBrandon.setNome("Brandon");
        devBrandon.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" +devBrandon.getConteudosInscritos());
        devBrandon.progredir();
        devBrandon.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos" +devBrandon.getConteudosInscritos());
        System.out.println("Conteudos Comcluidos" +devBrandon.getConteudosConcluidos());
        System.out.println("XP" +devBrandon.calcularTotalXP());
        System.out.println("-----------");

        Dev devAriel = new Dev();
        devAriel.setNome("Ariel");
        devAriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" +devAriel.getConteudosInscritos());
        devAriel.progredir();
        devAriel.progredir();
        devAriel.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos" +devAriel.getConteudosInscritos());
        System.out.println("Conteudos Comcluidos" +devAriel.getConteudosConcluidos());
        System.out.println("XP" +devAriel.calcularTotalXP());
    }
}
