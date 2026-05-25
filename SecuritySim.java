class CyberAtk{
    String TargetIP;

    public CyberAtk(String TargetIP){
        this.TargetIP = TargetIP;
    }

    void execute(){
        System.out.println("Executing generic cyber attack at " + TargetIP);
    }
}
class DDoS extends CyberAtk{
    DDoS(String TargetIP){
        super(TargetIP);
    }
    @Override
    void execute(){
        System.out.println("Executing DDoS attack at " + TargetIP);
        System.out.println("Flooding servers with millions of packets.");
    }
}
class Phishing extends CyberAtk{
    Phishing(String TargetIP){
        super(TargetIP);
    }
    @Override
    void execute(){
        System.out.println("Sending fake login page to " + TargetIP);
    }
}
class Malware extends CyberAtk{
    Malware(String TargetIP){
        super(TargetIP);
    }
    @Override
    void execute(){
        System.out.println("Injecting malware into system at " + TargetIP);
    }
}
class SecuritySim{
    public static void main(String[] args) {
        //Polymorphism
        CyberAtk d1 = new DDoS("192.10.10");
        CyberAtk d2 = new Phishing("127.10.10");
        CyberAtk d3 = new Malware("192.8.8");

        d1.execute();
        System.out.println("");
        d2.execute();
        System.out.println("");
        d3.execute();
        System.out.println("");
    }
}