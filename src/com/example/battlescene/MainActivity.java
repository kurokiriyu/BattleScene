package com.example.battlescene;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	// アプリ『BattleScene』を起動したときのスタート画面。
	// つまり、activity_main.xmlを表した状態。
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    // actiity_main.xml内のandroid:onClick="button1Click"の詳細
    public void button1Click(View view){
    	
    	// activity_test2.xmlファイルに書いたtextView4に、
        // R.id.textView4という名前がつけられている。
        // それを「findViewById()」というメソッドを使って取り出し、
        // プログラムで使えるようにする。
    	TextView textView = (TextView)findViewById(R.id.textView4);
		
		// そこへテキストを貼り付ける。
		textView.setText("敵Aに攻撃した！");
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
