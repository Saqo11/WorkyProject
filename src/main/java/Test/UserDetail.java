package Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserDetail extends MainPage {


    @BeforeEach
 public   void  mainUserDetail (){
        loginbase.goTo()
                .login("u" )
                .pass("12345678")
                .chooseTask()
                .isCorrect();


        userDetailBase.goTo();







    }


    @Test
    public  void  dfdf(){


        System.out.println("ok");


    }



}
