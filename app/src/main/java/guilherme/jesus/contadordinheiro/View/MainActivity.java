package guilherme.jesus.contadordinheiro.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import guilherme.jesus.contadordinheiro.App.AppUtil;
import guilherme.jesus.contadordinheiro.Model.Quantidade;
import guilherme.jesus.contadordinheiro.Model.Valores;
import guilherme.jesus.contadordinheiro.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Label onde irá ser inserido os valores após formulas
         */

        TextView totalGeral = (TextView)findViewById(R.id.valorTotal);
        TextView totalNotas = (TextView) findViewById(R.id.geralNotas);
        TextView totalMoedas = (TextView) findViewById(R.id.geralMoedas);

        /***
         * Inputs de quantidades no EditText da GUI
         */

        /* Moedas*/

        EditText inputCincoCentavos = (EditText) findViewById(R.id.inputCincoCentavos);
        EditText inputDezCentavos = (EditText) findViewById(R.id.inputDezCentavos);
        EditText inputVinteCincoCentavos = (EditText) findViewById(R.id.inputVinteCincoCentavos);
        EditText inputCinquentaCentavos = (EditText) findViewById(R.id.inputCinquentaCentavos);
        EditText inputUmReal = (EditText) findViewById(R.id.inputUmReal);

        /*Notas*/

        EditText inputDoisReais = (EditText) findViewById(R.id.inputDoisReais);
        EditText inputCincoReais = (EditText) findViewById(R.id.inputCincoReais);
        EditText inputDezReais = (EditText) findViewById(R.id.inputDezReais);
        EditText inputVinteReais = (EditText) findViewById(R.id.inputVinteReais);
        EditText inputCinquentaReais = (EditText) findViewById(R.id.inputCinquentaReais);
        EditText inputCemReais = (EditText) findViewById(R.id.inputCemReais);
        EditText inputDuzentosReais = (EditText) findViewById(R.id.inputDuzentosReais);

        /**
         * Botão onde irá ser efetuada  a soma total dos valores inseridos
         */

        Button botao = (Button) findViewById(R.id.button_resultado);


        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Ação executada ao clicar no botão

                //Inserção de Moedas
                Quantidade quantidade = new Quantidade();
                quantidade.setQuantidadeCincoCentavos(inputCincoCentavos);
                quantidade.setQuantidadeDezCentavos(inputDezCentavos);
                quantidade.setQuantidadeVinteCincoCentavos(inputVinteCincoCentavos);
                quantidade.setQuantidadeCinquentaCentavos(inputCinquentaCentavos);
                quantidade.setQuantidadeUmReal(inputUmReal);

                //Inserção de Reais

                quantidade.setQuantidadeDoisReais(inputDoisReais);
                quantidade.setQuantidadeCincoReais(inputCincoReais);
                quantidade.setQuantidadeDezReais(inputDezReais);
                quantidade.setQuantidadeVinteReais(inputVinteReais);
                quantidade.setQuantidadeCinquentaReais(inputCinquentaReais);
                quantidade.setQuantidadeCemReais(inputCemReais);
                quantidade.setQuantidadeDuzentosReais(inputDuzentosReais);

                //Importação de classe que irá demonstrar valor total

                //Centavos

                Valores valor = new Valores();
                valor.getCincoCentavos(quantidade);
                valor.getDezCentavos(quantidade);
                valor.getVinteCincoCentavos(quantidade);
                valor.getCinquentaCentavos(quantidade);
                valor.getUmReal(quantidade);

                //Reais

                valor.getDoisReais(quantidade);
                valor.getCincoReais(quantidade);
                valor.getDezReais(quantidade);
                valor.getVinteReais(quantidade);
                valor.getCinquentaReais(quantidade);
                valor.getCemReais(quantidade);
                valor.getDuzentosReais(quantidade);




                totalGeral.setText(Double.toString(valor.getTotalValor(quantidade)));
                totalMoedas.setText(Double.toString(valor.getTotalMoedas(quantidade)));
                totalNotas.setText(Double.toString(valor.getTotalNotas(quantidade)));

            }

        });

        /**
         * Botão onde será apagado os dados
         */

        Button apagar = (Button) findViewById(R.id.apagar);

        apagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputCincoCentavos.setText("");
                inputDezCentavos.setText("");
                inputVinteCincoCentavos.setText("");
                inputCinquentaCentavos.setText("");
                inputUmReal.setText("");

                inputDoisReais.setText("");
                inputCincoReais.setText("");
                inputDezReais.setText("");
                inputVinteReais.setText("");
                inputCinquentaReais.setText("");
                inputCemReais.setText("");
                inputDuzentosReais.setText("");

                totalGeral.setText("");
                totalMoedas.setText("");
                totalNotas.setText("");

            }
        });





    }
}