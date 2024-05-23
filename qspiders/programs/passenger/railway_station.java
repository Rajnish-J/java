package passenger;

class railway_station {
    public static void main(String[] args) {
        passenger[] p1 = {
            new passenger("Karthik", 21, false),
            new passenger("mukilan", 21, true)
        };

        passenger[] p2 = {
            new passenger("Bharath", 26, false),
            new passenger("Tabrez", 26, true)
        };

        passenger[] p3 = {
            new passenger("Harsha", 40, false),
            new passenger("monish", 25, false)
        };

        train train1 = new train(123465, "Chennai express", p1);
        train train2 = new train(987654, "mumbai express", p2);
        train train3 = new train(123987, "Banglore express", p3);

        train[] egmore = {train1, train2, train3};

        String result = "passenger name -     fine amount\n";
        int sum = 0;

        for(int i = 0; i<egmore.length; i++){
            for(int j = 0; j<egmore[i].p.length; j++){
                if(!egmore[i].p[j].ticket_status){
                    result += egmore[i].p[j].pname + "         -     500\n";
                    sum+=500;
                }
            }
            System.out.println();
        }
        System.out.println(result);
        System.out.println(sum);
    }    
}