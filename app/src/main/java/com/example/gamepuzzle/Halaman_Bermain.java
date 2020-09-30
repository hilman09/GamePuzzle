package com.example.gamepuzzle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Halaman_Bermain extends AppCompatActivity {

    private TextView moveCounter;
    private TextView feedbackText;
    private Button[] buttons;
    private boolean bad_move = false;
    private static final Integer[] goal = new Integer[] {0,1,2,3,4,5,6,7,8};
    private ArrayList<Integer> cells = new ArrayList<Integer>();


}
