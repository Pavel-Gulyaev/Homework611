package com.example.homework6_1_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String text;
    String methodName;
    private static final String TEXTVIEW_STATE_KEY = "TEXTVIEW_STATE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
        methodName = "onCreate";
        textView.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
        if (savedInstanceState != null && savedInstanceState.containsKey(TEXTVIEW_STATE_KEY)){
            text = savedInstanceState.getString(TEXTVIEW_STATE_KEY);
            textView.setText(text);
        } else {
            text = "savedInstanceState == null";
            textView.append("\n" + text);
            Log.d("Lifecycle", text);
        }
    }

    @Override
    protected void onStart() {

        super.onStart();
        methodName = "onStart";
        textView.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }

    @Override
    protected void onResume() {

        super.onResume();
        methodName = "onResume";
        textView.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }

    @Override
    protected void onPause() {

        super.onPause();
        methodName = "onPause";
        textView.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }

    @Override
    protected void onStop() {

        super.onStop();
        methodName = "onStop";
        textView.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        methodName = "onDestroy";
        textView.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }

    @Override
    protected void onRestart() {

        super.onRestart();
        methodName = "onRestart";
        textView.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {

        super.onPostCreate(savedInstanceState);
        methodName = "onPostCreate";
        textView.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }

    @Override
    protected void onPostResume() {

        super.onPostResume();
        methodName = "onPostResume";
        textView.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        methodName = "onKeyDown";
        textView.append("\n" + methodName);
        Log.d("Lifecycle", methodName);

        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed(){
        methodName = "onBackPressed";
        textView.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
        super.onBackPressed();
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        methodName = "onKeyLongPress";
        textView.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onSaveInstanceState(Bundle saveInstanceState) {

        saveInstanceState.putString(TEXTVIEW_STATE_KEY, textView.getText().toString());
        super.onSaveInstanceState(saveInstanceState);
        methodName = "onSaveInstanceState";
        textView.append("\n" + methodName);
        Log.d("Lifecycle", methodName);

    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        methodName = "onRestoreInstanceState";
        textView.append("\n" + methodName);
        Log.d("Lifecycle", methodName);

    }



}
