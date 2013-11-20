package br.fafica.Luta.Online.Model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.fafica.Luta.Online.Interface.InterfaceAcao;

public class AcaoLogount implements InterfaceAcao {

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		session.removeAttribute("usuario");
		session.invalidate();
		response.sendRedirect("index.jsp");

	}

}
