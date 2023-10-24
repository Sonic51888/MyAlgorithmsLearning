public class Main {
    public static void main(String[] args) {
        public static int count = 0;

        public static void main (String[]args){
            int first = 10;
            int second = 8;
            int total = mult(first, second);

            System.out.println("итого " + total);
        }

        public static int mult ( int a, int b){
            System.out.println("Число а " + a + " Число b " + b);
            if (b == 1) {
                System.out.println("b теперь 1 завершаю метод операция проведена " + count);
                return a;
            } else {
                count++;
                return a + mult(a, b - 1);
            }
        }
    }