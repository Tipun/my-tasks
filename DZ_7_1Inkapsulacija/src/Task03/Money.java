package Task03;

public class Money {
    long rub;
    int kop;

    public Money(long rub, int kop) {
        if (rub >= 0) {
            this.rub = rub;
        } else {
            System.out.println("Рубли не могут быть меньше нуля");
        }

        if (kop > 0 & kop < 100) {
            this.kop = kop;
        } else {
            System.out.println("Значение копеек может быть от 0 до 99");
        }
    }

    void show() {
        if (kop < 10) {
            System.out.println(rub + "," + "0" + kop);
        } else {
            System.out.println(rub + "," + kop);
        }
    }

    void sum(Money obj) {

        rub = this.rub + obj.rub;
        rub = this.kop + obj.kop;
        if (kop > 99) {
            rub++;
            kop = kop - 100;
        }
        if (kop < 10) {
            System.out.println(this.rub + "," + "0" + this.kop);
        } else {
            System.out.println(this.rub + "," + this.kop);
        }
    }

    void sub(Money obj) {

        rub = this.rub - obj.rub;
        if (this.kop < obj.kop) {
            this.rub = this.rub - 1;
            this.kop = this.kop + 100;
        }
        kop = this.kop - obj.kop;
        if (this.kop < 10) {
            System.out.println(this.rub + "," + "0" + this.kop);
        } else {
            System.out.println(this.rub + "," + this.kop);
        }
    }

    void division(Money obj) {
        double div;
        div = (double) (this.rub * 100 + this.kop) / (obj.rub * 100 + obj.kop);
        System.out.println(div);
    }

    void multiplicationFraction(double a, double b) {
        double div;
        div = (double) (this.rub * 100 + this.kop) * a / b;
        // div = (long) div;
        rub = (long) div / 100;
        kop = (int) div % 100;
        if (kop < 10) {
            System.out.println(rub + "," + "0" + kop);
        } else {
            System.out.println(rub + "," + kop);
        }
    }

    void divisionFraction(double a, double b) {
        double div;
        div = (double) (this.rub * 100 + this.kop) * b / a;
        rub = (long) div / 100;
        kop = (int) div % 100;
        if (kop < 10) {
            System.out.println(rub + "," + "0" + kop);
        } else {
            System.out.println(rub + "," + kop);
        }
    }

    void comparison(Money obj) {
        if (this.rub > obj.rub) {
            if (this.kop < 10 & obj.kop < 10) {
                System.out.println(this.rub + "," + "0" + this.kop + " > " + obj.rub + "," + "0" + obj.kop);
            }
            else if (this.kop < 10 & obj.kop > 10){
                System.out.println(this.rub + "," + "0" + this.kop + " > " + obj.rub + "," + obj.kop);
            }
            else if (this.kop > 10 & obj.kop < 10){
                System.out.println(this.rub + "," + this.kop + " > " + obj.rub + "," + "0" + obj.kop);
            }
            else {
                System.out.println(this.rub + "," + this.kop + " > " + obj.rub + "," + obj.kop);
            }
        }
        else if(this.rub < obj.rub) {
            if (this.kop < 10 & obj.kop < 10) {
                System.out.println(this.rub + "," + "0" + this.kop + " < " + obj.rub + "," + "0" + obj.kop);
            }
            else if (this.kop < 10 & obj.kop > 10){
                System.out.println(this.rub + "," + "0" + this.kop + " < " + obj.rub + "," + obj.kop);
            }
            else if (this.kop > 10 & obj.kop < 10){
                System.out.println(this.rub + "," + this.kop + " < " + obj.rub + "," + "0" + obj.kop);
            }
            else {
                System.out.println(this.rub + "," + this.kop + " < " + obj.rub + "," + obj.kop);
            }
        }
        else if ((this.rub == obj.rub)&(this.kop != obj.kop) ) {
            if(this.kop > obj.kop) {
                if (this.kop < 10 & obj.kop < 10) {
                    System.out.println(this.rub + "," + "0" + this.kop + " > " + obj.rub + "," + "0" + obj.kop);
                } else if (this.kop < 10 & obj.kop > 10) {
                    System.out.println(this.rub + "," + "0" + this.kop + " > " + obj.rub + "," + obj.kop);
                } else if (this.kop > 10 & obj.kop < 10) {
                    System.out.println(this.rub + "," + this.kop + " > " + obj.rub + "," + "0" + obj.kop);
                } else {
                    System.out.println(this.rub + "," + this.kop + " > " + obj.rub + "," + obj.kop);
                }
            }
            else if(this.kop < obj.kop){
                if (this.kop < 10 & obj.kop < 10) {
                    System.out.println(this.rub + "," + "0" + this.kop + " < " + obj.rub + "," + "0" + obj.kop);
                } else if (this.kop < 10 & obj.kop > 10) {
                    System.out.println(this.rub + "," + "0" + this.kop + " < " + obj.rub + "," + obj.kop);
                } else if (this.kop > 10 & obj.kop < 10) {
                    System.out.println(this.rub + "," + this.kop + " < " + obj.rub + "," + "0" + obj.kop);
                } else {
                    System.out.println(this.rub + "," + this.kop + " < " + obj.rub + "," + obj.kop);
                }
            }
        }

        else if ((this.rub == obj.rub)&(this.kop == obj.kop) ) {
            if (this.kop < 10 & obj.kop < 10) {
                System.out.println(this.rub + "," + "0" + this.kop + " = " + obj.rub + "," + "0" + obj.kop);
            } else if (this.kop < 10 & obj.kop > 10) {
                System.out.println(this.rub + "," + "0" + this.kop + " = " + obj.rub + "," + obj.kop);
            } else if (this.kop > 10 & obj.kop < 10) {
                System.out.println(this.rub + "," + this.kop + " = " + obj.rub + "," + "0" + obj.kop);
            } else {
                System.out.println(this.rub + "," + this.kop + " = " + obj.rub + "," + obj.kop);
            }
        }
    }

}
