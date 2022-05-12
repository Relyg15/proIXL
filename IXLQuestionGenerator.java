import java.util.*;

public class IXLQuestionGenerator {
    private int gradeLevel;
    private int topic;
    private int score;


    public IXLQuestionGenerator(int gradeLvl, int tp) {
        gradeLevel = gradeLvl;
        topic = tp;
        score = 0;
        generateQuestions();
    }
    public void generateQuestions(){
        if (gradeLevel == 1)
        {
            if (topic == 1){ subtractByOne();}

            else  addByFour();
        }
        else if (gradeLevel == 2){

            if (topic == 1){ subtractByMultiplesOfTen();}

            else addThreeNums();
        }
        else if (gradeLevel == 3){
            if (topic == 1) { mixedOperations();}

            else divideByThree();
        }
        else if (gradeLevel == 4){
            if (topic == 1){ addThousands();}

            else findTwoNums();
        }

        else if (gradeLevel == 5){
            if (topic == 1){ addNumBillion();}

            else multiplyNums();
        }

    }

    public void addNumBillion(){

    }
    public void multiplyNums(){

    }
    public void addThousands(){

    }
    public void findTwoNums(){

    }
    public void mixedOperations(){

    }
    public void divideByThree(){

    }
    public void subtractByMultiplesOfTen(){

    }
    public void addThreeNums(){

    }
    public void subtractByOne(){

    }

    public void addByFour(){

    }
}
