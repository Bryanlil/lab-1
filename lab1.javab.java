class main {
    public static void main(String[] args) {
      // task 1
      int[] d = new int[20];
      int d_size = 0;
      int index = 0;
      for(int i = 24; i >=2; i-=2) {
        d[index] = i;
        index++;
        d_size+=1;
      }
      for (int i = 0; i < d_size; i++) {{
        System.out.print(d[i]+ " ");
      }
    }
    System.out.println(" ");

    // task 2
    double min = -5.0;
    double max = 5.0;
    double[] x = new double[13];
    for (int i = 0; i < 13; i++) {
      double random_int = Math.random()*(max-min)+min;
      x[i] = random_int;
    }
    for (int i = 0; i < 13; i++) {
      System.out.printf("%.2f ",x[i]);
    }
    System.out.println(" ");

    // task 3
    double[][] k = new double[12][13];
    int con_values[] = {4,8,10,12,20,22};
    for (int i = 0; i < 12; i++) {
    for (int j = 0; j < 13; j++) {
      int is_second_case = 0;
      double my_x = x[j];
      if (d[i] == 16) {
        double inner_1 = Math.pow(my_x - (1/3)/3,2);
        double inner_2 = Math.pow(inner_1,Math.pow(my_x,3)/3);
        double inner_3 = Math.pow(inner_2,((1/4)/(0.5 + Math.sin(3*my_x))));
        k[i][j] = inner_3;
      }
      else {
      for(int l=0; l<con_values.length;l++) {
        int elem = con_values[l];
         if (d[i] == elem)
          {
            double inner_1 = Math.PI*Math.atan((my_x*Math.E)+1);
            double numero = 2*(Math.atan((my_x)*Math.E+1));
            k[i][j] = Math.pow(Math.abs(numero),inner_1);
            is_second_case = 1;
          }
        }
      if (is_second_case==0)
          k[i][j] = Math.pow(0.25/(1-Math.sin(Math.sin(Math.cos(my_x)))),Math.tan(Math.cbrt(Math.pow(my_x/2,2))));
          System.out.printf("%.2f ", k[i][j]);
    }
  }
  System.out.println(" ");
  }
}
   }