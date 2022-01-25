public class DesktopApp implements CreateService {

    public DesktopApp(){
        System.out.println("Nesne Oluşturulurken, Created Desktop App.");
    }

    @Override
    public void CreateAppMethod() {
        System.out.println("Created Desktop App.");        
    }
    
}
