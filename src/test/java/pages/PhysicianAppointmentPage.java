package pages;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PhysicianAppointmentPage {
    public PhysicianAppointmentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}

