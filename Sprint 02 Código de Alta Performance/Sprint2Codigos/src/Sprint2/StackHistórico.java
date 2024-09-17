package Sprint2;


import java.util.Arrays;

public class StackHistórico {
	public final int N = 16;
	Pedido dados[] = new Pedido[N];
	int topo;

	public void init() {
		topo = 0;
	}

	public boolean isFull() {
		if (topo == N)
			return true;
		else
			return false;
	}

	public void push(Pedido elem) {
		if (isFull())
			System.out.println("Stack overflow");
		else {
			dados[topo] = elem;
			topo++;
		}
	}

	public boolean isEmpty() {
		if (topo == 0)
			return true;
		else
			return false;
	}

	public Pedido pop() {
		topo--;
		return (dados[topo]);
	}
	public Pedido top() {
		return (dados[topo-1]);

	}
	public void esvazia() {
		while (!isEmpty()) {
			System.out.print(" "+ pop());
		}
	}

	@Override
	public String toString() {
		 for (Pedido p: dados){
			return p.toString();
		}
		 return null;
	}
}
