package se.juneday.systemetappbasic;

            import android.content.Intent;
            import android.support.v7.app.AppCompatActivity;
            import android.os.Bundle;
            import android.view.View;
            import android.widget.Button;
            import android.widget.CheckBox;

public class Age extends AppCompatActivity {

    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        b = findViewById(R.id.button);
        b.setOnClickListener(view -> {
            Intent i = new Intent(Age.this, MainActivity.class);
            startActivity(i);
        });

    }
}
