public class DescribeSelf {
    public static void main (String[] args)
    {
        String name = "Tim";
        String favouriteCourse = "SDE";
        int studentNumber = 1882000;
        String neighbour = "Laurens-Jan";

        String[] stats = {name, favouriteCourse, String.valueOf(studentNumber), neighbour};

        System.out.println("Ik ben " + name + "." + " Mijn favoriete course is " + favouriteCourse + "." + " Mijn studentnummer is " + studentNumber + "." + " Mijn buurman is " +
                neighbour + ".");
        System.out.println(stats);
    }
}
