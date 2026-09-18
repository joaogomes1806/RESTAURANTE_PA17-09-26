
package restaurante;

public class Comanda {
    
    
    private int id;
    private int numComanda; 
    private  itemConsumacao[] itens;
    
    
    
    public Comanda(int id, int numComanda){
    this.id = id;
    this.numComanda = numComanda;
    this.itens = new itemConsumacao[numComanda];
    
    }
    public int getId(){
      return id;
}
    public void AddItem (itemConsumacao item){
    
        itemConsumacao[] novoarray = new itemConsumacao[this.itens.length + 1];
        for(int i =0; i < this.itens.length; i++){
            novoarray[i] = this.itens[i];
        }
        novoarray[novoarray.length - 1] = item;
        this.itens = novoarray;
    }
    public double CalcularTotal(){
        double CalcularTotal = 0;
        
        for(int i = 0; i < 10; i++){
            
            
        }
    }
     public int getnumComanda(){
      return numComanda;
     }
     public itemConsumacao[] getitens(){
      return itens;
     }
    
    
}




    
