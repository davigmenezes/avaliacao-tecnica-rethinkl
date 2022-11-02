package rethinkdavi;

public class Rethinkdavi {

    static Sistema sistema = new Sistema();

    public static void main(String[] args) {
        // aqui estão sendo chamadas as funções que podem tanto listar todos os alunos, quanto  um aluno específico passado como parametro.
        // aqui estão localizadas as chamadas de todas as funções requisitadas
        init();
        listarAlunos();

        listaroaluno("Fabiana");

        listarAlunoadultos();

        mediaalunos();

    }

    // essa é a função que chama um aluno específico
    static Alunos[] listaroaluno(String a) {
        if (sistema.alunos != null) {
            System.out.printf("This is the client you are looking for:\n\n" + "%-9s %-13s %-15s %-13s\n", "ID", "NAME", "SURNAME", "AGE");

            for (int i = 0; i < sistema.alunos.length; i++) {
                if (sistema.alunos[i] != null) {
                    if (a.equals(sistema.alunos[i].name)) {
                        System.out.printf("");

                        System.out.println(String.format("%-9s %-13s %-15s %-13s ",
                                Long.toString(sistema.alunos[i].id),
                                sistema.alunos[i].name, sistema.alunos[i].surname, sistema.alunos[i].age));
                    }
                }

            }
            System.out.println("\n");

        }
        return null;
    }

    //--------------------------------------------------------------------------
    // essa função mostra todos os alunos já cadastrados no sitema previamente
    static Alunos[] listarAlunos() {
        if (sistema.alunos != null) {
            System.out.printf("Welcome to Detran MG DataCenter,these are our possible clients:\n\n" + "%-9s %-13s %-15s %-13s\n", "ID", "NAME", "SURNAME", "AGE");

            for (int i = 0; i < sistema.alunos.length; i++) {
                if (sistema.alunos[i] != null) {
                    System.out.printf("");

                    System.out.println(String.format("%-9s %-13s %-15s %-13s ",
                            Long.toString(sistema.alunos[i].id),
                            sistema.alunos[i].name, sistema.alunos[i].surname, sistema.alunos[i].age));
                }
            }
            System.out.println("\n");

        }
        return null;
    }

    //--------------------------------------------------------------------------
    // essa função mostra todos os alunos aptos a tirarem a habilitação(+18)
    static Alunos[] listarAlunoadultos() {
        if (sistema.alunos != null) {
            System.out.printf("These are our eligeble clients:\n\n" + "%-9s %-13s %-15s %-13s\n", "ID", "NAME", "SURNAME", "AGE");

            for (int i = 0; i < sistema.alunos.length; i++) {
                if (sistema.alunos[i] != null) {
                    if (sistema.alunos[i].age >= 18) {
                        System.out.printf("");

                        System.out.println(String.format("%-9s %-13s %-15s %-13s ",
                                Long.toString(sistema.alunos[i].id),
                                sistema.alunos[i].name, sistema.alunos[i].surname, sistema.alunos[i].age));
                        System.out.println("");
                    }
                }

            }
            System.out.println("\n");
        }
        return null;
    }

    //--------------------------------------------------------------------------
    // essa função faz a media dos alunos cadastrados
    static Alunos[] mediaalunos() {
        int somareal = 0;
        int existentes = 0;
        int media = 0;
        for (int i = 0; i < sistema.alunos.length; i++) {
            if (sistema.alunos[i] != null) {
                existentes++;
                somareal += sistema.alunos[i].age;

                System.out.printf("");
            }
        }
        media = somareal / existentes;
        System.out.println("Ours client's avarage age is: "+media);

        return null;
    }

    static void init() {
        // aqui estão os dados dos alunos do detran inseridos no sistema(classe) criado
        Alunos p1 = new Alunos();
        p1.name = "Fabiana";
        p1.surname = "Araujo";
        p1.age = 33;
        p1.id = 1;
        sistema.inserirAlunos(p1);

        Alunos p2 = new Alunos();
        p2.name = "Gabriel";
        p2.surname = "Gomes";
        p2.age = 25;
        p2.id = 2;
        sistema.inserirAlunos(p2);

        Alunos p3 = new Alunos();
        p3.name = "Fernando ";
        p3.surname = "Henrique";
        p3.age = 17;
        p3.id = 3;
        sistema.inserirAlunos(p3);

        Alunos p4 = new Alunos();
        p4.name = "Ana";
        p4.surname = "Luiza";
        p4.age = 2;
        p4.id = 4;
        sistema.inserirAlunos(p4);

        Alunos p5 = new Alunos();
        p5.name = "Geralda";
        p5.surname = "do Nascimento";
        p5.age = 93;
        p5.id = 5;
        sistema.inserirAlunos(p5);

        Alunos p6 = new Alunos();
        p6.name = "Miguel ";
        p6.surname = "Souza";
        p6.age = 70;
        p6.id = 6;
        sistema.inserirAlunos(p6);

        Alunos p7 = new Alunos();
        p7.name = "Antonio";
        p7.surname = "Miguel";
        p7.age = 69;
        p7.id = 7;
        sistema.inserirAlunos(p7);
    }

}
