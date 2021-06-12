package com.example.hrms.core.utilities.results;

public class DataResult<T> extends Result{

	private T data;
	//burda bir data da dondurmem lazım
	public DataResult(T data, boolean success, String message) {
		super(success, message); //base sınıfın constructorlarını calıstırmaya yarıyo super(success message)
		this.data = data;
	}

	public DataResult(T data, boolean success) {
		super(success); //base sınıfın constructorlarını calıstırmaya yarıyo super(success message)
		this.data = data;
	}
	
	//datayı aldık
	public T getData() {
		return this.data;
	}
}
