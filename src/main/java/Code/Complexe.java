package Code;

public interface Complexe
{
	public double reel();
	public double imag();
	public double mod();
	public double arg();

	// Opérations modifiant l'objet
	public Complexe add(final Complexe complexe);
	public Complexe sub(final Complexe complexe);
	public Complexe mul(final Complexe complexe);
	// Opérations ne modifiant pas l'objet (renvoi d'une copie modifiée)
	public Complexe plus(final Complexe complexe);
	public Complexe moins(final Complexe complexe);
	public Complexe fois(final Complexe complexe);
}
