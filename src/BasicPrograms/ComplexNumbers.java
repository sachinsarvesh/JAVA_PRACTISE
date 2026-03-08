package BasicPrograms;

class ComplexNumbers {
    int real, image;

    public ComplexNumbers(int r, int i){
        this.real = r;
        this.image = i;
    }

    public void showComplex(){
        System.out.println(this.real + " +i" + this.image);
    }

    public static ComplexNumbers add(ComplexNumbers n1, ComplexNumbers n2){
        ComplexNumbers res = new ComplexNumbers(0,0);
        res.real = n1.real + n2.real;
        res.image = n1.image + n2.image;
        return res;
    }

    public static void main(String[] args){
        ComplexNumbers c1 = new ComplexNumbers(4,5);
        ComplexNumbers c2 = new ComplexNumbers(10,5);

        System.out.println("First Complex Number :");
        c1.showComplex();
        System.out.println("Second Complex Number :");
        c2.showComplex();

        ComplexNumbers res = add(c1,c2);
        System.out.println("Sum of two complex number is ");
        res.showComplex();
    }
}
