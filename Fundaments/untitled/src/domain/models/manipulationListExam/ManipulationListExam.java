package domain.models.manipulationListExam;

import java.util.Scanner;

public class ManipulationListExam {
    public void execute() {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];

        for(int i = 0 ; i < 10 ; i ++){
            names[i] = sc.nextLine();
            if(i == 2 )
                System.out.println(names[i]);
            if(i == 6 )
                System.out.println(names[i]);
            if(i == 8 )
                System.out.println(names[i]);
        }
    }

}
