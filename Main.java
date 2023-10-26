public class Main {
    public static void main(String[] args) {
        ToyShop store = new ToyShop();

        // добавление игрушек
        store.addToy(1, "Мишка_белый", 10, 20);
        store.addToy(2, "Мишка_Тедди", 5, 10);
        store.addToy(3, "Barbie", 3, 70);

        // установите вес игрушки
        store.setToyWeight(2, 30);

        // play the game
        store.play();

        // get the prize toy
        try {
            store.getPrizeToy();
        }
    }
}
