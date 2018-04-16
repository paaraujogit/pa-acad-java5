package musicapp;

import java.util.ArrayList;

import pessoas.Vendedor;

public class MusicApp {

	public static void main(String[] args) {

		Instrumento objInstrumento = new Instrumento();

		ArrayList<Instrumento> listaInstrumentos = new ArrayList<>();
		
		listaInstrumentos.add(new Instrumento(objInstrumento.gerarIdInstrumento(), "Violão"));
		listaInstrumentos.add(new Instrumento(objInstrumento.gerarIdInstrumento(), "Guitarra"));
		listaInstrumentos.add(new Instrumento(objInstrumento.gerarIdInstrumento(), "Saxofone", 250.99));
		listaInstrumentos.add(new Instrumento(objInstrumento.gerarIdInstrumento(), "Teclado", 125));
		
		
		listaInstrumentos.get(0).setFinanceiro((double) 300);

		System.out.println();
		System.out.println( listaInstrumentos.get(0).getId_Instrumento() + " - " + listaInstrumentos.get(0).getNomeInstrumento()
				+ " = " + listaInstrumentos.get(0).financeiro.getPreço() + " £ VALOR A PRAZO = "
				+ listaInstrumentos.get(0).calcularPreçoAPrazo());
		
		System.out.println(listaInstrumentos.get(1).getId_Instrumento() + " - " + listaInstrumentos.get(1).getNomeInstrumento());
		
		System.out.println(listaInstrumentos.get(2).getId_Instrumento() + " - " + listaInstrumentos.get(2).getNomeInstrumento()
				+ " = " + listaInstrumentos.get(2).financeiro.getPreço() + " £ - VALOR A PRAZO = "
				+ listaInstrumentos.get(2).calcularPreçoAPrazo());
		
		System.out.println(listaInstrumentos.get(3).getId_Instrumento() + " - " + listaInstrumentos.get(3).getNomeInstrumento()
				+ " = " + listaInstrumentos.get(3).financeiro.getPreço() + " £ - VALOR A PRAZO = "
				+ listaInstrumentos.get(3).calcularPreçoAPrazo() + " A Vista Com Desconto = "
				+ listaInstrumentos.get(3).calcularDesconto());

		System.out.println("Número de instâncias (Instrumentos) = " + Instrumento.getCONTADOR());
		System.out.println();

		Vendedor objVendedor = new Vendedor();
		Vendedor objVendedor1 = new Vendedor(objVendedor.gerarIdVendedor(), "Fabio", 2000);
		Vendedor objVendedor2 = new Vendedor(objVendedor.gerarIdVendedor(), "Satiro", 2500);

		System.out.println(objVendedor1.getId_Vendedor() + " - " + objVendedor1.getNome_Vendedor() + " - "
				+ objVendedor1.getSalário() + " £");
		System.out.println(objVendedor2.getId_Vendedor() + " - " + objVendedor2.getNome_Vendedor() + " - "
				+ objVendedor2.getSalário() + " £");
		System.out.println("Número de instâncias (Vendedores) = " + Vendedor.getCONTADOR());
		System.out.println();
		
		
		

	}

}
