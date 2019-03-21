import edu.princeton.cs.algs4.*;

public class SequentialSearchST<Key, Value>
{
	private Node first;
	private class Npde{
		Key key;
		Value val;
		Node next;

		public Value get(Key key){
			for(Node x = first; x != null; x = x.next)
				if(key.equals(x.key))
					return x.val;
			return null;
		}
		public void put(Key key, Value val){
			for(Node x = first; x != null; x = x.next)
				if(key.equals(x.key))
					{ x.val = val; return ; }
				first = new Node(key, val, first);
		}
	}
}