package Threads;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class methodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("arav", "vivek", "rohit");

    // Using lambda
        List<String> uNames = names.stream()
            .map(name -> name.toUpperCase())
            .toList();

        // Alternatively, using method reference
        // List<String> uNames = names.stream()
        //                            .map(String::toUpperCase)
        //                            .collect(Collectors.toList());


        System.out.println(uNames);
    }
                        

}
