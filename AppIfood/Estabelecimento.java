package AppIfood;

import java.util.ArrayList;

public class Estabelecimento extends Usuario {
  
  private ArrayList<Item> cardapio; 
  
  public Estabelecimento(String nome, String email, String senha, String endereco, String telefone) {
    super(nome, email, senha, endereco, telefone); 
    this.cardapio = new ArrayList<Item>(); 
  }
  
  public ArrayList<Item> getCardapio() {
    return cardapio;
  }
  
  public void setCardapio(ArrayList<Item> cardapio) {
    this.cardapio = cardapio;
  }
  
  
  public void adicionarItem(Item item) {
    this.cardapio.add(item);
  }
}