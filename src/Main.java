import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("POO - Programação Orientada a objetos");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Spring");
        curso2.setDescricao("Domine o maior framework Java");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Carreira Java");
        mentoria1.setDescricao("Tenha um coach de carreira em tempo integral");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Trilha completa para tornar-se um desenvolvedor Java Jr.");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Jeremias Freitas");
        dev1.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos inscritos Jeremias: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos inscritos Jeremias: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Jeremias: " + dev1.getConteudoConcluidos());
        System.out.println("XP: " + dev1.calculaTotalXp());


        Dev dev2 = new Dev();
        dev2.setNome("Rayssa Montecchiari");
        dev2.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos inscritos Rayssa: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos concluidos Rayssa: " + dev2.getConteudoConcluidos());
        System.out.println("Conteúdos inscritos Rayssa: " + dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calculaTotalXp());



    }
}