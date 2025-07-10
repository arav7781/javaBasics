package Threads;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.*;

public class constructorRef {
    static class Students {
        private  String name;
        private int age ;
        public Students(String name) {
            this.name = name;
            // this.age = age;
        }
        public Students(){

        }
        @Override
        public String toString(){
            return name+" "+age;
        }
    }
    public static void main(String[] args) {
        List<String> names = Arrays.asList("arav", "vivek", "rohit");
        List<Students> students = new ArrayList<>();
        
        // for(String name:names){
        //     Students.add(new Students(name,20));
        // }
        // System.out.println(Students);

        students = names.stream()
                    .map(Students::new)
                    .toList();
        System.out.println(students);


    }

  


}
