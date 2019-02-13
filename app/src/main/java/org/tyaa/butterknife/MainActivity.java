package org.tyaa.butterknife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

//Примеры:
//http://startandroid.ru/ru/blog/470-butter-knife.html

//Задание:
//добавить в представление список из строк ФИО,
// а также невидимый контейнер с полями ввода для редактирования выбранного объекта ФИО.
//Блок редактирования должен отобразиться только после выбора пункта для редактирования,
// и снова скрываться после сохранения изменений (при нажатии на кнопку Сохранить в блоке).
//При выполнении максимально использовать ButterKnife

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.title)
    TextView textViewTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        textViewTitle.setText("Hi!");
    }

    @OnClick(R.id.goToSecondScreenButton)
    void goToSecondScreenClick() {

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
