import java.util.*;

class Stack
{
	 int[] arr;
	int cap;
	int top1, top2;
	public Stack(int n)
	{
		cap = n;
		arr = new int[n];
		top1 = -1;
		top2 = n;
	}

	public void push1(int key)
	{
		if (top1 + 1 == top2)
		{
			System.out.println("Overflow");
			System.exit(-1);
		}

		top1++;
		arr[top1] = key;
	}

	public void push2(int key)
	{
		if (top1 + 1 == top2)
		{
			System.out.println("Overflow");
			System.exit(-1);
		}

		top2--;
		arr[top2] = key;
	}

	public int pop1()
	{
		if (top1 < 0)
		{
			System.out.println("UnderFlow");
			System.exit(-1);
		}

		int top = arr[top1];
		top1--;
		return top;
	}

	public int pop2()
	{
		if (top2 >= cap)
		{
			System.out.println("UnderFlow");
			System.exit(-1);
		}

		int top = arr[top2];
		top2++;
		return top;
	}
}

class Main
{
	public static void main(String[] args)
	{
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList( 6, 7, 8, 9, 10);

		Stack stack = new Stack(list1.size() + list2.size());

		for (int i: list1) {
			stack.push1(i);
		}

		for (int j: list2) {
			stack.push2(j);
		}

		System.out.println("Popping  first stack : " + stack.pop1());
		System.out.println("Popping  second stack : " + stack.pop2());
	}
}