package com.mphasis;

public class TestResorces {

	public static void main(String[] args)throws Exception {
		TryWithResourcesDemo demo=new TryWithResourcesDemo();
		DemosFileNotFoundException dof=new DemosFileNotFoundException();
		try(demo;dof){
			System.out.println("using demo resources");
		}

	}

}
