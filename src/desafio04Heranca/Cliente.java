package desafio04Heranca;

public class Cliente {
    private Double limiteCredito = 10000.00;
    private Double limiteUtilizado = 500.00;
    Funcionario controlaLimite = new Funcionario(20000.00,null,null);


    public Cliente(Double limiteCredito, Double limiteUtilizado) {
        this.limiteCredito = limiteCredito;
        this.limiteUtilizado = limiteUtilizado;
    }

    public Double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(Double limiteCredito) {

        this.limiteCredito = limiteCredito;
    }

    public Double getLimiteUtilizado() {

        return limiteUtilizado;
    }

    public void setLimiteUtilizado(Double limiteUtilizado) {

        this.limiteUtilizado = limiteUtilizado;
    }


    void aumentaLimite() {
        if (controlaLimite.getSalarioBruto() > limiteCredito) {
            limiteCredito = limiteCredito + (limiteCredito * 0.55);
        }
    }


    void diminuiLimite() {
        limiteCredito = limiteCredito - limiteUtilizado;
    }

}


