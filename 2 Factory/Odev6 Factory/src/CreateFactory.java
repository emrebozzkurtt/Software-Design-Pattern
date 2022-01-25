public class CreateFactory {
    
    public CreateService CreateApp(String appType){
        if(appType == "Desktop"){
            return new DesktopApp();
        }
        else if(appType == "Mobile"){
            return new MobileApp();
        }
        else{
            return null;
        }
    }

}
