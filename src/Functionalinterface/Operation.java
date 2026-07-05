package Functionalinterface;

@FunctionalInterface
interface Operation {
    void operat(int a, int b);
}

 class Test {

    public static void main(String[] args) {

        Operation o1 = (a, b) -> {
            System.out.println(a + b);
        };


        o1.operat(10, 20);
    }
}