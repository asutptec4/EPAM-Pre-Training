package com.shishonok.task07;

import com.shishonok.task07.controller.TrainCompanyController;
import com.shishonok.task07.test.Test;

/**
 * Start train app.
 * 
 * @version 1 17.06.2018
 * @author Alexander Shishonok
 *
 */
public class TrainCompanyRunner {

    public static void main(String[] args) {
	if (args != null && "test".equals(args[0].toLowerCase())) {
	    Test.execute();
	}
	TrainCompanyController.start();
    }

}
