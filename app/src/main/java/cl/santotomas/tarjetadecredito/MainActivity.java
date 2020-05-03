package cl.santotomas.tarjetadecredito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*GUARDANDO EN VARIABLES LO QUE EL USUARIO INGRESA EN LOS EDITTEXT*/
        final EditText _Nombre = (EditText) findViewById(R.id.txtNombre);
        final EditText _Apellido = (EditText) findViewById(R.id.txtApellido);
        final EditText _NumTarjeta = (EditText) findViewById(R.id.txtNumTarjeta);
        final EditText _Mes = (EditText) findViewById(R.id.txtMes);
        final EditText _Ano = (EditText) findViewById(R.id.txtano);
        final EditText _Codigo = (EditText) findViewById(R.id.txtCodigo);
        final EditText _Direccion = (EditText) findViewById(R.id.txtDireccion);
        final EditText _Ciudad = (EditText) findViewById(R.id.txtCiudad);
        final EditText _Estado = (EditText) findViewById(R.id.txtEstado);
        final EditText _CodPostal = (EditText) findViewById(R.id.txtCodPostal);
        Button _btnGuardar = (Button) findViewById(R.id.btnGuardar);

        /*USAMOS FUNCION SETONCLICK PARA CONTINUAR CON EL PROCEDIMIENTOS DE LAS VARIABLES CON LOS DATOS RECIBIDOS*/

        _btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*CONTROLAMOS AQUI SI ALGÚN CAMPO ESTÁ VACÍO*/
                if(_Nombre.getText().toString().length() == 0){
                    _Nombre.setError("Campo Vacio");
                }else if(_Apellido.getText().toString().length() == 0){
                    _Apellido.setError("Campo Vacio");
                }else if(_NumTarjeta.getText().toString().length() == 0){
                    _NumTarjeta.setError("Campo Vacio");
                }else if(_Mes.getText().toString().length() == 0){
                    _Mes.setError("Campo Vacio");
                }else if(_Ano.getText().toString().length() == 0){
                    _Ano.setError("Campo Vacio");
                }else if(_Codigo.getText().toString().length() == 0){
                    _Codigo.setError("Campo Vacio");
                }else if(_Direccion.getText().toString().length() == 0){
                    _Direccion.setError("Campo Vacio");
                }else if(_Ciudad.getText().toString().length() == 0){
                    _Ciudad.setError("Campo Vacio");
                }else if(_Estado.getText().toString().length() == 0){
                    _Estado.setError("Campo Vacio");
                }else if(_CodPostal.getText().toString().length() == 0){
                    _CodPostal.setError("Campo Vacio");
                }else{
                    /*SI TODOS LOS CAMPOS ESTAN COMPLETOS, ENTRA AQUI CONTINUANDO EL PROCESO*/
                    Intent resultado = new Intent(MainActivity.this, Detalle.class);
                            CardClass nuevito = new CardClass(
                                    _Nombre.getText().toString(),
                                    _Apellido.getText().toString(),
                                    _NumTarjeta.getText().toString(),
                                    _Mes.getText().toString(),
                                    _Ano.getText().toString(),
                                    _Codigo.getText().toString(),
                                    _Direccion.getText().toString(),
                                    _Ciudad.getText().toString(),
                                    _Estado.getText().toString(),
                                    _CodPostal.getText().toString()
                            );
                            resultado.putExtra("nombre", nuevito.getNombre());
                            resultado.putExtra("apellido", nuevito.getApellido());
                            resultado.putExtra("numTarjeta", nuevito.getNumTarjeta());
                            resultado.putExtra("mes", nuevito.getMes());
                            resultado.putExtra("ano", nuevito.getAno());
                            resultado.putExtra("codigo", nuevito.getCodigo());
                            resultado.putExtra("direccion", nuevito.getCalleNum());
                            resultado.putExtra("ciudad", nuevito.getCiudad());
                            resultado.putExtra("estado", nuevito.getEstado());
                            resultado.putExtra("codPostal", nuevito.getCodigoPostal());

                            startActivity(resultado);
                }



            }
        });






    }
}
