package com.time.common.core.sequence;


/***
 * Sequence管理类，
 * 获取sequence分两种方式：随机起始值，固定起始值
 *
 */
public  class SequenceManager {

	private static String[] dataCenterIdList = new String[]{"0","1","2","3"};

	/**
	 * 暂时未区分dataCenterId,随机获取
	 * 随机获取dataCenterId 取值范围 0-3
	 * 毫秒内随机起始值开始
	 * @return
	 */
	public static Long getSequenceRandom(){
		System.out.println("dataCenterId = " + getDataCentId());
		Sequence sequence = new Sequence(getDataCentId(),false,true);
		return sequence.nextId();
	}

	/**
	 * 暂时未区分dataCenterId,随机获取
	 * 随机获取dataCenterId 取值范围 0-3
	 * 毫秒内固定起始值开始
	 * @return
	 */
	public static Long getSequence(){
		System.out.println("dataCenterId = " + getDataCentId());
		Sequence sequence = new Sequence(getDataCentId(),false,false);
		return sequence.nextId();
	}

	/**
	 * 随机获取dataCenterId
	 * @return
	 */
	private static Long getDataCentId(){
		int a= (int) Math.floor(Math.random()* dataCenterIdList.length);
		Long dataCenterId = Long.valueOf(dataCenterIdList[a]);
		return  dataCenterId;
	}

	//public static void main(String[] args){
	//	System.out.println(getSequenceRandom());
	//	System.out.print(" , "+getSequence());
	//}
}
