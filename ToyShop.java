
import java.util.PriorityQueue;
import java.util.Queue;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyShop {
    private List<Toys> toys;
    private List<Toys> prizeToys;

    public ToyShop() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    public void addToy(int i, String n, int q, int w) {
        Toys toy = new Toys(i, n, q, w);
        toys.add(toy);
    }
        // метод 
    public void setToyWeight(int id, int weight) {
        for (Toys toy : toys) {
            if (toy.getId() == id) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    public void play() {
        // рассчитать общее количество
        double totalWeight = 0;
        for (Toys toy : toys) {
            totalWeight += toy.getWeight();
        }

        // generate random number
        Random rand = new Random();
        double randomNumber = rand.nextDouble() * totalWeight;

        // поиск призовой игрушки
        Toys prizeToy = null;
        for (Toys toy : toys) {
            if (randomNumber < toy.getWeight()) {
                prizeToy = toy;
                break;
            }
            randomNumber -= toy.getWeight();
        }

        // добавьте призовую игрушку в список призовых игрушек
        if (prizeToy != null && prizeToy.getQuantity() > 0) {
            prizeToys.add(prizeToy);

            // уменьшите количество призовой игрушки
            prizeToy.setQuantity(prizeToy.getQuantity() - 1);
        }
    }

    public void getPrizeToy() throws IOException {
        if (prizeToys.size() > 0) {
            // удалите первую призовую игрушку из списка призовых игрушек
            Toys prizeToy = prizeToys.remove(0);

            // запишите призовую игрушку в файл
            FileWriter writer = new FileWriter("List_of_prize_toys.txt", true);
            writer.write(prizeToy.getId() + "," + prizeToy.getName() + "\n");
            writer.close();
        }
    }
}

// public class ToyShop{
//     public static void Mag(String[] args){
//         Toys toys1 = new Toys(100001, "Мишка_белый", 1, 45);
//         Toys toys2 = new Toys(100002, "Мишка_Тедди", 1, 60);
//         Toys toys3 = new Toys(100003, "Barbie", 1, 61);
     
//        Queue<String> queue1 = new PriorityQueue<>();
//         queue1.offer(toys1.getName());
//         queue1.offer(toys2.getName());
//         queue1.offer(toys3.getName());
      
//         System.out.print("Priority queue с Comparable: ");
//         while (queue1.size() > 0) {
//             System.out.print(queue1.remove() + " ");
//         }



    //     //пример естественного добавления элементов в приоритетную очередь
    //     Queue<Integer> integerPriorityQueue = new PriorityQueue<>(10);
    //     Random rand = new Random();
    //     for(int i=0; i<10; i++){
    //         integerPriorityQueue.add(new Integer(rand.nextInt(100)));
    //     }
    //     for(int i=0;i<10;i++){
    //         Integer in = integerPriorityQueue.poll();
    //         System.out.println("Обрабатываем Integer:"+in);
    //     }
         
    //     //Пример PriorityQueue с компаратором
    //     Queue<Toys> toysPriorityQueue = new PriorityQueue<>(10, idComparator);
    //     addDataToQueue(toysPriorityQueue);
         
    //     pollDataFromQueue(toysPriorityQueue);
         
    // }
     
    // //Анонимный класс компаратора
    // public static Comparator<Toys> idComparator = new Comparator<Toys>(){
         
    //     @Override
    //     public int compare(Toys c1, Toys c2) {
    //         return (int) (c1.getId() - c2.getId());
    //     }
    // };
 
    // // служебный метод добавления элементов в очередь
    // private static void addDataToQueue(Queue<Toys> customerPriorityQueue) {
    //     Random rand = new Random();
    //     for(int i=0; i<7; i++){
    //         int id = rand.nextInt(100);
    //         toysPriorityQueue.add(new Customer(id, "Pankaj "+id));
    //     }
    // }
     
    // //служебный метод для обработки данных очереди
    // private static void pollDataFromQueue(Queue<Customer> customerPriorityQueue) {
    //     while(true){
    //         Customer cust = customerPriorityQueue.poll();
    //         if(cust == null) break;
    //         System.out.println("Обработка клиента с id=" + cust.getId());
        }
    }






