package lilash.sightwords;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SightWords extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sight_words);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_sight_words, menu);
        return true;
    }
}
