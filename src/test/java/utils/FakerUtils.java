package utils;

import net.datafaker.Faker;

public class FakerUtils {

    private static final Faker faker = new Faker();

    public static String getRandomName() {
        return faker.name().firstName();
    }

    public static String getRandomEmail() {
        return faker.internet().emailAddress();
    }

    public static String getRandomJob() {
        return faker.job().title();
    }
}