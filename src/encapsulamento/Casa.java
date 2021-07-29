package encapsulamento;

public class Casa {

    private Integer numeroQuartos ;
    private Integer numeroBanheiros ;
    private Double  metragem;
    private String  nomeBairro;
    private Boolean piscina;

     public Casa(Integer numeroQuartos, Integer numeroBanheiros, Double metragem, String nomeBairro, Boolean piscina) {
         this.numeroQuartos = numeroQuartos;
         this.numeroBanheiros = numeroBanheiros;
         this.metragem = metragem;
         this.nomeBairro = nomeBairro;
         this.piscina = piscina;
     }

     public Integer getNumeroQuartos() {
         return numeroQuartos;
     }

     public Integer getNumeroBanheiros() {
         return numeroBanheiros;
     }

     public Double getMetragem() {
         return metragem;
     }

     public String getNomeBairro() {
         return nomeBairro;
     }

     public Boolean getPiscina() {
         return piscina;
     }

     public void setNumeroQuartos(Integer numeroQuartos) {
         this.numeroQuartos = numeroQuartos;
     }

     public void setNumeroBanheiros(Integer numeroBanheiros) {
         this.numeroBanheiros = numeroBanheiros;
     }

     public void setMetragem(Double metragem) {
         this.metragem = metragem;
     }

     public void setNomeBairro(String nomeBairro) {
         this.nomeBairro = nomeBairro;
     }

     public void setPiscina(Boolean piscina) {
         this.piscina = piscina;
     }
 }
