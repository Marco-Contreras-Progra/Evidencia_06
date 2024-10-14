import java.util.Vector;

public class Cliente {
	private Object _nombre;
	private Object _email;
	private Estado _estado;
	public Usuario_Web _unnamed_Usuario_Web_;
	public Estado _unnamed_Estado_;

	public void getNombre() {
		return this._nombre;
	}

	public void setNombre(Object aNombre) {
		this._nombre = aNombre;
	}

	public void getEmail() {
		return this._email;
	}

	public void setEmail(Object aEmail) {
		this._email = aEmail;
	}
	public class Cuenta {
		public Medio_de_Pago _unnamed_Medio_de_Pago_;
		public Vector<Pedido> _unnamed_Pedido_ = new Vector<Pedido>();
		public class Carritos_de_Compra {
			public Usuario_Web _unnamed_Usuario_Web_;
		}
	}
}