public class CerealTester {

    public static void main(String[] args) {

        Cereal[] cereals = new Cereal[] {
                new Cereal("100% Bran", "C", 70, 4, 1, 130, 10.0, 5, 6, 280, 25, 3, 1.0, 0.33, 68.402973),
                new Cereal("100% Natural Bran", "C", 120, 3, 5, 15, 2.0, 8, 8, 135, 0, 3, 1.0, 1.0, 33.983679),
                new Cereal("All-Bran", "C", 70, 4, 1, 260, 9.0, 7, 5, 320, 25, 3, 1.0, 0.33, 59.425505),
                new Cereal("All-Bran with Extra Fiber", "C", 50, 4, 0, 140, 14.0, 8, 0, 330, 25, 3, 1.0, 0.5,
                        93.704912),
                new Cereal("Almond Delight", "C", 110, 2, 2, 200, 1.0, 14, 8, -1, 25, 3, 1.0, 0.75, 34.384843),
                new Cereal("Apple Cinnamon Cheerios", "C", 110, 2, 2, 180, 1.5, 10.5, 10, 70, 25, 1, 1.0, 0.75,
                        29.509541),
                new Cereal("Apple Jacks", "C", 110, 2, 0, 125, 1.0, 11, 14, 30, 25, 2, 1.0, 1.0, 33.174094),
                new Cereal("Basic 4", "C", 130, 3, 2, 210, 2.0, 18, 8, 100, 25, 3, 1.33, 0.75, 37.038562),
                new Cereal("Bran Chex", "C", 90, 2, 1, 200, 4.0, 15, 6, 125, 25, 1, 1.0, 0.67, 49.120253),
                new Cereal("Bran Flakes", "C", 90, 3, 0, 210, 5.0, 13, 5, 190, 25, 3, 1.0, 0.67, 53.313813),
                new Cereal("Cap'n'Crunch", "C", 120, 1, 2, 220, 0.0, 12, 12, 35, 25, 2, 1.0, 0.75, 18.042851),
                new Cereal("Cheerios", "C", 110, 6, 2, 290, 2.0, 17, 1, 105, 25, 1, 1.0, 1.25, 50.764999),
                new Cereal("Cinnamon Toast Crunch", "C", 120, 1, 3, 210, 0.0, 13, 9, 45, 25, 2, 1.0, 0.75, 19.823573),
                new Cereal("Clusters", "C", 110, 3, 2, 140, 2.0, 13, 7, 105, 25, 3, 1.0, 0.5, 40.400208),
                new Cereal("Cocoa Puffs", "C", 110, 1, 1, 180, 0.0, 12, 13, 55, 25, 2, 1.0, 1.0, 22.736446),
                new Cereal("Corn Chex", "C", 110, 2, 0, 280, 0.0, 22, 3, 25, 25, 1, 1.0, 1.0, 41.445019),
                new Cereal("Corn Flakes", "C", 100, 2, 0, 290, 1.0, 21, 2, 35, 25, 1, 1.0, 1.0, 45.863324),
                new Cereal("Corn Pops", "C", 110, 1, 0, 90, 1.0, 13, 12, 20, 25, 2, 1.0, 1.0, 35.782791),
                new Cereal("Count Chocula", "C", 110, 1, 1, 180, 0.0, 12, 13, 65, 25, 2, 1.0, 1.0, 22.396513),
                new Cereal("Cracklin' Oat Bran", "C", 110, 3, 3, 140, 4.0, 10, 7, 160, 25, 3, 1.0, 0.5, 40.448772),
                new Cereal("Cream of Wheat (Quick)", "H", 100, 3, 0, 80, 1.0, 21, 0, -1, 0, 1, 1.0, 1.0, 64.533816)
        };

        // Iterate over the array and print each Cereal object's details
        for (Cereal cereal : cereals) {
            System.out.println(cereal);
        }
    }
}