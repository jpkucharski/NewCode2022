package main;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamsAPI {


    private Function<String, Stream<String>> getStringStreamFunction() {
        return (value) -> {
            String[] split = value.split(" ");
            return Arrays.asList(split).stream();
        };
    }

    public List<Integer> map(List<Integer> list){
        return list.stream().map(x-> x*x).collect(Collectors.toList());
    }

    public List<String> flatMap(List<String> list){
        Stream<String> stream = list.stream();
       List<String> ls = stream.flatMap(
               getStringStreamFunction()
        ).collect(Collectors.toList());
        return ls;
    }

    Function<String, Integer> function1(String string){
        return s -> string.length();
    }




}
