public class JavaBuzz {

    public String convertFizzBuzz(int number) {
        if (fizzBuzz(number)) {
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else {
            return this.notFizzOrBuzz(number);
        }
    }

    public Boolean fizzBuzz(int number) {
        if (number % 15 == 0) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public String notFizzOrBuzz(int number) {
        return String.valueOf(number);
    }

}
