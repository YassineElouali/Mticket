
import com.backend.Dao.UserDao;
import com.backend.beans.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author el ouali
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User u=new User("elouali.yassine12@gmail.com", "admin");
        UserDao ud=new UserDao();
        ud.create(u);
    }
    
}
