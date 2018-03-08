package name.oho.simplejokeactivity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SimpleJokeActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE = "name.oho.simplejokeactivity.extra.JOKE";

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_joke);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mTextView = findViewById(R.id.textView);

        if (getIntent().hasExtra(EXTRA_JOKE)) {
            mTextView.setText(getIntent().getStringExtra(EXTRA_JOKE));
        }
    }

}
