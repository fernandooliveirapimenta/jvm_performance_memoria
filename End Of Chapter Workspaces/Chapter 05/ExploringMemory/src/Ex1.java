public class Ex1 {

    public static void main(String[] args) {
       Ex1 main = new Ex1();
       main.start();
    }

    private void start() {

        String last = "Z";
        Container container = new Container();
        container.setInitial("C");
        another(container, last);
        System.out.println(container.getInitial());
    }

    private void another(Container initialHolder, String newInitial) {

        newInitial.toLowerCase();
        initialHolder.setInitial("B");

        Container initial2 = new Container();
        initialHolder = initial2;
        System.out.println(initialHolder.getInitial());
        System.out.println(newInitial);


    }


    private class Container {

        private String initial = "A";
        public void setInitial(String c) {
            this.initial = c;
        }

        public String getInitial() {
            return initial;
        }
    }
}
