package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        int userInput;
        boolean willContinue;
        do {
            displayMenu();
            System.out.println("Choose an option");
            userInput = input.getInt(0, 5);
            willContinue = progressChoice(userInput);
            System.out.println(willContinue);

        } while(willContinue);
    }

    public static void displayMenu() {
        String menu = "What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category";
        System.out.println(menu);
    }
    public static boolean progressChoice(int userInput) {
        boolean output = true;
        switch (userInput) {
            case 0:
                System.out.println("Exit");
                output = false;
                break;
            case 1:
                displayMovies();
                break;
            case 2:
                displayMovieCategories("animated");
                break;
            case 3:
                displayMovieCategories("drama");
                break;
            case 4:
                displayMovieCategories("horror");
                break;
            case 5:
                displayMovieCategories("sci-fi");
                break;
        }
        return output;
    }
    public static void displayMovies() {
//        for(int i = 0; i < MoviesArray.findAll().length; i++) {
//        System.out.println(MoviesArray.findAll()[i].getMovie());
//        System.out.println(MoviesArray.findAll()[i].getCategory());
//    }
        String output = "";
        for(Movie movie : MoviesArray.findAll()) {
            output += String.format("%s -- %s\n", movie.getMovie(), movie.getCategory());
        }
        System.out.println(output);
    }
    public static void displayMovieCategories(String category) {
        String output = "";
        for(Movie movie : MoviesArray.findAll()) {
            if(category.equalsIgnoreCase(movie.getCategory())) {
                output += String.format("%s -- %s\n", movie.getMovie(), movie.getCategory());
            }
        }
        System.out.println(output);
    }
}
