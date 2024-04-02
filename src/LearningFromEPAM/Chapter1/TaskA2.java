package LearningFromEPAM.Chapter1;

public class TaskA2 {
    public static void main(String[] args) {
//        for (String str : args) {
//            System.out.printf("Argument --> %s%n" , str);
//            PS C:\Users\васья\IdeaProjects\start\src> java LearningFromEPAM.Chapter1.TaskA2 asda wefa afaf
//            Argument --> asda
//            Argument --> wefa
//            Argument --> afaf
//        }
        for (int i = args.length - 1;i>=0;i--){
            System.out.println(args[i]);
        }
    }
}
//    PS C:\Users\васья\IdeaProjects\start\src> java LearningFromEPAM.Chapter1.TaskA2 11111 222222 333333333333 4444444444444 555555555
//
//        555555555
//        4444444444444
//        333333333333
//        222222
//        11111
