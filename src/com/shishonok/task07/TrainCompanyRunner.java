package com.shishonok.task07;

import com.shishonok.task07.controller.TrainCompanyController;
import com.shishonok.task07.test.Test;

public class TrainCompanyRunner {

    public static void main(String[] args) {
	if (args != null && "test".equals(args[0].toLowerCase())) {
	    Test.execute();
	}
	TrainCompanyController.start();
    }

}
