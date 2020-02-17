package com.bit.plan;

import com.bit.service.Radio;
import com.bit.service.Remote;
import com.bit.service.Tv;

public class PlanJava {

	public static void main(String[] args) {

		Remote remote=new Remote();
//		Remote remote=new Remote(new Tv());
		remote.setRemote(new Radio());
		remote.func3();
	}

}
