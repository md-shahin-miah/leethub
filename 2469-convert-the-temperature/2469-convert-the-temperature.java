class Solution {
      public double[] convertTemperature(double celsius) {
        double kelvin = Double.parseDouble(String.format( "%.5f", celsius + 273.15));
       double fahrenheit = Double.parseDouble(String.format( "%.5f", celsius * 1.80 + 32.00));

       double[] result=new double[2];

       result[0]=kelvin;
       result[1]=fahrenheit;


return result;
    }
}