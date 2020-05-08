package br.com.sigacegonheiro.main;

import br.com.sigacegonheiro.util.HibernateUtil;

public class GerarTabela {
	
		public static void main(String[] args) {
			HibernateUtil.getSessionFactory();
			//HibernateUtil.getSessionFactory().close();
		}

}
