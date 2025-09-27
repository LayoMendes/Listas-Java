public class ListaEncadeada {
    private No inicio;  // referência para o primeiro nó da lista (início da lista)

    // Construtor: inicializa a lista vazia (inicio == null)
    public ListaEncadeada() {
        this.inicio = null;
    }

    // Método que verifica se a lista está vazia
    public boolean estaVazia() {
        return inicio == null;  // se o início não aponta para nenhum nó, lista está vazia
    }

    // Adiciona um novo elemento (nó) no final da lista
    public void adicionar(int valor) {
        No novoNo = new No(valor);  // cria um novo nó com o valor recebido

        if (estaVazia()) {
            // Se a lista está vazia, o novo nó vira o início
            inicio = novoNo;
        } else {
            // Se não está vazia, percorre a lista até o último nó
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;  // anda para o próximo nó
            }
            // Quando chega no último nó (que aponta para null), liga o novo nó
            atual.proximo = novoNo;
        }
    }

    // Remove o primeiro nó que tenha o valor passado
    public void remover(int valor) {
        if (estaVazia()) return;  // se a lista estiver vazia, não faz nada

        // Se o valor está no primeiro nó, apenas muda o início para o próximo nó
        if (inicio.valor == valor) {
            inicio = inicio.proximo;
            return;
        }

        // Percorre a lista para encontrar o nó cujo próximo tem o valor desejado
        No atual = inicio;
        while (atual.proximo != null && atual.proximo.valor != valor) {
            atual = atual.proximo;
        }

        // Se encontrou o nó cujo próximo tem o valor, "pula" esse nó (remove-o)
        if (atual.proximo != null) {
            atual.proximo = atual.proximo.proximo;
        }
    }

    // Exibe os valores da lista no console, seguindo os nós até o final (null)
    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");  // mostra o valor do nó atual
            atual = atual.proximo;  // avança para o próximo nó
        }
        System.out.println("null");  // indica o fim da lista
    }
}
