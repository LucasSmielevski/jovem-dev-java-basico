package Semana2;

public class CachorroSalsicha extends Cachorro{

	public void name() {
		metodoProtected();
	}
	@Override
	public void fazerBarulho() {
		System.out.println("au au");
	}
}
