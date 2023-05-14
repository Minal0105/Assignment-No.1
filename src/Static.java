public class Static
{

        // static variable
        static int count = 0;

        // static block
        static {
            System.out.println("Static block executed");
            count++;
        }

        // static method
        static void incrementCount() {
            count++;
        }

        public static void main(String[] args) {
            // access static variable
            System.out.println("Initial count: " + count);

            // call static method
            incrementCount();

            // access static variable again
            System.out.println("Updated count: " + count);
        }
    }



