package single;

public class Runtime {

      public static void main(String[] args) {
            MyList list = new MyList();
//        list.addLast(0);
//        list.addLast(1);
//        list.addLast(2);
//        list.addLast(3);
//        list.addLast(4);
//        list.addLast(5);
//        list.addLast(6);
//        list.addLast(7);
//        list.addLast(8);
//        list.addLast(9);
//        list.addLast(10);
//        list.addLast(11);
//        list.addLast(12);
//        list.addLast(13);
//        list.addLast(14);
//        list.addLast(15);
//        list.addLast(16);
//        list.addLast(17);

            list.addLast(5);
            list.addLast(2);
            list.addLast(13);
            list.addLast(19);
            list.addLast(3);
            list.addLast(7);
            list.addLast(10);
            list.addLast(99);
            list.addLast(34);
            list.addLast(56);
            list.addLast(66);
            list.addLast(55);
            list.addLast(14);
            list.addLast(29);
            list.addLast(11);
            list.addLast(4);
            list.addLast(22);
            list.addLast(45);
            list.addLast(74);
            list.addLast(90);
            list.addLast(39);
            list.addLast(21);
            list.addLast(70);

            list.traverse();

            // list.removeIndex_BCLN(20);
            // list.sortAsc();
            list.sortByNode();

            list.traverse();
      }
}
