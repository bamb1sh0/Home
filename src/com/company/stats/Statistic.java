package com.company.stats;

public class Statistic {
    public static void main(String[] args) {
        double[] arr = {1,2.,3,4};
        Stats.Results results = Stats.calculate(arr);
        System.out.println("min: "+results.getMin());

    }
}
//Класс служит для вычисления минимального,максимального значения, средне арифмитеческого и т.д.
class Stats{
    public static class Results{
        private double min;
        private double max;
        private double average;
        private double std;

        public Results(double min, double max, double average, double std) {
            this.min = min;
            this.max = max;
            this.average = average;
            this.std = std;
        }


        public double getMin() {
            return min;
        }

        public double getMax() {
            return max;
        }

        public double getAverage() {
            return average;
        }

        public double getStd() {
            return std;
        }
    }

    public static Results calculate (double[] arr){
        double sum = 0, count = arr.length,
                min = Double.MAX_VALUE, max = Double.MIN_VALUE,
                average, std;
        for (double elem:arr){
            sum+=elem;
            if (min>elem) min = elem;
            if (max<elem) max = elem;
        }
        average = sum/count;
        std = 0;
        for (double elem:arr)
            std+=(elem-average)*(elem-average);
        std/=(count-1);
        return new Results(min, max, average, std);
    }

}
