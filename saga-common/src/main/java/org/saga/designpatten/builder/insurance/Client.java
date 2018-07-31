package org.saga.designpatten.builder.insurance;

public class Client {
	
	public static boolean test(){
		String username = "";
		if(username.equals("")){}
		int  x = 1;
		return x==1?true:false;

	}
	
	public static void main(String[] args) {
		
		// 创建构建器对象
		InsuranceContract.ConcreteBuilder builder = InsuranceContract.getBuilderInstance("9527", 123L, 456L);
		
		// 设置需要的数据，然后构建保险合同对象
		InsuranceContract contract = builder.setPersonName("小明").setOtherData("test").build();
		
		// 操作保险合同对象的方法
		contract.someOperation();
	}
}
