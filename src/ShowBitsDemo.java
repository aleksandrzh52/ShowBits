public class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.print("123 в двоичном представлении: ");
        b.show(123);
        System.out.print("\n87987 в двоичном представлении: ");
        i.show(87987);
        System.out.print("\n237658768 в двоичном представлении: ");
        li.show(237658768);



    }
}
