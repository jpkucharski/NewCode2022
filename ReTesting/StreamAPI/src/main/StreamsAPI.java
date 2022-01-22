package main;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamsAPI {


    private BiFunction<Integer, Integer, Integer> f1 = (x,y) -> (x+y);


    private Function<String, String> removeSpaces= s-> String.valueOf(s.split(" "));

    public List<String> removeSpaces(List<String> stringList){
        return stringList.stream().map(removeSpaces).collect(Collectors.toList());
    }





    private Function<String, Stream<String>> getStringStreamFunction() {
        return (value) -> {
            String[] split = value.split(" ");
            return Arrays.asList(split).stream();
        };
    }

    public List<Integer> map(List<Integer> list) {
        return list.stream().map(x -> x * x).collect(Collectors.toList());
    }

    public List<String> flatMap(List<String> list) {
        Stream<String> stream = list.stream();
        List<String> ls = stream.flatMap(
                getStringStreamFunction()
        ).collect(Collectors.toList());
        return ls;
    }

    Function<String, Integer> function1(Integer value1, Integer value_2) {
        return s-> Integer.valueOf(value1+value_2 + s);
    }

}
