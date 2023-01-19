import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("POO - Programação Orientada a objetos");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Spring");
        curso1.setDescricao("Domine o maior framework Java");
        curso1.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Carreira Java");
        mentoria1.setDescricao("Tenha um coach de carreira em tempo integral");
        mentoria1.setData(LocalDate.now());
        mentoria1.setCargaHoraria(10);

        System.out.println(curso1);
        System.out.println(mentoria1);
    }
}