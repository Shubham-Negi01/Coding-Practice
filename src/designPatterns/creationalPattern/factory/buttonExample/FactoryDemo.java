package designPatterns.creationalPattern.factory.buttonExample;

public class FactoryDemo {

    public static void main(String[] args) {
        SystemUI sysUI = null;
        String os = "lin";
        if(os.equals("win"))
            sysUI = new WindowsUI();
        else if(os.equals("lin"))
            sysUI = new LinuxUI();
        sysUI.showButton();
    }
    
}
