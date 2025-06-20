package oops.interfaceDemo;

    public class Document implements Printable, Sendable {
        @Override
        public void print(){
            System.out.println("Printing document...");
        }

        @Override
        public void send(String messege){
            System.out.println("Sending messege: " + messege);
        }
    }

