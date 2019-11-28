package com.generics;

public class PrintArray <X,Y,Z> {
    X[] myXArray;
    Y[] myYArray;
    Z[] myZArray;

    public PrintArray(X[] myXArray, Y[] myYArray, Z[] myZArray) {
        this.myXArray = myXArray;
        this.myYArray = myYArray;
        this.myZArray = myZArray;
    }



    public static void main(String[] args){
        Integer [] intArray={1,2,3};
        Double[] doubleArray={1.1,2.2,3.3};
        Character[] charArray={'a','b','c'};

//        toPrint(intArray);
//        toPrint(doubleArray);
//        toPrint(charArray);
        new PrintArray<Integer,Double,Character>(intArray,doubleArray,charArray).toPrint();

    }

    private void toPrint() {
        toPrint(myXArray);
        toPrint(myYArray);
        toPrint(myZArray);
    }

    private static<E> void toPrint(E[] elementArray) {
        for(E element:elementArray)
            System.out.println(element);

        System.out.println();
    }

}
