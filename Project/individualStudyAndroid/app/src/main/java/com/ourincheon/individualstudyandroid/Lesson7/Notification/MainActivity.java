package com.ourincheon.individualstudyandroid.Lesson7.Notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ourincheon.individualstudyandroid.R;

/**
 * Created by mijeong on 2017. 12. 11..
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static final int NOTIFICATION_ID = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson7_notification_main_activity);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        NotificationManager nm = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        Notification.Builder builder = new Notification.Builder(MainActivity.this);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setTicker("알림 메시지");
        builder.setWhen(System.currentTimeMillis());

        builder.setContentTitle("알려드립니다.");
        builder.setContentText("이것은 실험적인 알림입니다.");
        builder.setSubText("클릭하면 구글 홈페이지로 이동합니다.");
        builder.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_VIBRATE);
        builder.setContentIntent(pendingIntent);

        nm.notify(NOTIFICATION_ID, builder.build());
    }
}
