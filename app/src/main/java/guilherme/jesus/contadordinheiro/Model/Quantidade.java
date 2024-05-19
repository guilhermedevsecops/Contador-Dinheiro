package guilherme.jesus.contadordinheiro.Model;

import android.util.Log;
import android.widget.EditText;

import guilherme.jesus.contadordinheiro.App.AppUtil;

/***
 * Interface de inputs pegos
 */

public class Quantidade {



    /*Valores inseridos*/
    protected int quantidadeCincoCentavos;
    protected int quantidadeDezCentavos;
    protected int quantidadeVinteCincoCentavos;
    protected int quantidadeCinquentaCentavos;
    protected int quantidadeUmReal;
    protected int quantidadeDoisReais;
    protected int quantidadeCincoReais;
    protected int quantidadeDezReais;
    protected int quantidadeVinteReais;
    protected int quantidadeCinquentaReais;
    protected int quantidadeCemReais;
    protected int quantidadeDuzentosReais;



    public void setQuantidadeCincoCentavos(EditText quantidadeCincoCentavos) {

        try{
            String valor = quantidadeCincoCentavos.getText().toString();
            int valorConvertido = Integer.parseInt(valor);
            this.quantidadeCincoCentavos = valorConvertido;
        }catch (NumberFormatException e){
            Log.e(AppUtil.TAG, "setQuantidadeCincoCentavos: Erro Ao Converter o valor", e );
        }
    }


    public void setQuantidadeDezCentavos(EditText quantidadeDezCentavos) {
        try{
            String valor = quantidadeDezCentavos.getText().toString();
            int valorConvertido = Integer.parseInt(valor);
            this.quantidadeDezCentavos = valorConvertido;
        }catch (NumberFormatException e){
            Log.e(AppUtil.TAG, "setQuantidadeCincoCentavos: Erro Ao Converter o valor", e );
        }
    }

    public void setQuantidadeVinteCincoCentavos(EditText quantidadeVinteCincoCentavos) {
        try{
            String valor = quantidadeVinteCincoCentavos.getText().toString();
            int valorConvertido = Integer.parseInt(valor);
            this.quantidadeVinteCincoCentavos =valorConvertido;

        }catch(NumberFormatException e){

        }
    }


    public void setQuantidadeCinquentaCentavos(EditText quantidadeCinquentaCentavos) {
        try{
            String valor = quantidadeCinquentaCentavos.getText().toString();
            int valorConvertido = Integer.parseInt(valor);
            this.quantidadeCinquentaCentavos =valorConvertido;

        }catch(NumberFormatException e){

        }
    }

    public void setQuantidadeUmReal(EditText quantidadeUmReal) {
        try {
            String valor = quantidadeUmReal.getText().toString();
            int valorConvertido = Integer.parseInt(valor);
            this.quantidadeUmReal = valorConvertido;
        } catch (NumberFormatException e) {
            Log.d(AppUtil.TAG, "voidsetQuantidadeUmReal: " + e);
        }
    }

    public void setQuantidadeDoisReais(EditText quantidadeDoisReais){
        try{
            String valor = quantidadeDoisReais.getText().toString();
            int valorConvertido = Integer.parseInt(valor);
            this.quantidadeDoisReais = valorConvertido;
        }catch (Exception e){

        }
    }


    public void setQuantidadeCincoReais(EditText quantidadeCincoReais) {
        try{
            String valor = quantidadeCincoReais.getText().toString();
            int valorConvertido = Integer.parseInt(valor);
            this.quantidadeCincoReais = valorConvertido;

        }catch(NumberFormatException e){

        }
    }

    public void setQuantidadeDezReais(EditText quantidadeDezReais) {
        try{
            String valor = quantidadeDezReais.getText().toString();
            int valorConvertido = Integer.parseInt(valor);
            this.quantidadeDezReais = valorConvertido;

        }catch(NumberFormatException e){

        }
    }

    public void setQuantidadeVinteReais(EditText quantidadeVinteReais) {
        try{
            String valor = quantidadeVinteReais.getText().toString();
            int valorConvertido = Integer.parseInt(valor);
            this.quantidadeVinteReais = valorConvertido;

        }catch(NumberFormatException e){

        }
    }

    public void setQuantidadeCinquentaReais(EditText quantidadeCinquentaReais) {
        try{
            String valor = quantidadeCinquentaReais.getText().toString();
            int valorConvertido = Integer.parseInt(valor);
            this.quantidadeCinquentaReais = valorConvertido;

        }catch(NumberFormatException e){

        }
    }

    public void setQuantidadeCemReais(EditText quantidadeCemReais) {
        try{
            String valor = quantidadeCemReais.getText().toString();
            int valorConvertido = Integer.parseInt(valor);
            this.quantidadeCemReais = valorConvertido;

        }catch(NumberFormatException e){

        }
    }

    public void setQuantidadeDuzentosReais(EditText quantidadeDuzentosReais) {
        try{
            String valor = quantidadeDuzentosReais.getText().toString();
            int valorConvertido = Integer.parseInt(valor);
            this.quantidadeDuzentosReais = valorConvertido;


        }catch(NumberFormatException e){

        }
    }

}


