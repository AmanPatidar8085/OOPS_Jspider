package Functionalinterface;

import java.util.Arrays;
import java.util.List;

public class EvenNumberFilterMethod {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(1,2,3,4,9,4,5,2,2,2,2);
        l1.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));
    }
}
