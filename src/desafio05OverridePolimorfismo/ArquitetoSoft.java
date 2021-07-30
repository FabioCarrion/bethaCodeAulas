package desafio05OverridePolimorfismo;

   class ArquitetoSoft extends Funcionario {

       public ArquitetoSoft(Integer id,String nome,String CPF, Double salarioBruto) {
              super(id, nome, CPF, salarioBruto);
       }

       public ArquitetoSoft(Integer id,String nome,String CPF) {
           super(id, nome, CPF);
       }

       public ArquitetoSoft(Integer id,String nome) {
           super(id, nome);
       }

       @Override
       public Double getSalarioBruto() {
           return super.getSalarioBruto() * 1.15;
       }
}
