import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso(); //criando primeiro curso
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Os primeiros passos que você deve saber.");
        curso1.setCargaHoraria(87);
        
        Curso curso2 = new Curso(); //criando segundo curso
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Básico de JS");
        curso2.setCargaHoraria(50);

        Conteudo conteudo = new Curso(); //polimorfismo

        Mentoria mentoria = new Mentoria(); //criando mentoria 
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Aprofundando conhecimentos.");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp(); //criando bootcamp
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafaella = new Dev(); //criando dev
        devRafaella.setNome("Rafaella Monteiro Massa");
        System.out.println(devRafaella.getNome());
        devRafaella.inscreverBootcamp(bootcamp); //realizando matricula
        System.out.println("Conteúdos Inscritos: " + devRafaella.getConteudosInscritos());
        devRafaella.progredir(); //adicionando progresso
        devRafaella.progredir(); //progredindo novamente
        System.out.println("--------------");
        System.out.println("Conteúdos Inscritos: " + devRafaella.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devRafaella.getConteudosConcluidos());
        System.out.println("XP: " + devRafaella.calcularTotalXp());

        Dev devPaulo = new Dev(); //criando dev
        devPaulo.setNome("Paulo Emanoel Silva");
        System.out.println(devPaulo.getNome());
        devPaulo.inscreverBootcamp(bootcamp); // realizando matricula, sem progresso
        System.out.println("Conteúdos Inscritos: " + devPaulo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devPaulo.getConteudosConcluidos());
        System.out.println("XP: " + devPaulo.calcularTotalXp());

        Dev devMaria = new Dev(); //criando dev
        devMaria.setNome("Maria de Alcantra"); //sem matrícula em nenhum bootcamp
        System.out.println(devMaria.getNome());
        System.out.println("Conteúdos Inscritos: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devMaria.getConteudosConcluidos());
    }
}
