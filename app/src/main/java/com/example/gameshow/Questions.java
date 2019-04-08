package com.example.gameshow;

class Questions {
    public String mQuestions[]= {
            "The US icon Uncle Sam was based on Samuel Wilson who worked during the War of 1812 as a what?",
            "Which is the second planet in the Solar System?",
            "During World War II, US soldiers used the first commercial aerosol cans to hold what?",
            "The Earth is approximately how many miles away from the Sun?",
            "Which of the following men does not have a chemical element named for him?",
            "In the children's book series, where is Paddington Bear originally from?",
            "Which insect shorted out an early supercomputer and inspired the term ,'computer bug'?",
            "What letter must appear at the beginning of the registration number of all non-military aircraft in the U.S.?",
            "What insect has legs but doesn't walk?",
            "What heats up our planets?",

    };

    private String mChoices[][] = {
            {"meat inspector","mail deliverer","historian","weapons mechanic"},
            {"Jupiter","Venus","Earth","Neptune"},
            {"cleaning fluid","insecticide","antiseptic","shaving cream"},
            {"39 million","93 million","193 million","9.3 million"},
            {"Niels Bohr","Enrico Fermi","Issac Newton","Albert Einstein"},
            {"France","Ecuador","Iceland","Peru"},
            {"Beetle","Moth","Roach","Fly"},
            {"L","N","U","A"},
            {"DragonFly","FruitFly","Ladybug","HoneyBee"},
            {"Venus","Earth","Sun","Mercury"},
    };

    private String mCorrectAnswers[] = {"meat inspector","Venus","insecticide","93 million","Issac Newton","Peru","Moth","N","DragonFly","Sun"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }
    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }


}
