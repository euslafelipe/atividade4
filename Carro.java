package atividades.atividade4;

public class Carro {

    private String modelo;
    private String marca;
    private int velocidade;
    
    
    


     Carro(String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
        velocidade = 0;
        
    }
    void printStatus(){
        System.out.println("Carro [marca="+this.marca+", modelo="+this.modelo+", velocidade="+this.velocidade+"]");
    }

    void acelerar(int valor){
        int soma = this.velocidade+valor;
        if(soma>=200){
            soma=200;

            
        }
        System.out.println(this.velocidade+" + "+valor+" > "+soma);
        this.velocidade=soma;
    }
        

           
        
    

    void frear(int remvel){
        int subt =this.velocidade-remvel;
        if(subt<=0){
            subt=0;
        }
        System.out.println(this.velocidade+" - "+remvel+" > "+subt);
        this.velocidade=subt;
    }

    
}
