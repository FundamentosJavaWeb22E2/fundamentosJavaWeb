package br.edu.infnet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.model.domain.Aluno;

public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AlunoController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("aluno/cadastro.html").forward(request, response);		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Aluno aluno = new Aluno(request.getParameter("nome"), request.getParameter("email"));		
		aluno.setCurso(request.getParameter("curso"));
		aluno.setDisciplinas(request.getParameterValues("disciplinas"));
		aluno.setRegiao(request.getParameter("regiao"));
		
		System.out.println(aluno);
		
		request.getRequestDispatcher("confirmacao.html").forward(request, response);		

		//TODO Criar o método de impressão para chamar o tostring e o foreach
//		if(qtde > 0) {
//			System.out.println("Disciplinas:");
//			for(String disciplina : disciplinas) {
//				System.out.println("-" + disciplina);
//			}
//		} else {
//			System.out.println("Não existem disciplinas selecionadas");
//		}
	}
}