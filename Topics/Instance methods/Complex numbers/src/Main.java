
class Complex {

    double real;
    double image;

    // write methods
    public void add(Complex number) {
        this.real += number.real;
        this.image += number.image;
    }

    public void subtract(Complex number) {
        this.real -= number.real;
        this.image -= number.image;
    }
}
