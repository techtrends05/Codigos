package Sprint2;

public class Histórico {
    private StackHistórico pedidos;

    public Histórico() {
        pedidos = new StackHistórico();
    }

    public StackHistórico getPedidos() {
        return pedidos;
    }

    public void setPedidos(StackHistórico pedidos) {
        this.pedidos = pedidos;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.push(pedido);
    }

    public Pedido removerPedido() {
        if (!pedidos.isEmpty()) {
            return pedidos.pop();
        }
        return null;
    }
    public void listarpedidos(){
        System.out.println(pedidos);
    }



}
