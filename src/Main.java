public class Main {
    public static void main(String[] args) {
        int givenAge = 18
        boolean ageIsEqualsOrMore18 = givenAge >= 18;
        System.out.println("Если возраст человека равен " + givenAge);
        if (ageIsEqualsOrMore18) {
            System.out.println("Вы совершеннолетний.");
        } else {
            System.out.println("Ты не достиг совершеннолетия, нужно немного подождать.");
        }
    }
}