public class Main {
    public static void main(String[] args) {
        int givenAge = 15;
        boolean ageIsEqualsOrMore18 = givenAge >= 18;
        System.out.println("Если возраст человека равен " + givenAge);
        if (ageIsEqualsOrMore18) {
            System.out.println("Вы совершеннолетний.");
        } else {
            System.out.println("Ты не достиг совершеннолетия, нужно немного подождать.");
        }
    int myAge = 32;
    String isIAmAdult = (myAge >= 18) ? "Ты совершеннолетний" : "Ты не совершеннолетний";
    System.out.println(isIAmAdult);
    }
}