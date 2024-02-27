package pkg2;

interface Repairable{
    void repair(Repairable r);
}

class Tank1 implements Repairable{

    @Override
    public void repair(Repairable r) {

    }
}

class Dropship3 implements Repairable{

    @Override
    public void repair(Repairable r) {

    }
}

class Robot implements Repairable{

    @Override
    public void repair(Repairable r) {

    }
}
public class RepairClass {
}
