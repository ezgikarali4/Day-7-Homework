package com.example.hrms.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T>{
	
		//başarısız bir data sonucunda bana data ve mesaj ver
		public ErrorDataResult(T data, String message) {
			super(data, false, message);
		}
		
		//başarısız bir data sonucunda bana sadece data ver
		public ErrorDataResult(T data) {
			super(data, false);
		}
		
		//başarısız bir data sonucunda bana sadece null ve mesaj ver
			public ErrorDataResult(String message) {
				super(null, false, message);
		}
			
		//başarısız bir data sonucunda bana null ver
		public ErrorDataResult() {
			super(null, false);
		}
}
