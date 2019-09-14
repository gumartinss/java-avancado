public class Empresa {

    private String razaoSocial;
    private String cnpj;
    private double faturamento;
    public void setRazaoSocial(String razaoSocial) {
       if(razaoSocial == null){
           throw new IllegalArgumentException("Razão Social não pode ser nula");
       }
       
       if(razaoSocial.trim().equals("")){
           throw new IllegalArgumentException("Razão Social não pode ser nula");
       }

       if(razaoSocial.trim().length() < 3){
           throw new IllegalArgumentException("Razão Social deve conter no mínimo 3");
       }

       if(razaoSocial.trim().length() > 60){
           throw new IllegalArgumentException("Razão Social deve conter no maxímo 60 caracters");
       }

        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setCNPJ(String cnpj){
        if(cnpj == null){
            throw new IllegalArgumentException("CNPJ não pode ser nulo");
        }

        if(cnpj.trim().length() < 18){
            throw new IllegalArgumentException("CNPJ deve conter no máximo 18 caracteres");
        }

        this.cnpj = cnpj;
    }

    public String getCNPJ(){
        return cnpj;
    }

    public void setFaturamento(double faturamento){
        if(faturamento < 0){
            throw new IllegalArgumentException("Faturamento deve ser maior ou igual a 0");
        }
        this.faturamento = faturamento;
    }

    public double getFaturamento() {
        return faturamento;
    }

}