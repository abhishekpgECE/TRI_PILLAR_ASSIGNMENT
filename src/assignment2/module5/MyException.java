package assignment2.module5;

public class MyException extends Exception {
        MyException(String message) {
            super(message);
        }
    }

    class exceptionclass {
        public static void main(String[] args) {

            try {
                throw new MyException("This is a custom exception");
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }

}
