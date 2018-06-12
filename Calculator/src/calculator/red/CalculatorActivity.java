package calculator.red;

import android.R.string;
import android.app.Activity;

import android.content.res.Configuration;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends Activity {
	private Button btn1;
	private TextView tv1;

	/** Called when the activity is first created. */
	@Override
   
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        if(this.getResources().getConfiguration() .orientation == Configuration.ORIENTATION_PORTRAIT)
        {
        	 setContentView(R.layout.main);
        }
        else if(this.getResources().getConfiguration() .orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
        	setContentView(R.layout.lanbd);
        }
        btn1 = (Button)findViewById(R.id.Button01);
        tv1 =  (TextView)findViewById(R.id.TextView1);
        
    }

	public void oneClicked(View v) {
		String t = tv1.getText().toString() + btn1.getText().toString();
		tv1.setText(t);
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}
	
	

}