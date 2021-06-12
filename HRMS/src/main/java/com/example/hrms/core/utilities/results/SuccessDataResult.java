package com.example.hrms.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T>{

	//başarılı bir data sonucunda bana data ve mesaj ver
	public SuccessDataResult(T data, String message) {
		super(data, true, message);
	}
	
	//başarılı bir data sonucunda bana sadece data ver
	public SuccessDataResult(T data) {
		super(data, true);
	}
	
	//başarılı bir data sonucunda bana sadece null ve mesaj ver
		public SuccessDataResult(String message) {
			super(null, true, message);
	}
		
	//başarılı bir data sonucunda bana null ver
	public SuccessDataResult() {
		super(null, true);
	}

}
