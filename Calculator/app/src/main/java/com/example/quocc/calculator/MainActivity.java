package com.example.quocc.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnPlus, btnMinus, btnMul, btnDiv;
    Button btnDot, btnResult;
    Toast toast;
    double firstNumber = 0, secondNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = (TextView) findViewById(R.id.txtResult);

        txtResult.setText("0");

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("");
                    txtResult.setText(txtResult.getText() + "0");
                } else {
                    txtResult.setText(txtResult.getText() + "0");
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("");
                    txtResult.setText(txtResult.getText() + "1");
                } else {
                    txtResult.setText(txtResult.getText() + "1");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("");
                    txtResult.setText(txtResult.getText() + "2");
                } else {
                    txtResult.setText(txtResult.getText() + "2");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("");
                    txtResult.setText(txtResult.getText() + "3");
                } else {
                    txtResult.setText(txtResult.getText() + "3");
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("");
                    txtResult.setText(txtResult.getText() + "4");
                } else {
                    txtResult.setText(txtResult.getText() + "4");
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("");
                    txtResult.setText(txtResult.getText() + "5");
                } else {
                    txtResult.setText(txtResult.getText() + "5");
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("");
                    txtResult.setText(txtResult.getText() + "6");
                } else {
                    txtResult.setText(txtResult.getText() + "6");
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("");
                    txtResult.setText(txtResult.getText() + "7");
                } else {
                    txtResult.setText(txtResult.getText() + "7");
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("");
                    txtResult.setText(txtResult.getText() + "8");
                } else {
                    txtResult.setText(txtResult.getText() + "8");
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("");
                    txtResult.setText(txtResult.getText() + "9");
                } else {
                    txtResult.setText(txtResult.getText() + "9");
                }
            }
        });

        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getDisabledOperatorButton() == null) {
                    if (!txtResult.getText().toString().equals("0")) {
                        firstNumber = Double.parseDouble(txtResult.getText() + "");
                        txtResult.setText("0");
                    }
                }
                btnMinus.setEnabled(true);
                btnMul.setEnabled(true);
                btnDiv.setEnabled(true);
                view.setEnabled(false);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getDisabledOperatorButton() == null) {
                    if (!txtResult.getText().toString().equals("0")) {
                        firstNumber = Double.parseDouble(txtResult.getText() + "");
                        txtResult.setText("0");
                    }
                }
                btnPlus.setEnabled(true);
                btnMul.setEnabled(true);
                btnDiv.setEnabled(true);
                view.setEnabled(false);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getDisabledOperatorButton() == null) {
                    if (!txtResult.getText().toString().equals("0")) {
                        firstNumber = Double.parseDouble(txtResult.getText() + "");
                        txtResult.setText("0");
                    }
                }
                btnPlus.setEnabled(true);
                btnMinus.setEnabled(true);
                btnDiv.setEnabled(true);
                view.setEnabled(false);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getDisabledOperatorButton() == null) {
                    if (!txtResult.getText().toString().equals("0")) {
                        firstNumber = Double.parseDouble(txtResult.getText() + "");
                        txtResult.setText("0");
                    }
                }
                btnPlus.setEnabled(true);
                btnMinus.setEnabled(true);
                btnMul.setEnabled(true);
                view.setEnabled(false);
            }
        });

        btnDot = (Button) findViewById(R.id.btnDot);
        btnResult = (Button) findViewById(R.id.btnResult);

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(txtResult.getText() + ".");
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNumber != 0) {
                    if (!txtResult.getText().toString().equals("0")) {
                        secondNumber = Double.parseDouble(txtResult.getText() + "");
                    }
                }
                Button btn = getDisabledOperatorButton();
                if (btn != null) {
                    if (btn.getText().toString().equals("+")) {
                        txtResult.setText(firstNumber + secondNumber + "");
                        firstNumber = 0;
                        secondNumber = 0;
                        btn.setEnabled(true);
                    }
                    if (btn.getText().toString().equals("-")) {
                        txtResult.setText(firstNumber - secondNumber + "");
                        firstNumber = 0;
                        secondNumber = 0;
                        btn.setEnabled(true);
                    }
                    if (btn.getText().toString().equals("x")) {
                        txtResult.setText(firstNumber * secondNumber + "");
                        firstNumber = 0;
                        secondNumber = 0;
                        btn.setEnabled(true);
                    }
                    if (btn.getText().toString().equals("/")) {
                        if (secondNumber == 0) {
                            toast = Toast.makeText(getApplicationContext(), "Cannot divide by zero!", Toast.LENGTH_LONG);
                            toast.show();
                        } else {
                            txtResult.setText(firstNumber / secondNumber + "");
                            firstNumber = 0;
                            secondNumber = 0;
                            btn.setEnabled(true);
                        }
                    }
                }
            }
        });
    }

    public Button getDisabledOperatorButton() {
        if (!btnPlus.isEnabled())
            return btnPlus;
        if (!btnMinus.isEnabled())
            return btnMinus;
        if (!btnMul.isEnabled())
            return btnMul;
        if (!btnDiv.isEnabled())
            return btnDiv;
        return null;
    }

}
