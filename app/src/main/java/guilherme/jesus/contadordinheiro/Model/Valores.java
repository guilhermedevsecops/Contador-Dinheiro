package guilherme.jesus.contadordinheiro.Model;

import android.widget.EditText;
import android.widget.TextView;

/***
 * Classe dos valores trabalhados
 */

public class Valores extends Quantidade{
    /*Valores Totais*/
    protected double totalValor;
    protected double totalMoedas;
    protected double totalNotas;

    /*Valores moedas */
    protected double cincoCentavos = 0.05;
    protected double dezCentavos = 0.10;
    protected double vinteCincoCentavos = 0.25;
    protected double cinquentaCentavos = 0.50;
    protected double umReal = 1;

    /*Valores Notas*/
    protected double doisReais = 2;
    protected double cincoReais = 5;
    protected double dezReais = 10;
    protected double vinteReais= 20;
    protected double cinquentaReais = 50;
    protected double cemReais = 100;
    protected double duzentosReais = 200;




    public double getTotalValor(Quantidade obj) {
        return this.totalValor = this.cincoCentavos * obj.quantidadeCincoCentavos + this.dezCentavos * obj.quantidadeDezCentavos + this.vinteCincoCentavos * obj.quantidadeVinteCincoCentavos + this.cinquentaCentavos * obj.quantidadeCinquentaCentavos + this.umReal * obj.quantidadeUmReal + this.doisReais * obj.quantidadeDoisReais + this.cincoReais * obj.quantidadeCincoReais + this.dezReais * obj.quantidadeDezReais + this.vinteReais * obj.quantidadeVinteReais + this.cinquentaReais * obj.quantidadeCinquentaReais + this.cemReais * obj.quantidadeCemReais + this.duzentosReais * obj.quantidadeDuzentosReais ;
    }

    public double getTotalMoedas(Quantidade obj) {
        return this.totalMoedas = this.cincoCentavos * obj.quantidadeCincoCentavos + this.dezCentavos * obj.quantidadeDezCentavos + this.vinteCincoCentavos * obj.quantidadeVinteCincoCentavos + this.cinquentaCentavos * obj.quantidadeCinquentaCentavos + this.umReal * obj.quantidadeUmReal;
    }

    public double getTotalNotas(Quantidade obj) {
        return this.totalNotas = this.doisReais * obj.quantidadeDoisReais + this.cincoReais * obj.quantidadeCincoReais + this.dezReais * obj.quantidadeDezReais + this.vinteReais * obj.quantidadeVinteReais + this.cinquentaReais * obj.quantidadeCinquentaReais + this.cemReais * obj.quantidadeCemReais + this.duzentosReais * obj.quantidadeDuzentosReais;
    }

    public double getCincoCentavos(Quantidade obj) {
        return this.cincoCentavos * obj.quantidadeCincoCentavos;
    }

    public double getDezCentavos(Quantidade obj) {
        return this.dezCentavos * obj.quantidadeDezCentavos;
    }

    public double getVinteCincoCentavos(Quantidade obj) {
        return this.vinteCincoCentavos * obj.quantidadeVinteCincoCentavos;
    }

    public double getCinquentaCentavos(Quantidade obj) {
        return this.cinquentaCentavos * obj.quantidadeCinquentaCentavos;
    }

    public double getUmReal(Quantidade obj) {
        return this.umReal * obj.quantidadeUmReal;
    }

    public double getDoisReais(Quantidade obj) {
        return this.doisReais * obj.quantidadeDoisReais;
    }

    public double getCincoReais(Quantidade obj) {
        return this.cincoReais * obj.quantidadeCincoReais;
    }

    public double getDezReais(Quantidade obj) {
        return this.dezReais * obj.quantidadeDezReais;
    }

    public double getVinteReais(Quantidade obj) {
        return this.vinteReais * obj.quantidadeVinteReais;
    }

    public double getCinquentaReais(Quantidade obj) {
        return this.cinquentaReais * obj.quantidadeCinquentaReais;
    }

    public double getCemReais(Quantidade obj) {
        return this.cemReais * obj.quantidadeCemReais;
    }

    public double getDuzentosReais(Quantidade obj) {
        return this.duzentosReais * obj.quantidadeDuzentosReais;
    }
}
