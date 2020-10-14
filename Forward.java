public class Forward extends Player {
        private String f="Forward";

    public Forward(String name, int number) {
            super(name, number);
        }
        @Override
        public String toString() {
            return " \n Player "+ " number=" + number + " : " + name  + " - "  + f ;
        }

    }
