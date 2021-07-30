package desafio05OverridePolimorfismo;

 class Funcionario {
     private Integer id;
     private String Nome;
     private String CPF;
     private Double salarioBruto;

     public Funcionario(Integer id, String nome, String CPF, Double salarioBruto) {
         this.id = id;
         this.Nome = nome;
         this.CPF = CPF;
         this.salarioBruto = salarioBruto;
     }


     public Funcionario(Integer id, String nome, String CPF) {
         this.id = id;
         this.Nome = nome;
         this.CPF = CPF; //ou
        // new Funcionario(id,nome,CPF,null);
     }

     public Funcionario(Integer id, String nome) {
         this.id = id;
         this.Nome = nome; //ou
         //new Funcionario(id,nome,null)
     }

     public Integer getId() {
         return id;
     }

     public void setId(Integer id) {
         this.id = id;
     }

     public String getNome() {
         return Nome;
     }

     public void setNome(String nome) {
         Nome = nome;
     }

     public String getCPF() {
         return CPF;
     }

     public void setCPF(String CPF) {
         this.CPF = CPF;
     }

     public Double getSalarioBruto() {
         return salarioBruto;
     }

     public void setSalarioBruto(Double salarioBruto) {
         this.salarioBruto = salarioBruto;
     }
 }
