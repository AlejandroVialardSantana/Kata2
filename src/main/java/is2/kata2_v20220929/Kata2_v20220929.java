package is2.kata2_v20220929;

import java.util.HashMap;
import java.util.Map;

public class Kata2_v20220929 {

    public static void main(String[] args) {
       String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
       
       HistogramGenerator histogramGenerator = new HistogramGenerator(data);
       Map<String, Integer> histogram = histogramGenerator.getHistogram();

        for (Map.Entry<String, Integer> entry: histogram.entrySet()) {
            System.out.println(entry.getKey() + "====>" + entry.getValue());
        }
    }
}
