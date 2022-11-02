
package rethinkdavi;
// aqui nesse sistema é onde inseri as funçoes para cadastrar os alunos e procur´a-los na hora de acessar por parametro

public class Sistema {
    Alunos[] alunos = new Alunos[10];
    
    Alunos[] aumentarVetor(Alunos[] pacientes) {
        Alunos[] novoPacientes = new Alunos[pacientes.length + 15];
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i] != null) {
                novoPacientes[i] = pacientes[i];
            }
        }

        return novoPacientes;
    }
    
    boolean inserirAlunos(Alunos p) {
        if (alunos[alunos.length - 1] != null) {
            alunos = aumentarVetor(alunos);
        }
        if (p != null) {
            for (int i = 0; alunos[i] != null; i++) {
                if ((alunos[i].name.equals(p.name)) && (alunos[i].surname.equals(p.surname))) {
                    System.out.println("Esse aluno já está cadastrado");
                    return false;
                }
            }
            for (int i = 0; i < alunos.length; i++) {
                if (alunos[i] == null) {
                    alunos[i] = p;
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }
    Alunos buscaAlunos(String name) {
        int i = 0;
        for (; alunos[i] != null; i++) {
            if (alunos[i].name == name) {
                return alunos[i];
            }
        }
        return null;
    }
    
    
}
