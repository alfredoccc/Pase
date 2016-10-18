package android.aas.pase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private Button btn_Aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        InicializarInterface();
    }

    private void InicializarInterface(){
        btn_Aceptar = (Button) findViewById(R.id.btn_Aceptar);

        btn_Aceptar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_Aceptar:
                finish();
                break;
        }
    }
}
