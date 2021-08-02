package methodosAbstratos;

class FuncionarioMain {
    public static void main(String[] args){
        Funcionario gerente = new Gerente("Roberto",1000.00);
        Funcionario diretor = new Diretor("Teste",1000.00);
        Funcionario presidente = new Presidente("Teste 2",1000.00);
        Funcionario secretariaag = new SecretariaAgencia("Sec. Agencia",1000.00);
        Funcionario secretariaad = new SecretariaAdministrativa("Sec. Admin",1000.00);

        System.out.println("Gerente: " + gerente.getBonificacao());
        System.out.println("Diretor: " + diretor.getBonificacao());
        System.out.println("Presidente: " + presidente.getBonificacao());
        System.out.println("Secretaria Agencia: " + secretariaag.getBonificacao());
        System.out.println("Secretaria Admin: " + secretariaad.getBonificacao());
    }
}

