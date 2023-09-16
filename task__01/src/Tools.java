public class Tools { // Single responsibility qanunu - bizim
                    // Tools classimiz yalnizca metodlarimizdan ibaret olacaq

    public void fillUser(){ // bizim fillUser methodumuz yalniz bir ishi gorecek..
        String name = InputUtil.inputString("Enter the name");


    }
    public void showUser(){
        // meselen by method ancaq show elemelidir...
    }
}
