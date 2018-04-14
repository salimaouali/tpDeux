
package tpdeux;


class Option {

    private int numero;
    private String libelle;
    private double prix;

    public Option(int numero, String libelle, double prix) {
        this.numero = numero;
        this.libelle = libelle;
        this.prix = prix;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
  public String toString()
  {
    return "Numero:"+this.getNumero() + "\tLibelle:" +this.getLibelle()+"\tPrix:"+ this.getPrix();
  }
    
    
    
}
