public class Main {
    public static void main(String[] args) {

        Car granta = new Car(

                "Lada",
                2015,
                "Желтый",
                "Granta",
                "Россия",
                1.7
        );


        System.out.println(
                "Марка автомобиля " + granta.brand +
                        ", модель " + granta.model +
                        ", год выпуска " + granta.year +
                        ", страна производства " + granta.country +
                        ", цвет " + granta.color +
                        ", объем двигателя " + granta.engineVolume
        );

        Car audi = new Car(
                "Audi",
                2020,
                "Черный",
                "A8 50 L TDI quattro",
                "Германия",
                3.0
        );

        System.out.println(
                "Марка автомобиля " + audi.brand +
                        ", модель " + audi.model +
                        ", год выпуска " + audi.year +
                        ", страна производства " + audi.country +
                        ", цвет " + audi.color +
                        ", объем двигателя " + audi.engineVolume
                );

        Car bmw = new Car(
                "BMW",
                2021,
                "Черный",
                "Z8",
                "Германия",
                3.0
        );

        System.out.println(
                "Марка автомобиля " + bmw.brand +
                        ", модель " + bmw.model +
                        ", год выпуска " + bmw.year +
                        ", страна производства " + bmw.country +
                        ", цвет " + bmw.color +
                        ", объем двигателя " + bmw.engineVolume
        );

        Car kia = new Car(
                "KIA",
                2018,
                "Красный",
                "Sportage 4-го поколения",
                "Южная Корея",
                2.4
        );


        System.out.println(
                "Марка автомобиля " + kia.brand +
                        ", модель " + kia.model +
                        ", год выпуска " + kia.year +
                        ", страна производства " + kia.country +
                        ", цвет " + kia.color +
                        ", объем двигателя " + kia.engineVolume
        );

        Car hyundai = new Car(
                "Hyundai",
                2016,
                "Оранжевый",
                "Avante",
                "Южная Корея",
                1.6
        );

        System.out.println(
                "Марка автомобиля " + hyundai.brand +
                        ", модель " + hyundai.model +
                        ", год выпуска " + hyundai.year +
                        ", страна производства " + hyundai.country +
                        ", цвет " + hyundai.color +
                        ", объем двигателя " + hyundai.engineVolume);




    }



    }

