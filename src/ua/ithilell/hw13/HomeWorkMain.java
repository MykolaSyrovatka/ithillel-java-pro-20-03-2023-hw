package ua.ithilell.hw13;

import java.io.File;

public class HomeWorkMain {
    public static void main(String[] args) {
        System.out.println("DZ 13");
        File file1 = new File("D:\\GIT\\ithillel-java-pro-20-03-2023-hw\\src\\ua\\ithilell\\hw7\\ArrayValueCalculator.java");
        File file2 = new File("D:\\GIT\\ithillel-java-pro-20-03-2023-hw\\src\\ua\\ithilell\\hw7\\HomeWorkMain.java");
        File file3 = new File("D:\\GIT\\ithillel-java-pro-20-03-2023-hw\\src\\ua\\ithilell\\hw7\\exceptions\\ArrayDataException.java");
        File file4 = new File("D:\\GIT\\ithillel-java-pro-20-03-2023-hw\\src\\ua\\ithilell\\hw7\\exceptions\\ArraySizeException.java");
        File file5 = new File("D:\\GIT\\ithillel-java-pro-20-03-2023-hw\\src\\ua\\ithilell\\hw8\\HomeWorkMain.java");
        File file6 = new File("D:\\GIT\\ithillel-java-pro-20-03-2023-hw\\src\\ua\\ithilell\\hw8\\figures\\Circle.java");
        File file7 = new File("D:\\GIT\\ithillel-java-pro-20-03-2023-hw\\src\\ua\\ithilell\\hw8\\figures\\Figure.java");
        File file8 = new File("D:\\GIT\\ithillel-java-pro-20-03-2023-hw\\src\\ua\\ithilell\\hw8\\figures\\Square.java");
        File file9 = new File("D:\\GIT\\ithillel-java-pro-20-03-2023-hw\\src\\ua\\ithilell\\hw8\\figures\\Triangle.java");
        File file10 = new File("D:\\GIT\\ithillel-java-pro-20-03-2023-hw\\src\\ua\\ithilell\\hw8\\members\\Cat.java");
        File file11 = new File("D:\\GIT\\ithillel-java-pro-20-03-2023-hw\\src\\ua\\ithilell\\hw8\\members\\Human.java");
        File file12 = new File("D:\\GIT\\ithillel-java-pro-20-03-2023-hw\\src\\ua\\ithilell\\hw8\\members\\Member.java");
        File file13 = new File("D:\\GIT\\ithillel-java-pro-20-03-2023-hw\\src\\ua\\ithilell\\hw8\\members\\Obstacle.java");
        File file14 = new File("D:\\GIT\\ithillel-java-pro-20-03-2023-hw\\src\\ua\\ithilell\\hw8\\members\\Robot.java");
        File file15 = new File("D:\\GIT\\ithillel-java-pro-20-03-2023-hw\\src\\ua\\ithilell\\hw8\\members\\RunningTrack.java");
        File file16 = new File("D:\\GIT\\ithillel-java-pro-20-03-2023-hw\\src\\ua\\ithilell\\hw8\\members\\Wall.java");

        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add(file1);
        fileNavigator.add(file2);
        fileNavigator.add(file3);
        fileNavigator.add(file4);
        fileNavigator.add(file5);
        fileNavigator.add(file6);
        fileNavigator.add(file7);
        fileNavigator.add(file8);
        fileNavigator.add(file9);
        fileNavigator.add(file10);
        fileNavigator.add(file11);
        fileNavigator.add(file12);
        fileNavigator.add(file13);
        fileNavigator.add(file14);
        fileNavigator.add(file15);
        fileNavigator.add(file16);
        System.out.println(fileNavigator.find("D:\\GIT\\ithillel-java-pro-20-03-2023-hw\\src\\ua\\ithilell\\hw8\\figures"));
        System.out.println(fileNavigator.filterBySize(100));
        //fileNavigator.remove("D:\\GIT\\ithillel-java-pro-20-03-2023-hw\\src\\ua\\ithilell\\hw8\\figures");
        System.out.println(fileNavigator.filterBySize(100));
        System.out.println(fileNavigator.sortBySize());
    }
}
