package com.apphub.algorithm.datastructures;


public class UnrolledLinkedListMain
{
	public static void main(String[] args)
	{
		//Assuming each node has 3 elements
		UnrolledLinkedList ull = new UnrolledLinkedList(3 );
		ull.insert(4);
		ull.insert(5);
		ull.insert(23);
		ull.insert(85);
		ull.insert(25);
		ull.insert(55);
		ull.insert(95);
		ull.insert(14);
		ull.insert(75);
		ull.insert(523);
		ull.insert(785);
		ull.display();
	}
}
