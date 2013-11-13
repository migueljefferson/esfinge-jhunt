package br.esfinge.entidades.negocios;

import java.util.HashSet;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import br.esfinge.entidades.Convite;
import br.esfinge.entidades.Resumo;
import br.esfinge.entidades.Usuario;
import br.esfinge.entidades.dao.UsuarioDAO;

@Stateless(mappedName = "ejb/UsuarionRN")
public class UsuarioRN {

	@EJB
	private UsuarioDAO usuarioDAO;

	public UsuarioRN() {
		this.usuarioDAO = new UsuarioDAO();
	}

	public void criarContaUsuario(Usuario usuario) {
		if (usuario.getAmizades() == null) {
			usuario.setAmizades(new HashSet<Convite>());
		}

		if (usuario.getResumos() == null) {
			usuario.setResumos(new HashSet<Resumo>());
		}

		this.usuarioDAO.salvar(usuario);
	}

}
