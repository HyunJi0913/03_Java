package ch17.sec10;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
public class OptionalExample
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList< >();

        //방법
        list.stream() .mapToInt(Integer :: intValue)
                .average() .ifPresent(a -> System.out.println("방법3_평균: " + a));
    }
}
