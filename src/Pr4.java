public class Pr4 {
    public void task1() {
        // 1
        Seasons myFavoriteSeason = Seasons.Winter;
        System.out.println("name: " + myFavoriteSeason.name() + ", order: " + myFavoriteSeason.ordinal());
        // 6
        for (var season : Seasons.values()) {
            System.out.println(season.name() + " temperature: " + season.getSeasonTemperature() + ", description: " + getDescription(season));
        }
    }
    private enum Seasons {
        Winter(-25), Spring(9), Summer(25), Autumn(9);
        // 3
        int seasonTemperature;
        public int getSeasonTemperature() { return seasonTemperature; }
        // 4
        Seasons(int temperature) {
            seasonTemperature = temperature;
        }
    }
    // 2
    private void printFavoriteSeason(Seasons season) {
        switch (season) {
            case Winter -> System.out.println("Я люблю зиму");
            case Spring -> System.out.println("Я люблю аллергию");
            case Summer -> System.out.println("Я люблю лето");
            default -> System.out.println("Я люблю осень");
        }
    }
    // 5
    private String getDescription(Seasons season) {
        switch (season) {
            case Winter: return "Холодное время года";
            case Spring: return "Период цветения";
            case Summer: return "Жаркое время года";
            default: return "Вторые по популярности обои на Windows 98";
        }
    }


    public void task4() {

    }
}
