public class Aluno {

    private String nome;
    private String sobreNome;
    private double nota;
    
    public void setNome(String nome){
        if(nome.trim().length() < 3){
            throw new IllegalArgumentException("Nome deve ter conter no Mínimo 3 caracteres");
        }
        
        if(nome.trim().length() > 20){
            throw new IllegalArgumentException("Nome deve ter no maxímo 20 caracteres");
        }
        this.nome = nome;
    }    

    public String getNome(){
        return nome;
    }

    public void setSobreNome(String sobreNome){
        if(sobreNome.trim().length() < 5){
            throw new IllegalArgumentException("SobreNome deve ter no Mínimo 5 caracteres");
        }
    
        if(sobreNome.trim().length() > 50){
            throw new IllegalArgumentException("SobreNome deve ter no Máximo 50 caracteres");
        }
        this.sobreNome = sobreNome;
    }
   
        public String getSobreNome(){
            return sobreNome;
        }

        public void setNota(double nota){
            if(nota > 10)
                throw new IllegalArgumentException("Nota deve ter no Máximo 10");
                this.nota = nota;
            }
           

        public double getNota(){
            return nota;
        }
}   
