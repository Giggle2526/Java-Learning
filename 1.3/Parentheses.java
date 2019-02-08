import edu.princeton.cs.algs4.*;

public class Parentheses{
	public static void main(String[] args) {
		char ch;
		String str = StdIn.readString();
		Stack<Character> pStack = new Stack<Character>();
		for(int i=0;i<str.length();i++)	
			{
				ch = str.charAt(i);
				if(ch == '<' || ch == '(' || ch == '{' || ch == '[')
					pStack.push(ch);
				else
					switch(ch){
						case '>':
							if(pStack.pop() != '<'){
								StdOut.println("False");
								return;	
							}
							break;
						case ')':
						if(pStack.pop() != '('){
								StdOut.println("False");
								return;	
							}
							break;
						case '}':
						if(pStack.pop() != '{'){
								StdOut.println("False");
								return;	
							}
							break;
						case ']':
						if(pStack.pop() != '['){
								StdOut.println("False");
								return;	
							}
							break;
					}
			} 
			if(pStack.isEmpty())
				StdOut.println("True");			
	}
}