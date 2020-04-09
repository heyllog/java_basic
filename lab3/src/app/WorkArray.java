package app;


public class WorkArray<T extends Number> {
    public T[] arrNums;

    public WorkArray(T[] numP) {
        this.arrNums = numP;
    }

    public double sum() {
        double doubleWork = 0;
        for (T elem : arrNums) {
            doubleWork += elem.doubleValue();
        }
        return doubleWork;
    }

    public void printAll() {
        for (T elem : arrNums) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}

