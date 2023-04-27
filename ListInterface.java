import java.util.*;

public class ListInterfaceAufgabe
{
	// Elemente in Liste einf?gen
	static void fillList(List<String> list)
	{
		// Zahlen von 0 bis 20 als Zeichenketten (Strings) einf?gen
		for (int a = 0; a <= 20; a++)
			list.add("" + a);

		// Element an der Position 3 entfernen
		list.remove(3);

		// Erstes Element in der Liste entfernen, das gleich "6" ist
		list.remove("6");
	}

	// Liste vom Anfang bis zum Ende mit einer
	// foreach-Schleife iterieren und Elemente ausgeben
	static void printList(List<String> list)
	{
		for(String s : list) {
			System.out.print(s + " ");
		}
	}

	// Alle Elemente aus der Liste entfernen, die durch 5 teilbar sind
	static void remove5List(List<String> list)
	{
		ListIterator<String> li = list.listIterator();
		while (li.hasNext()){
			String m = li.next();
			int r = Integer.parseInt(m);
			if(r % 5 == 0) {
				li.remove();
			}
		}
	}

	public static void main(String[] args)
	{
		// Erzeugen der LinkedList
		LinkedList<String> list1 = new LinkedList<String>();
		fillList(list1);
		System.out.println("\nAusgabe der ersten Liste(list1)");
		printList(list1);

		remove5List(list1);
		System.out.println("\nlist1 nach dem Entfernen der durch 5 teilbaren Zahlen");
		printList(list1);

		// Erzeugen der ArrayList
		ArrayList<String> list2 = new ArrayList<String>();
		fillList(list2);

		System.out.println("\nAusgabe der zweiten Liste(list2)");
		printList(list2);

		List<String> li2 = list2.subList(5, 12);
		System.out.println("\nAusgabe der Teilliste der zweiten Liste(li2)");
		printList(li2);
		
		li2.remove("11");
		System.out.println("\nAusgabe der Teilliste der zweiten Liste(li2) nach dem entfernen von 11");
		printList(li2);
		
		System.out.println("\nAusgabe der zweiten Liste(list2)");
		printList(list2);
	}
}
