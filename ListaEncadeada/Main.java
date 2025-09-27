public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);

        System.out.print("Lista: ");
        lista.exibir();  // 10 -> 20 -> 30 -> null

        lista.remover(20);
        System.out.print("Após remover 20: ");
        lista.exibir();  // 10 -> 30 -> null

        lista.adicionar(40);
        System.out.print("Após adicionar 40: ");
        lista.exibir();  // 10 -> 30 -> 40 -> null
    
}}