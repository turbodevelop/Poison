package com.ashish.root.poison;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText refPos1, refPos2, refPos3, refPos4, refPos5, refPos6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        refPos1 = findViewById(R.id.idPos1);
        refPos2 = findViewById(R.id.idPos2);
        refPos3 = findViewById(R.id.idPos3);
        refPos4 = findViewById(R.id.idPos4);
        refPos5 = findViewById(R.id.idPos5);
        refPos6 = findViewById(R.id.idPos6);

        refPos6.requestFocus();
        refPos6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                refPos5.requestFocus();
                refPos5.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        refPos4.requestFocus();
                        refPos4.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                                refPos3.requestFocus();
                                refPos3.addTextChangedListener(new TextWatcher() {
                                    @Override
                                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                    }

                                    @Override
                                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                                        refPos2.requestFocus();
                                        refPos2.addTextChangedListener(new TextWatcher() {
                                            @Override
                                            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {


                                            }

                                            @Override
                                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                                                refPos1.requestFocus();
                                                //Toast.makeText(MainActivity.this,"You are in End",Toast.LENGTH_LONG).show();
                                                refPos1.addTextChangedListener(new TextWatcher() {
                                                    @Override
                                                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                    }

                                                    @Override
                                                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                                                        refPos1.requestFocus();
                                                        refPos1.addTextChangedListener(new TextWatcher() {
                                                            @Override
                                                            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                            }

                                                            @Override
                                                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                                                                refPos2.requestFocus();
                                                                refPos2.addTextChangedListener(new TextWatcher() {
                                                                    @Override
                                                                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                                    }

                                                                    @Override
                                                                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                                                                        refPos3.requestFocus();
                                                                        refPos3.addTextChangedListener(new TextWatcher() {
                                                                            @Override
                                                                            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                                            }

                                                                            @Override
                                                                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                                                                                refPos4.requestFocus();
                                                                                refPos4.addTextChangedListener(new TextWatcher() {
                                                                                    @Override
                                                                                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                                                    }

                                                                                    @Override
                                                                                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                                                                                        refPos5.requestFocus();
                                                                                        refPos5.addTextChangedListener(new TextWatcher() {
                                                                                            @Override
                                                                                            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                                                            }

                                                                                            @Override
                                                                                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                                                                                                refPos6.requestFocus();
                                                                                                refPos6.addTextChangedListener(new TextWatcher() {
                                                                                                    @Override
                                                                                                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                                                                    }

                                                                                                    @Override
                                                                                                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                                                                                                        refPos6.requestFocus();
                                                                                                        refPos6.addTextChangedListener(new TextWatcher() {
                                                                                                            @Override
                                                                                                            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                                                                            }

                                                                                                            @Override
                                                                                                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                                                                                                                refPos5.requestFocus();
                                                                                                            }

                                                                                                            @Override
                                                                                                            public void afterTextChanged(Editable editable) {

                                                                                                            }
                                                                                                        });

                                                                                                    }

                                                                                                    @Override
                                                                                                    public void afterTextChanged(Editable editable) {

                                                                                                    }
                                                                                                });
                                                                                            }

                                                                                            @Override
                                                                                            public void afterTextChanged(Editable editable) {

                                                                                            }
                                                                                        });
                                                                                    }

                                                                                    @Override
                                                                                    public void afterTextChanged(Editable editable) {

                                                                                    }
                                                                                });

                                                                            }

                                                                            @Override
                                                                            public void afterTextChanged(Editable editable) {

                                                                            }
                                                                        });
                                                                    }

                                                                    @Override
                                                                    public void afterTextChanged(Editable editable) {

                                                                    }
                                                                });
                                                            }

                                                            @Override
                                                            public void afterTextChanged(Editable editable) {

                                                            }
                                                        });
                                                    }

                                                    @Override
                                                    public void afterTextChanged(Editable editable) {

                                                    }
                                                });
                                            }

                                            @Override
                                            public void afterTextChanged(Editable editable) {

                                            }
                                        });
                                    }

                                    @Override
                                    public void afterTextChanged(Editable editable) {

                                    }
                                });
                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {

                    }
                });
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}
