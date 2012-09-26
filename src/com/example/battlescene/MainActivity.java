package com.example.battlescene;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void button1Click(View view){
    	TextView textView = (TextView)findViewById(R.id.textView4);
		textView.setText("敵を選んでください。");
    }
    
	public void buttonEClick(View view){
		TextView textView = (TextView)findViewById(R.id.textView4);
//		ImageView View = (ImageView)findViewById(R.id.imageView1);
		switch (view.getId()) {
		case R.id.imageView1:
//			imageView.setView(R.drawable.enemy_a_2);
			textView.setText("敵Aを攻撃した！\n" + "敵Aに" + 10 + "のダメージ！");
			break;
		case R.id.imageView2:
			textView.setText("敵Bを攻撃した！\n" +	"敵Bに" + 10 + "のダメージ！");
			break;
		default:
			textView.setText("敵を選んでください。");
			}
		}
    
    public void button2Click(View view){
    	TextView textView = (TextView)findViewById(R.id.textView4);
    	textView.setText("逃げ出した！");
    }
    
    public void button3Click(View view){
    	TextView textView = (TextView)findViewById(R.id.textView4);
    	textView.setText("防御した！");
    }
    
    public void button4Click(View view){
    	TextView textView = (TextView)findViewById(R.id.textView4);
    	textView.setText("道具を選んでください！");    			
    }
}
				
    ////////////////////////////////////////////////////////////////////////////////////////
    // ①攻撃することを決める		：	「たたかう」ボタンをクリックする。
    // ②攻撃対象である敵Aを指定する	：	imageviewをクリックする。
	// ③攻撃したことを表示する		：	textview4上に「敵Aに攻撃した。10のダメージを与えた。」と表記する。
    ////////////////////////////////////////////////////////////////////////////////////////
