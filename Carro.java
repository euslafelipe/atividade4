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
    void acelerar(int valor){
        this.velocidade += valor;

            
        }
        

           
        
    

    void frear(int desacelerar){
        this.velocidade -= desacelerar;
        if (velocidade <=0) {
            System.out.println("acelere ou o carro ira parar");
            
        }
        
    }


    @Override
    public String toString() {
        return "carro [modelo=" + modelo + ", marca=" + marca + ", velocidade=" + velocidade"]";
    }

    public  void printstatus() {
        System.out.println(toString());
    }
    
}
