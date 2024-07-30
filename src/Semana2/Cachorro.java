package Semana2;

public class Cachorro extends Animal {
	@Override
	protected void metodoProtected() {
		super.metodoProtected();
	}

	@Override
	public void fazerBarulho() {
		System.out.println("au");
		
	}
}
