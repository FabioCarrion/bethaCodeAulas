package desafio04Heranca;

import java.lang.String;

public class ExecutaTestes {
    public static void main(String[] args) {
        Pessoa carrion = new Pessoa();
        carrion.setNome("Fabio Carrion");
        carrion.setEndereco("Criciuma,512");
        carrion.setId(171);
        carrion.setTelefone("48 9963637373");
        System.out.println("" + carrion.getNome());

        Funcionario salario = new Funcionario(20000.00,null,0.09);
        salario.aplicaDissidio();
        System.out.println("Salario Liquido : " + salario.getSalarioLiquido() + "  Salario Bruto com dissidio : " + salario.getSalarioBruto());

        Cliente utilizaLimite = new Cliente(10000.00, 500.00);

        utilizaLimite.diminuiLimite();
        utilizaLimite.aumentaLimite();
        System.out.println("Limite de Credito : " + utilizaLimite.getLimiteCredito() + "  Limite Utilizado : " + utilizaLimite.getLimiteUtilizado());

        PessoaFisica verificaCpf  =  new PessoaFisica();
        System.out.println("CPF : " + verificaCpf.getDocumentoPrincipal());

        PessoaJuridica verificaCnpj =  new PessoaJuridica();
        System.out.println("CNPJ : " + verificaCpf.getDocumentoPrincipal2());

    }
}




