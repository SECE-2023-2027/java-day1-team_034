public class Problem14 {
    public static void main(String[] args) {
        StringBuilder divBy3 = new StringBuilder();
        StringBuilder divBy5 = new StringBuilder();
        StringBuilder divBy3And5 = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (divBy3.length() > 0) {
                    divBy3.append(", ");
                }
                divBy3.append(i);
            }
            if (i % 5 == 0) {
                if (divBy5.length() > 0) {
                    divBy5.append(", ");
                }
                divBy5.append(i);
            }
            if (i % 15 == 0) {
                if (divBy3And5.length() > 0) {
                    divBy3And5.append(", ");
                }
                divBy3And5.append(i);
            }
        }

        System.out.println("Divided by 3:");
        System.out.println(divBy3 + ",");
        System.out.println();
        System.out.println("Divided by 5:");
        System.out.println(divBy5 + ",");
        System.out.println();
        System.out.println("Divided by 3 & 5:");
        System.out.println(divBy3And5 + ",");
    }
}
