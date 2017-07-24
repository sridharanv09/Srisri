import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;

public class Sort implements Comparator<Integer> {

    public int compare(Integer a, Integer b) {
        String s1 = a.toString();
        String s2 = b.toString();
        return (s2+s1).compareTo(s1+s2);
    }

    public static void main(String[] args) {
        Sort ks = new Sort();
        Integer[] nums = {11,13,14,22};
        Arrays.sort(nums, ks);
        System.out.println(Arrays.toString(nums));
    }