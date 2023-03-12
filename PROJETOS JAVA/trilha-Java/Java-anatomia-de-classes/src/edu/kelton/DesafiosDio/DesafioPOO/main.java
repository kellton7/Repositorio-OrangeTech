package edu.kelton.DesafiosDio.DesafioPOO;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

            
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Js");
        curso2.setDescricao("Descrição do curso de Js");
        curso2.setCargaHoraria(5);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de Java");
        mentoria1.setData(LocalDate.now());


        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria1);
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Jv");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devKelton = new Dev();
        devKelton.setNome("Kelton");  
        devKelton.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devKelton.getConteudoInscrito());

        System.out.println("-");

        devKelton.progredir(); 
        devKelton.progredir();  
 
        System.out.println("Conteudos Inscritos: " + devKelton.getConteudoInscrito());
        System.out.println("Conteudos Concluidos: " + devKelton.getConteudoConcluidos());
        System.out.println("XP DE KELTON: " + devKelton.calculartotalXp());
        System.out.println(".....................................................");

        Dev devHenrique = new Dev();
        devHenrique.setNome("Henrique");
        devHenrique.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devHenrique.getConteudoInscrito());
        devHenrique.progredir();
        System.out.println("Conteudos Concluidos: " + devHenrique.getConteudoConcluidos());
        System.out.println("XP DE HENRIQUE: " + devHenrique.calculartotalXp());

    }
}
