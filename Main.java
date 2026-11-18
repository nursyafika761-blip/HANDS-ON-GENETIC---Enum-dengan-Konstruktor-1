public class Main {
    public static void main(String[] args) {

        for (AccountType type : AccountType.values()) {
            System.out.println("Nama       : " + type.name());
            System.out.println("Kode       : " + type.getCode());
            System.out.println("Suku Bunga : " + type.getInterestRate());
            System.out.println();
        }
    }
}