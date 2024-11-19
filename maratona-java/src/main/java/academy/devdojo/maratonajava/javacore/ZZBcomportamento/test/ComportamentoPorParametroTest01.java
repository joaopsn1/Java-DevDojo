package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));
    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars, "Red"));
        System.out.println(filterCarByColor(cars, "Green"));
        System.out.println("-----------------------------------");
        System.out.println(filterByYearBefore(cars, 2015));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Green")) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterRedCar(List<Car> cars) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Red")) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String cor) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
