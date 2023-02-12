package Chapter_01;

import java.util.Random;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"agnostic","opinionated", "voice activated", "haptically driven",
                "extensible","reactive", "agent based","functional","AI Enabled","strongly typed" };
        String[] wordListTwo = {"loosely coupled", "six sigma",
                "asynchronous", "event driven", "pub-sub", "IoT", "cloud native",
                "service oriented", "containerized", "serverless",
                "microservices", "distributed ledger"};
        String[] wordListThree = {"framework", "library",
                "DSL", "REST API", "repository", "pipeline", "service mesh",
                "architecture", "perspective", "design",
                "orientation"};

        // Find out How Many words are there in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // Generate 3 random numbers
        Random randomGenerator = new Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        // Now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println(phrase);

    }
}
