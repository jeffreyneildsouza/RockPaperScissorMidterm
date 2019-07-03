package com.example.rockpaperscissormidterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Spinner user;
    String user_choice, computer_choice;
    TextView FirstName, LastName;
    Button button_play,button_reset;
    TextView computer;
    String id, first_Name, last_name;
    String result[] = new String[5];
    int user_score, comp_score;
    DatabaseReference dbGame;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_play = findViewById(R.id.btnPlay);
        button_reset = findViewById(R.id.btnReset);
        user  = findViewById(R.id.Spinner_user);
        computer = findViewById(R.id.txtComputer);
        FirstName = findViewById(R.id.txtFirstName);
        LastName = findViewById(R.id.txtLastName);

        first_Name = FirstName.getText().toString();
        last_name = LastName.getText().toString();

        dbGame = FirebaseDatabase.getInstance().getReference("Game");


        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                user_choice = user.getSelectedItem().toString();

                Random r = new Random();

                int comp_choice_number = r.nextInt(3);

                if (comp_choice_number == 0){
                    computer_choice = "Rock";
                    computer.setText("Rock");
                } else


                if (comp_choice_number == 1){
                    computer_choice = "Paper";
                    computer.setText("Paper");
                } else

                if (comp_choice_number ==2){
                    computer_choice = "Scissor";
                    computer.setText("Scissor");
                }




                if(computer_choice == user_choice) {
                    result [0] = first_Name;
                    result [1] = last_name;
                    result [2] = user_choice;
                    result [3] = computer_choice;
                    result [4] = "Draw";

                }

                else if(user_choice == "Rock" && computer_choice == "Scissor") {

                    user_score++;

                    result [0] = first_Name;
                    result [1] = last_name;
                    result [2] = user_choice;
                    result [3] = computer_choice;
                    result [4] = "User";

                }

                else if(user_choice == "Rock" && computer_choice == "Paper") {

                    comp_score++;

                    result [0] = first_Name;
                    result [1] = last_name;
                    result [2] = user_choice;
                    result [3] = computer_choice;
                    result [4] = "Computer";

                }
                else if(user_choice == "Scissor" && computer_choice == "Paper") {

                    user_score++;

                    result [0] = first_Name;
                    result [1] = last_name;
                    result [2] = user_choice;
                    result [3] = computer_choice;
                    result [4] = "User";

                }

                else if(user_choice == "Scissor" && computer_choice == "Rock") {

                    comp_score++;

                    result [0] = first_Name;
                    result [1] = last_name;
                    result [2] = user_choice;
                    result [3] = computer_choice;
                    result [4] = "Computer";

                }

                else if(user_choice == "Paper" && computer_choice == "Rock") {

                    user_score++;

                    result [0] = first_Name;
                    result [1] = last_name;
                    result [2] = user_choice;
                    result [3] = computer_choice;
                    result [4] = "User";


                }
                else if(user_choice == "Paper" && computer_choice == "Scissor") {

                    comp_score++;

                    result [0] = first_Name;
                    result [1] = last_name;
                    result [2] = user_choice;
                    result [3] = computer_choice;
                    result [4] = "Computer";


                }
                else{
                    result [0] = "Blank";

                    result [1] = "Blank";
                    result [2] = "Blank";
                    result [3] = "Blank";
                    result [4] = "Blank";
                }


                Toast.makeText(MainActivity.this, result[4], Toast.LENGTH_LONG).show();



                id = dbGame.push().getKey();

                Game g = new Game(id, result[0], result[1], result[2], result[3], result[4]);

                dbGame.child(id).setValue(g);
            }

        });

        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        });


    }

}
