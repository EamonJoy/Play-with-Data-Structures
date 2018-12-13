public class Main {

    public static void main(String[] args) {

//        int[] scores = new int[]{56,12,54,100};
//
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println(scores[i]);
//        }
//
//        System.out.println();
//
//        scores[2] = 100;
//        for (int score: scores) {
//            System.out.println(score);
//        }


        Array<Integer> array = new Array<>();
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);

        array.addLast(100);
        array.addFirst(99);
        System.out.println(array);

        array.removeFirst();
        array.removeElement(100);
        System.out.println(array);


//        Array<Student> studentArray = new Array<>();
//        studentArray.addLast(new Student("张三",70));
//        studentArray.addLast(new Student("李四",80));
//        studentArray.addLast(new Student("王五",90));
//        System.out.println(studentArray);

    }
}
