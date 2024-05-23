package passenger;

class train {
    int train_no;
    String name;
    passenger[] p;
    
    train(int train_no, String name, passenger[] p){
        //lnsm
        this.train_no = train_no;
        this.name = name;
        this.p = p;
    }

    private void detailsofTrain(){
        System.out.println("Train number: ");
        System.out.println("Train name: ");
        System.out.println("");
        System.out.println();
    }

    public train detailsofTrainObject(){
        return new train(train_no, name, p);
    }
}
