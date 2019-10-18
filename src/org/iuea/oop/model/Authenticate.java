package org.iuea.oop.model;

/*THE ELLITES
 *  MUGALAASI NAJIIB 18/UG/496/BSSE-S
 * RUGENDABANGA MIREILLE SIFA 18/879/BIT
 * MIREMBE CAROLYNE SANDRA 18/UG/467/BIT-S
 * MUGABI MARK MARVIN 18/UG/487/BIT-S
 *INGABIRE RACHAEL 18/UG/899/BIT-S*/
public class Authenticate {

	public static boolean authenticate(String username, String password) {
        // hardcoded username and password
        if (username.equals("man") && password.equals("man")) {
            return true;
        }
        return false;
    }
	
}
