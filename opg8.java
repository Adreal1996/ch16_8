package ch16;

/*
Write a method called switchPairs that switches the order of values in the list in a pairwise fashion.
Your method should switch the order of the first two values, then switch the order of the next two,
switch the order of the next two, and so on. If the list contains an odd number of values, the final
element is not moved. For example, if the list initially stores [10, 25, 31, 47, 52, 68, 77],
your method should switch the first pair (10 and 25), the sec- ond pair (31 and 47),
and the third pair (52 and 68) to yield [25, 10, 47, 31, 68, 52, 77].
 */

public class opg8
{
    public static void main(String[] args)
    {
        LinkedIntList minListe = new LinkedIntList();
        minListe.add(10);
        minListe.add(25);
        minListe.add(31);
        minListe.add(47);
        minListe.add(52);
        minListe.add(1);
        minListe.add(5);


        minListe.switchPairs(minListe);
    }
}
