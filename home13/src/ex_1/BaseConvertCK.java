package ex_1;

class BaseConvertCK implements Convertable{
    @Override
        public double convert(double cel){
            double kel = cel + 273.15;
            System.out.println(cel + " градусов Цельсия равны " + kel + " градусам по Кельвину");
            return kel;
        }
}
