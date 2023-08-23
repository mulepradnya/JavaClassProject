package Collections;

import java.util.Stack;

public class StructureInStack {
	
	static void stack_push(Stack<Integer> stack) {
		for (int i = 0; i < 5; i++) {
			stack.push(i);
		}
		System.out.println("My Stack :"+stack);
	}
	
	//Popping element from the top of the stack
	static void stack_pop (Stack<Integer> stack) {
		
		//System.out.println("Pop :");
		//int y=stack.pop();
		
		for (int i=0; i<5; i++) {
			
			
			//Integer y = (Integer)stack.pop();
			
			System.out.println("Pop out: "+stack.pop());
			System.out.println("My Stack :"+stack);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack <Integer> stack = new Stack<Integer>();
		
		stack_push(stack);
		stack_pop(stack);
		

	}

}
