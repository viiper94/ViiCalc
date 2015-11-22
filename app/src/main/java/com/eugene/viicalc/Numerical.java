package com.eugene.viicalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Numerical extends Activity {

    TextView result;
    int i = 0, subi = 1, divi = 1, nsx = 0, nsm = 1, nsd = 1, numsys = 10;
    float x1, x, m1, m, d1, d, y;
    String binary = "", decimal = "", octal = "", hex = "", oper = "=", s, sx;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonA;
    Button buttonB;
    Button buttonC;
    Button buttonD;
    Button buttonE;
    Button buttonF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numerical);
        result = (TextView)findViewById(R.id.textView);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        buttonA = (Button)findViewById(R.id.button_A);
        buttonB = (Button)findViewById(R.id.button_B);
        buttonC = (Button)findViewById(R.id.button_C);
        buttonD = (Button)findViewById(R.id.button_D);
        buttonE = (Button)findViewById(R.id.button_E);
        buttonF = (Button)findViewById(R.id.button_F);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_numerical, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.action_advanced:
                Intent intent = new Intent(Numerical.this, Advanced.class);
                startActivity(intent);
                break;
            case R.id.action_simple:
                Intent intent1 = new Intent(Numerical.this, Simple.class);
                startActivity(intent1);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                if (String.valueOf(result.getText()).endsWith(".")||String.valueOf(result.getText()).contains("."));
                else{
                    result.setText(String.valueOf(result.getText()) + ".");
                }
                break;
            case R.id.button0:
                if ("0".equals(String.valueOf(result.getText()))||i==1){
                    result.setText("0");
                    i=0;
                }
                else result.setText(String.valueOf(result.getText()) + 0);
                break;
            case R.id.button1:
                if ("0".equals(String.valueOf(result.getText()))||i==1){
                    result.setText("1");
                    i=0;
                }
                else result.setText(String.valueOf(result.getText()) + 1);
                break;
            case R.id.button2:
                if ("0".equals(String.valueOf(result.getText()))||i==1){
                    result.setText("2");
                    i=0;
                }
                else result.setText(String.valueOf(result.getText()) + 2);
                break;
            case R.id.button3:
                if ("0".equals(String.valueOf(result.getText()))||i==1){
                    result.setText("3");
                    i=0;
                }
                else result.setText(String.valueOf(result.getText()) + 3);
                break;
            case R.id.button4:
                if ("0".equals(String.valueOf(result.getText()))||i==1){
                    result.setText("4");
                    i=0;
                }
                else result.setText(String.valueOf(result.getText()) + 4);
                break;
            case R.id.button5:
                if ("0".equals(String.valueOf(result.getText()))||i==1){
                    result.setText("5");
                    i=0;
                }
                else result.setText(String.valueOf(result.getText()) + 5);
                break;
            case R.id.button6:
                if ("0".equals(String.valueOf(result.getText()))||i==1){
                    result.setText("6");
                    i=0;
                }
                else result.setText(String.valueOf(result.getText()) + 6);
                break;
            case R.id.button7:
                if ("0".equals(String.valueOf(result.getText()))||i==1){
                    result.setText("7");
                    i=0;
                }
                else result.setText(String.valueOf(result.getText()) + 7);
                break;
            case R.id.button8:
                if ("0".equals(String.valueOf(result.getText()))||i==1){
                    result.setText("8");
                    i=0;
                }
                else result.setText(String.valueOf(result.getText()) + 8);
                break;
            case R.id.button9:
                if ("0".equals(String.valueOf(result.getText()))||i==1){
                    result.setText("9");
                    i=0;
                }
                else result.setText(String.valueOf(result.getText()) + 9);
                break;
            case R.id.button_clear:
                result.setText("0");
                break;
            case R.id.button_A:
                if ("0".equals(String.valueOf(result.getText()))||i==1){
                    result.setText("A");
                    i=0;
                }
                else result.setText(String.valueOf(result.getText())+"A");
                break;
            case R.id.button_B:
                if ("0".equals(String.valueOf(result.getText()))||i==1){
                    result.setText("B");
                    i=0;
                }
                else result.setText(String.valueOf(result.getText())+"B");
                break;
            case R.id.button_C:
                if ("0".equals(String.valueOf(result.getText()))||i==1){
                    result.setText("C");
                    i=0;
                }
                else result.setText(String.valueOf(result.getText())+"C");
                break;
            case R.id.button_D:
                if ("0".equals(String.valueOf(result.getText()))||i==1){
                    result.setText("D");
                    i=0;
                }
                else result.setText(String.valueOf(result.getText())+"D");
                break;
            case R.id.button_E:
                if ("0".equals(String.valueOf(result.getText()))||i==1){
                    result.setText("E");
                    i=0;
                }
                else result.setText(String.valueOf(result.getText())+"E");
                break;
            case R.id.button_F:
                if ("0".equals(String.valueOf(result.getText()))||i==1){
                    result.setText("F");
                    i=0;
                }
                else result.setText(String.valueOf(result.getText())+"F");
                break;
        }
    }

    public void onActionClick(View view) {
        switch (view.getId()){
            case R.id.button_add:
                oper = "ns+";
                int x1 = Integer.parseInt(String.valueOf(result.getText()), numsys);
                nsx += x1;
                sx = String.valueOf(nsx);
                if (numsys == 2){
                    result.setText(Integer.toBinaryString(Integer.parseInt(sx)));
                }
                if (numsys == 8){
                    result.setText(Integer.toOctalString(Integer.parseInt(sx)));
                }
                if (numsys == 16){
                    result.setText(Integer.toHexString(Integer.parseInt(sx)));
                }
                else if (numsys == 10) result.setText(sx);
                i = 1;
                break;
            case R.id.button_sub:
                oper = "ns-";
                if (subi == 1){
                    nsx = Integer.parseInt(String.valueOf(result.getText()), numsys);
                }
                else {
                    x1 = Integer.parseInt(String.valueOf(result.getText()), numsys);
                    nsx -= x1;
                }
                sx = String.valueOf(nsx);
                if (numsys == 2){
                    result.setText(Integer.toBinaryString(Integer.parseInt(sx)));
                }
                if (numsys == 8){
                    result.setText(Integer.toOctalString(Integer.parseInt(sx)));
                }
                if (numsys == 16){
                    result.setText(Integer.toHexString(Integer.parseInt(sx)));
                }
                else if (numsys == 10) result.setText(sx);
                i = 1;
                subi++;
                break;
            case R.id.button_mul:
                oper = "ns*";
                s = String.valueOf(result.getText());
                m1 = Integer.parseInt(String.valueOf(result.getText()), numsys);
                nsm *= m1;
                sx = String.valueOf(nsm);
                if (numsys == 2){
                    result.setText(Integer.toBinaryString(Integer.parseInt(sx)));
                }
                if (numsys == 8){
                    result.setText(Integer.toOctalString(Integer.parseInt(sx)));
                }
                if (numsys == 16){
                    result.setText(Integer.toHexString(Integer.parseInt(sx)));
                }
                else if (numsys == 10) result.setText(sx);
                i = 1;
                break;
            case R.id.button_div:
                oper = "ns/";
                if (divi == 1){
                    nsd = Integer.parseInt(String.valueOf(result.getText()), numsys);
                }
                else {
                    d1 = Integer.parseInt(String.valueOf(result.getText()), numsys);
                    nsd /= d1;
                }
                sx = String.valueOf(nsd);
                if (numsys == 2){
                    result.setText(Integer.toBinaryString(Integer.parseInt(sx)));
                }
                if (numsys == 8){
                    result.setText(Integer.toOctalString(Integer.parseInt(sx)));
                }
                if (numsys == 16){
                    result.setText(Integer.toHexString(Integer.parseInt(sx)));
                }
                else if (numsys == 10) result.setText(sx);
                divi += 1;
                i = 1;
                break;
            case R.id.button_equal:
                s = String.valueOf(result.getText());
                y = Float.parseFloat(s);
                if ("ns+".equals(oper)){
                    int sb = Integer.parseInt(String.valueOf(result.getText()), numsys) + nsx;
                    if (numsys == 2){
                        result.setText(Integer.toBinaryString(sb));
                    }
                    if (numsys == 8){
                        result.setText(Integer.toOctalString(sb));
                    }
                    if (numsys == 16){
                        result.setText(Integer.toHexString(sb));
                    }
                    else if (numsys == 10) result.setText(Integer.toString(sb));
                }
                if ("ns-".equals(oper)){
                    int sb = nsx - Integer.parseInt(String.valueOf(result.getText()), numsys);
                    if (numsys == 2){
                        result.setText(Integer.toBinaryString(sb));
                    }
                    if (numsys == 8){
                        result.setText(Integer.toOctalString(sb));
                    }
                    if (numsys == 16){
                        result.setText(Integer.toHexString(sb));
                    }
                    else if (numsys == 10) result.setText(Integer.toString(sb));
                }
                if ("ns*".equals(oper)){
                    int sb = nsm * Integer.parseInt(String.valueOf(result.getText()), numsys);
                    if (numsys == 2){
                        result.setText(Integer.toBinaryString(sb));
                    }
                    if (numsys == 8){
                        result.setText(Integer.toOctalString(sb));
                    }
                    if (numsys == 16){
                        result.setText(Integer.toHexString(sb));
                    }
                    else if (numsys == 10) result.setText(Integer.toString(sb));
                }
                if ("ns/".equals(oper)){
                    int sb = nsd / Integer.parseInt(String.valueOf(result.getText()), numsys);
                    if (numsys == 2){
                        result.setText(Integer.toBinaryString(sb));
                    }
                    if (numsys == 8){
                        result.setText(Integer.toOctalString(sb));
                    }
                    if (numsys == 16){
                        result.setText(Integer.toHexString(sb));
                    }
                    else if (numsys == 10) result.setText(Integer.toString(sb));
                }
                i = 1;
                x = 0;
                nsx = 0;
                oper = "=";
                subi = 1;
                divi = 1;
                m = 1;
                nsm = 1;
                d = 1;
                nsd = 1;
                break;
        }
    }

    public void onRadioClick(View view) {
        switch (view.getId()){
            case R.id.radio_bin:
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                buttonA.setEnabled(false);
                buttonB.setEnabled(false);
                buttonC.setEnabled(false);
                buttonD.setEnabled(false);
                buttonE.setEnabled(false);
                buttonF.setEnabled(false);
                binary = Integer.toBinaryString(Integer.parseInt(String.valueOf(result.getText()), numsys));
                result.setText(binary);
                numsys = 2;
                i = 1;
                break;
            case R.id.radio_oct:
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);
                button7.setEnabled(true);
                button8.setEnabled(false);
                button9.setEnabled(false);
                buttonA.setEnabled(false);
                buttonB.setEnabled(false);
                buttonC.setEnabled(false);
                buttonD.setEnabled(false);
                buttonE.setEnabled(false);
                buttonF.setEnabled(false);
                octal = Integer.toOctalString(Integer.parseInt(String.valueOf(result.getText()), numsys));
                result.setText(octal);
                numsys = 8;
                i = 1;
                break;
            case R.id.radio_dec:
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);
                button7.setEnabled(true);
                button8.setEnabled(true);
                button9.setEnabled(true);
                buttonA.setEnabled(false);
                buttonB.setEnabled(false);
                buttonC.setEnabled(false);
                buttonD.setEnabled(false);
                buttonE.setEnabled(false);
                buttonF.setEnabled(false);
                decimal = String.valueOf(Integer.parseInt(String.valueOf(result.getText()), numsys));
                result.setText(decimal);
                numsys = 10;
                i = 1;
                break;
            case R.id.radio_hex:
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);
                button7.setEnabled(true);
                button8.setEnabled(true);
                button9.setEnabled(true);
                buttonA.setEnabled(true);
                buttonB.setEnabled(true);
                buttonC.setEnabled(true);
                buttonD.setEnabled(true);
                buttonE.setEnabled(true);
                buttonF.setEnabled(true);
                hex = String.valueOf(Integer.parseInt(String.valueOf(result.getText()), numsys));
                result.setText(hex);
                numsys = 16;
                i = 1;
                break;
        }
    }
}
