package by.traning.tutor.classes.task1;

/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
        переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
        наибольшее значение из этих двух переменных
 */
public class Test1 {
    private Integer a;
    private Integer b;
    public Test1(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    void print(){
        System.out.println(a);
        System.out.println(b);
    }
    Integer sum() {
        int sum = a + b;
        return sum;
    }
    Integer max() {
        System.out.println(Math.max(a, b));
        return Math.max(a, b);
    }
    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public static void main(String args[]) {
        Test1 a1 = new Test1(3,4);
        a1.print();
        System.out.println(a1.sum());
        System.out.println(a1.max());

    }
}
