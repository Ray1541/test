package com.jiang.test3_0;

import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*findViewById(R.id.floatingActionButton).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                //Intent resultIntent = new Intent(this, MainActivity.class);
                //TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
                //stackBuilder.addNextIntentWithParentStack(resultIntent);
                //PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);


            }
        });*/
    }
        public boolean onCreateOptionsMenu(Menu menu)
        {
            // TODO: Implement this method
            getMenuInflater().inflate(R.menu.main_menu,menu);

            return super.onCreateOptionsMenu(menu);
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item)
        {
            // TODO: Implement this method
            switch (item.getItemId())
            {
                //打开文件
                /*case R.id.menu_open:
                    selectFile();
                    break;
                //保存
                case  R.id.menu_save:
                    save();
                    break;
                //运行
                case R.id.menu_run:
                    run();
                    break;
                //另存为
                case R.id.menu_save_as:
                    saveAs();
                    break;
                //关闭文件
                case R.id.menu_close_file:
                    closeFile();
                    break;
                //重做
                case R.id.menu_redo:
                    editor.redo();
                    break;
                //撤销
                case R.id.menu_undo:
                    editor.undo();
                    break;
                //设置
                case R.id.menu_setting:
                    preferences();
                    break;
                case R.id.menu_learn:
                    help();
                    break;
                case R.id.menu_recent_file:
                    recent();
                    break;
                case R.id.menu_indent_code:
                    indent();
                    break;
                case R.id.menu_compile_option:
                    compileOption();
                    break;*/
            }
            return super.onOptionsItemSelected(item);

    }
}
