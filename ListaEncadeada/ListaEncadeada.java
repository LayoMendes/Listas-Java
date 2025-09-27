public class ListaEncadeada {
    private No inicio;

    // Construtor
    public ListaEncadeada() {
        this.inicio = null;
    }

    // Verifica se a lista está vazia
    public boolean estaVazia() {
        return inicio == null;
    }

    // Adiciona um elemento no final da lista
    public void adicionar(int valor) {
        No novoNo = new No(valor);

        if (estaVazia()) {
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    // Remove o primeiro nó com o valor informado
    public void remover(int valor) {
        if (estaVazia()) return;

        if (inicio.valor == valor) {
            inicio = inicio.proximo;
            return;
        }

        No atual = inicio;
        while (atual.proximo != null && atual.proximo.valor != valor) {
            atual = atual.proximo;
        }

        if (atual.proximo != null) {
            atual.proximo = atual.proximo.proximo;
        }
    }

    // Exibe os elementos da lista
    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
}
