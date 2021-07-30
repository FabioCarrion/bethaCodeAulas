package desafio05OverridePolimorfismo;

public class FuncionarioBuilder {

    public static Funcionario criaFuncionario(String tipo, int id, String nome, String cpf, Double salarioBruto)
    { //Metodo

       if (tipo.equals("ESTAGIARIO")) {
           return new Estagiario(id,nome,cpf, salarioBruto);
       }

        if (tipo.equals("ANALISTA")) {
            return new Analista(id,nome,cpf, salarioBruto);
        }

        if (tipo.equals("ARQUITETO")) {
            return new ArquitetoSoft(id,nome,cpf, salarioBruto);
        }

        if (tipo.equals("COODERNADOR")) {
            return new Coordenador(id,nome,cpf, salarioBruto);
        }

        return  new Funcionario(id, nome );

    }


}
