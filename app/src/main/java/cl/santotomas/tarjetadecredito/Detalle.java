package cl.santotomas.tarjetadecredito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Detalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("nombre");
        String apellido = extras.getString("apellido");
        String numTarjeta = extras.getString("numTarjeta");
        String mes = extras.getString("mes");
        String ano = extras.getString("ano");
        String codigo = extras.getString("codigo");
        String direccion = extras.getString("direccion");
        String ciudad = extras.getString("ciudad");
        String estado = extras.getString("estado");
        String codPostal = extras.getString("codPostal");

        TextView nombreResumen = (TextView) findViewById(R.id.det_Nombre);
        nombreResumen.setText(nombre+" "+apellido);
        TextView tarjetaResumen = (TextView)findViewById(R.id.det_NumTarjeta);
        tarjetaResumen.setText(numTarjeta);
        TextView mes_anoResumen = (TextView)findViewById(R.id.det_MesAño);
        mes_anoResumen.setText(mes+"/"+ano);
    }
}
