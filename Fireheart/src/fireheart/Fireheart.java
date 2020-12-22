/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireheart;

import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

/**
 *
 * @author User
 */
public class Fireheart {
    public static String prefix = "~";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws LoginException {
        JDA jda;
        jda = JDABuilder.createDefault("Nzg5NjM4NDc5OTUxODIyODU5.X90-JA.2fmyVDrWTstksHZNB9N6t7lt_4c")
                //.setActivity(Activity.watching("Fireheart Gaming"))
                .setActivity(Activity.playing("Being developed"))
                .setStatus(OnlineStatus.DO_NOT_DISTURB)
                .build();
    }
    
}
