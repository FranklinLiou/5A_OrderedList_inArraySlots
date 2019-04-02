/**
 Test ordered list features. Adapted from UserOfList_inArraySlots.
 */
public class UserOfOrderedList {
    private static OrderedList_inArraySlots list;

    public static void main( String[] args ) {
        list = new OrderedList_inArraySlots();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list);

        list.add(1);
        System.out.println(list
                           + System.lineSeparator()
                           + "expecting [1,]");
        list.add(2);
        System.out.println(list
                           + System.lineSeparator()
                           + "expecting [2,1,]");
        list.add(4);
        System.out.println(list
                           + System.lineSeparator()
                           + "expecting [4,2,1,]");
        list.add(3);
        System.out.println(list
                           + System.lineSeparator()
                           + "expecting [4,3,2,1,]");

        System.out.println();
        System.out.println(list.get(1)
                           + System.lineSeparator()
                           + "expecting 3");

        System.out.println();
        list.remove(1);
        System.out.println(list
                           + System.lineSeparator()
                           + "expecting [4,2,1,]");


    }
}
