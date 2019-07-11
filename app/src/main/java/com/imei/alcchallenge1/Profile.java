package com.imei.alcchallenge1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.imei.alcchallenge1.models.User;

public class Profile extends AppCompatActivity {
  @BindView(R.id.name) TextView nameTv;
  @BindView(R.id.phone) TextView phoneTv;
  @BindView(R.id.email) TextView emailTv;
  @BindView(R.id.country) TextView countryTv;
  @BindView(R.id.slack) TextView slackTv;
  @BindView(R.id.track) TextView trackTv;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_profile);
    ButterKnife.bind(this);
    setTitle(R.string.profile);
    try {
      this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
      this.getSupportActionBar().setDisplayShowHomeEnabled(true);
    } catch (Exception e) {

    }
  }

  @Override protected void onStart() {
    super.onStart();
    User user = new User();
    phoneTv.setText(user.getPhone());
    emailTv.setText(user.getEmail());
    countryTv.setText(user.getCountry());
    slackTv.setText(user.getSlack());
    trackTv.setText(user.getTrack());
    nameTv.setText(user.getName());
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // handle arrow click here
    if (item.getItemId() == android.R.id.home) {
      finish(); // close this activity and return to preview activity (if there is any)
    }

    return super.onOptionsItemSelected(item);
  }
}
