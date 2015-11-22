package com.eugene.viicalc;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.math.BigDecimal;

public class Advanced extends Activity {

    TextView result;
    int i = 0, subi = 1, divi = 1, ang = 0, step = 1;
    String oper = "=", sa, s, se;
    float x1, x, m1, m, d1, d, y;
    double sq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
        result = (TextView)findViewById(R.id.textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_advanced, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.action_simple:
                Intent intent = new Intent(Advanced.this, Simple.class);
                startActivity(intent);
                break;
            case R.id.action_numerical:
                Intent intent1 = new Intent(Advanced.this, Numerical.class);
                startActivity(intent1);
                break;
            case R.id.action_degrees:
                ang = 0;
                item.setChecked(true);
                break;
            case R.id.action_radians:
                ang = 1;
                item.setChecked(true);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onClick(View view) {
        switch(view.getId()){
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
        }
        return true;
    }
    public void onActionClick(View view) {
        switch (view.getId()){
            case R.id.button_add:
                oper = "+";
                x1 = Float.parseFloat(String.valueOf(result.getText()));
                x += x1;
                sa = String.valueOf(new BigDecimal(x).setScale(5, BigDecimal.ROUND_HALF_UP));
                while (sa.endsWith("0")) {
                    sa = sa.substring(0, sa.length()-1);
                }
                if (sa.endsWith(".")) sa = sa.substring(0, sa.length()-1);
                result.setText(sa);
                i = 1;
                break;
            case R.id.button_sub:
                oper = "-";
                s = String.valueOf(result.getText());
                if (subi == 1){
                    x = Float.parseFloat(s);
                }
                else {
                    x1 = Float.parseFloat(s);
                    x = x - x1;
                }
                sa = String.valueOf(new BigDecimal(x).setScale(5, BigDecimal.ROUND_HALF_UP));
                while (sa.endsWith("0")) {
                    sa = sa.substring(0, sa.length()-1);
                }
                if (sa.endsWith(".")) sa = sa.substring(0, sa.length()-1);
                result.setText(sa);
                i = 1;
                subi++;
                break;
            case R.id.button_mul:
                oper = "*";
                s = String.valueOf(result.getText());
                m1 = Float.parseFloat(s);
                m = m * m1;
                sa = String.valueOf(new BigDecimal(m).setScale(5, BigDecimal.ROUND_HALF_UP));
                while (sa.endsWith("0")) {
                    sa = sa.substring(0, sa.length()-1);
                }
                if (sa.endsWith(".")) sa = sa.substring(0, sa.length()-1);
                result.setText(sa);
                i = 1;
                break;
            case R.id.button_div:
                oper = "/";
                s = String.valueOf(result.getText());
                if (divi == 1){
                    d = Float.parseFloat(s);
                }
                else {
                    d1 = Float.parseFloat(s);
                    d = d / d1;
                }
                sa = String.valueOf(new BigDecimal(d).setScale(5, BigDecimal.ROUND_HALF_UP));
                while (sa.endsWith("0")) {
                    sa = sa.substring(0, sa.length()-1);
                }
                if (sa.endsWith(".")) sa = sa.substring(0, sa.length()-1);
                result.setText(sa);
                i = 1;
                divi += 1;
                i = 1;
                break;
            case R.id.button_equal:
                s = String.valueOf(result.getText());
                y = Float.parseFloat(s);
                if ("+".equals(oper)){
                    double z = x + y;
                    String se = String.valueOf(new BigDecimal(z).setScale(5, BigDecimal.ROUND_HALF_UP));
                    while (se.endsWith("0")) {
                        se = se.substring(0, se.length()-1);
                    }
                    if (se.endsWith(".")) se = se.substring(0, se.length()-1);
                    result.setText(se);
                }
                if ("-".equals(oper)){
                    float z = x - y;
                    String se = String.valueOf(new BigDecimal(z).setScale(5, BigDecimal.ROUND_HALF_UP));
                    while (se.endsWith("0")) {
                        se = se.substring(0, se.length()-1);
                    }
                    if (se.endsWith(".")) se = se.substring(0, se.length()-1);
                    result.setText(se);
                }
                if ("*".equals(oper)){
                    double z = m * y;
                    String se = String.valueOf(new BigDecimal(z).setScale(5, BigDecimal.ROUND_HALF_UP));
                    while (se.endsWith("0")) {
                        se = se.substring(0, se.length()-1);
                    }
                    if (se.endsWith(".")) se = se.substring(0, se.length()-1);
                    result.setText(se);
                }
                if ("/".equals(oper)){
                    double z = d / y;
                    String se = String.valueOf(new BigDecimal(z).setScale(5, BigDecimal.ROUND_HALF_UP));
                    while (se.endsWith("0")) {
                        se = se.substring(0, se.length()-1);
                    }
                    if (se.endsWith(".")) se = se.substring(0, se.length()-1);
                    result.setText(se);
                }
                if ("^".equals(oper)){
                    double z = Math.pow(m, y);
                    String se = String.valueOf(new BigDecimal(z).setScale(5, BigDecimal.ROUND_HALF_UP));
                    while (se.endsWith("0")) {
                        se = se.substring(0, se.length()-1);
                    }
                    if (se.endsWith(".")) se = se.substring(0, se.length()-1);
                    result.setText(se);
                }
                if ("=".equals(oper)){
                    double z = y * y;
                    String se = String.valueOf(new BigDecimal(z).setScale(5, BigDecimal.ROUND_HALF_UP));
                    while (se.endsWith("0")) {
                        se = se.substring(0, se.length()-1);
                    }
                    if (se.endsWith(".")) se = se.substring(0, se.length()-1);
                    result.setText(se);
                }
                i = 1;
                x = 0;
                oper = "=";
                subi = 1;
                divi = 1;
                m = 1;
                d = 1;
                break;
        }
    }

    public void onAdvancedClick(View view) {
        switch (view.getId()){
            case R.id.button_sin:
                s = String.valueOf(result.getText());
                x = Float.parseFloat(s);
                if (ang == 0){
                    double dx = Math.toRadians(x);
                    sq = Math.sin(dx);
                }
                else {
                    sq = Math.sin(x);
                }
                se = String.valueOf(new BigDecimal(sq).setScale(5,  BigDecimal.ROUND_HALF_UP));
                while (se.endsWith("0")) {
                    se = se.substring(0, se.length()-1);
                }
                if (se.endsWith(".")) se = se.substring(0, se.length()-1);
                result.setText(se);
                i = 1;
                break;
            case R.id.button_cos:
                s = String.valueOf(result.getText());
                x = Float.parseFloat(s);
                if (ang == 0){
                    double dx = Math.toRadians(x);
                    sq = Math.cos(dx);
                }
                else {
                    sq = Math.cos(x);
                }
                se = String.valueOf(new BigDecimal(sq).setScale(5,  BigDecimal.ROUND_HALF_UP));
                while (se.endsWith("0")) {
                    se = se.substring(0, se.length()-1);
                }
                if (se.endsWith(".")) se = se.substring(0, se.length()-1);
                result.setText(se);
                i = 1;
                break;
            case R.id.button_tg:
                s = String.valueOf(result.getText());
                x = Float.parseFloat(s);
                if (ang == 0){
                    double dx = Math.toRadians(x);
                    sq = Math.tan(dx);
                }
                else {
                    sq = Math.tan(x);
                }
                se = String.valueOf(new BigDecimal(sq).setScale(5,  BigDecimal.ROUND_HALF_UP));
                while (se.endsWith("0")) {
                    se = se.substring(0, se.length()-1);
                }
                if (se.endsWith(".")) se = se.substring(0, se.length()-1);
                result.setText(se);
                i = 1;
                break;
            case R.id.button_xy:
                oper = "^";
                s = String.valueOf(result.getText());
                if (step == 1){
                    m = Float.parseFloat(s);
                }
                else {
                    m1 = Float.parseFloat(s);
                    m = (float) Math.pow(m, m1);
                }
                i = 1;
                step++;
                break;
            case R.id.button_x3:
                s = String.valueOf(result.getText());
                x = Float.parseFloat(s);
                sq = Math.pow(x, 3);
                se = String.valueOf(new BigDecimal(sq).setScale(3,  BigDecimal.ROUND_HALF_UP));
                while (se.endsWith("0")) {
                    se = se.substring(0, se.length()-1);
                }
                if (se.endsWith(".")) se = se.substring(0, se.length()-1);
                result.setText(se);
                i = 1;
                break;
            case R.id.button_ln:
                s = String.valueOf(result.getText());
                x = Float.parseFloat(s);
                sq = Math.log(x);
                se = String.valueOf(new BigDecimal(sq).setScale(5,  BigDecimal.ROUND_HALF_UP));
                while (se.endsWith("0")) {
                    se = se.substring(0, se.length()-1);
                }
                if (se.endsWith(".")) se = se.substring(0, se.length()-1);
                result.setText(se);
                i = 1;
                break;
            case R.id.button_lg:
                s = String.valueOf(result.getText());
                x = Float.parseFloat(s);
                sq = Math.log10(x);
                se = String.valueOf(new BigDecimal(sq).setScale(5,  BigDecimal.ROUND_HALF_UP));
                while (se.endsWith("0")) {
                    se = se.substring(0, se.length()-1);
                }
                if (se.endsWith(".")) se = se.substring(0, se.length()-1);
                result.setText(se);
                i = 1;
                break;
            case R.id.button_iverse:
                s = String.valueOf(result.getText());
                x = Float.parseFloat(s);
                if (x==0){
                    result.setText("ERROR!");
                }
                else {
                    double b = 1/x;
                    se = String.valueOf(new BigDecimal(b).setScale(5,  BigDecimal.ROUND_HALF_UP));
                    while (se.endsWith("0")) {
                        se = se.substring(0, se.length()-1);
                    }
                    if (se.endsWith(".")) se = se.substring(0, se.length()-1);
                    result.setText(se);
                }
                i = 1;
                break;
            case R.id.button_sqrt:
                s = String.valueOf(result.getText());
                x = Float.parseFloat(s);
                sq = Math.sqrt(x);
                se = String.valueOf(new BigDecimal(sq).setScale(5,  BigDecimal.ROUND_HALF_UP));
                while (se.endsWith("0")) {
                    se = se.substring(0, se.length()-1);
                }
                if (se.endsWith(".")) se = se.substring(0, se.length()-1);
                result.setText(se);
                i = 1;
                break;
            case R.id.button_pi:
                result.setText("3.14159");
                break;
        }
    }
}
