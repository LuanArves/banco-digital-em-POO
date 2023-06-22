package UserClass;

public class Aaddress {

        private String rua;
        private String numero;
        private String bairro;
        private String cidade;

    public Aaddress(String rua, String numero, String bairro, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public String toString() {
        return "Rua : " + this.getRua() +
                "Numero casa : " + this.getNumero() +
                "Bairro : " + this.getBairro() +
                "Cidade : " + this.getCidade();
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }
}
