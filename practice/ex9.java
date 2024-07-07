// toString method

class employee extends Object{
    int eid;
    String ename;

    public employee(int eid, String ename){
        this.eid = eid;
        this.ename = ename;
    }

    @Override
    public String toString(){
        return ename + " " + eid;
    }

    public static void main(String[] args) {
        employee e1 = new employee(1, "rajnish");
        System.out.println(e1);
//        System.out.println(e1.eid);
    }
}