//ejercicio 8.8
public class Fecha {
    private int day;
    private int month;
    private int year;
    private static final int[] diaPorMes = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Fecha(int day, int month, int year) {
        if (month > 0 && month <= 12) {
            if (day > 0 && (day <= diaPorMes[month] || month == 2 && day == 29)) {
                if (month != 2 || day != 29 || year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                    this.day = day;
                    this.month = month;
                    this.year = year;
                    System.out.printf("constructor de objeto Fecha para la fecha %s%n", this);
                } else {
                    throw new IllegalArgumentException("dia (" + day + ") fuera del rango para el mes y anio especificos");
                }
            } else {
                throw new IllegalArgumentException("dia (" + day + ") fuera de rango para el mes y el año especificados");
            }
        } else {
            throw new IllegalArgumentException("mes (" + month + ") debe ser 1-12");
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", this.day, this.month, this.year);
    }

    public String toString() {
        return String.format("%d/%d/%d", this.day, this.month, this.year);
    }

    // metodo para incrementar dia.
    public void siguienteDia() {
        if (this.day == diaPorMes[month]) {
            this.day = 1; // reinicia el dia al principio del mes
            if (this.month == 12) {
                this.month = 1;
                this.year++;
            } else {
                this.month++;
            }
        } else {
            this.day++;
        }
    }
}
