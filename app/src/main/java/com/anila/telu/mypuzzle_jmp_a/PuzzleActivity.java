package com.anila.telu.mypuzzle_jmp_a;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PuzzleActivity extends AppCompatActivity {

    Button buttonA, buttonB, buttonC, buttonD, buttonE, buttonF, buttonG, buttonH, buttonI, buttonJ, buttonK, buttonL, buttonM, buttonN, buttonO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle);

        getSupportActionBar().setTitle("Bermain Puzzle Huruf");

        buttonA = (Button)findViewById(R.id.buttonA);
        buttonB = (Button)findViewById(R.id.buttonB);
        buttonC = (Button)findViewById(R.id.buttonC);
        buttonD = (Button)findViewById(R.id.buttonD);
        buttonE = (Button)findViewById(R.id.buttonE);
        buttonF = (Button)findViewById(R.id.buttonF);
        buttonG = (Button)findViewById(R.id.buttonG);
        buttonH = (Button)findViewById(R.id.buttonH);
        buttonI = (Button)findViewById(R.id.buttonI);
        buttonJ = (Button)findViewById(R.id.buttonJ);
        buttonK = (Button)findViewById(R.id.buttonK);
        buttonL = (Button)findViewById(R.id.buttonL);
        buttonM = (Button)findViewById(R.id.buttonM);
        buttonN = (Button)findViewById(R.id.buttonN);
        buttonO = (Button)findViewById(R.id.buttonO);

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PuzzleActivity.this, "Clicked Huruf A", Toast.LENGTH_SHORT).show();
            }
        });
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PuzzleActivity.this, "Clicked Huruf B", Toast.LENGTH_SHORT).show();
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PuzzleActivity.this, "Clicked Huruf C", Toast.LENGTH_SHORT).show();
            }
        });
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PuzzleActivity.this, "Clicked Huruf D", Toast.LENGTH_SHORT).show();
            }
        });
        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PuzzleActivity.this, "Clicked Huruf E", Toast.LENGTH_SHORT).show();
            }
        });
        buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PuzzleActivity.this, "Clicked Huruf F", Toast.LENGTH_SHORT).show();
            }
        });
        buttonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PuzzleActivity.this, "Clicked Huruf G", Toast.LENGTH_SHORT).show();
            }
        });
        buttonH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PuzzleActivity.this, "Clicked Huruf H", Toast.LENGTH_SHORT).show();
            }
        });
        buttonI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PuzzleActivity.this, "Clicked Huruf I", Toast.LENGTH_SHORT).show();
            }
        });
        buttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PuzzleActivity.this, "Clicked Huruf J", Toast.LENGTH_SHORT).show();
            }
        });
        buttonK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PuzzleActivity.this, "Clicked Huruf K", Toast.LENGTH_SHORT).show();
            }
        });
        buttonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PuzzleActivity.this, "Clicked Huruf L", Toast.LENGTH_SHORT).show();
            }
        });
        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PuzzleActivity.this, "Clicked Huruf M", Toast.LENGTH_SHORT).show();
            }
        });
        buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PuzzleActivity.this, "Clicked Huruf N", Toast.LENGTH_SHORT).show();
            }
        });
        buttonO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PuzzleActivity.this, "Clicked Huruf O", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_utama, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        if(item.getItemId() == R.id.m_keluar){
            intent = new Intent(this, MainActivity.class);
        }else{
            intent = new Intent(this, PuzzleActivity.class);
        }
        startActivity(intent);
        return true;
    }
}