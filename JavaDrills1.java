public class JavaDrills1 {
    public static void main(String[] args) {
        String firstName = "Rey";
        String lastName = "Skywalker";
        String birthday = "15 ABY";
        String homeWorld = "Jakku";
        double reyHeight = 170.18; //in cm
        double reyWeight = 119.05;
        double purse = 150.0;

        purse = purse - 24.3; //Mubo
        purse = purse - 45; //Den of Antiquities
        purse = purse*2; //Black Spire gamble
        purse = purse - purse*.10; //Savi's Lightsabers
        System.out.println(purse);
        String handleColor = "Black";
        String bladeColor = "Purple";
        if(handleColor == "Black" && bladeColor == "Purple")
            System.out.println("This one's mine!");
        else
            System.out.println("Pass");

        String shipName = "Millenium Falcon";
        if(shipName == "Millenium Falcon")
            System.out.println("Let's go");
        else
            System.out.println("I better hide somewhere");

        int itemCost = 1;
        int drinkCost = 2;
        int drinkSize = 36;
        boolean isRecommendedItem = true;
        if((itemCost < 5 && isRecommendedItem) || (drinkCost < 1 || drinkSize > 24)) {
            System.out.println("I'm getting this drink");
        } else {
            System.out.println("Hard pass");
        }

    }
}
