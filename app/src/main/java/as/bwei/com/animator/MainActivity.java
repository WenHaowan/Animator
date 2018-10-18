package as.bwei.com.animator;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    /*private Button btnView;*/
    private Button btn_click,btn_click2,btn_click3,btn_click4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*btnView = (Button) findViewById(R.id.btn_view);*/
        btn_click = (Button) findViewById(R.id.btn_click);
        btn_click2 = (Button) findViewById(R.id.btn_click2);
        btn_click3 = (Button) findViewById(R.id.btn_click3);
        btn_click4 = (Button) findViewById(R.id.btn_click4);

        btn_click.setOnClickListener(this);
        btn_click2.setOnClickListener(this);
        btn_click3.setOnClickListener(this);
        btn_click4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            /*case R.id.btn_view:
                toast();
                break;*/
            case R.id.btn_click://平移
                trance();
                break;
            case R.id.btn_click2://旋转
                rotation();
                break;
            case R.id.btn_click3://淡入淡出
                alpha();
                break;
            case R.id.btn_click4://渐变
                argb();
                break;
        }
    }

    /*private void toast() {
        Toast.makeText(this,"---",Toast.LENGTH_SHORT).show();
    }*/


    //平移
    private void trance() {
        ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(btn_click,"translationY",0,500);
        objectAnimator.setDuration(3000);
        objectAnimator.start();
    }
    //旋转
    private void rotation() {
        ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(btn_click2,"rotationY",0,360);
        objectAnimator.setDuration(3000);
        objectAnimator.start();
    }
    //淡入淡出
    private void alpha() {
        ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(btn_click3,"alpha",1,0.5F,0,0.5F,1);
        objectAnimator.setDuration(6000);
        objectAnimator.setRepeatCount(10);
        objectAnimator.start();
    }
    //渐变
    private void argb() {
        ObjectAnimator objectAnimator=ObjectAnimator.ofArgb(btn_click4, "backgroundColor",  0xffff00ff, 0xffffff00, 0xffff00ff);
        objectAnimator.setDuration(6000);
        objectAnimator.setRepeatCount(10);
        objectAnimator.start();
    }
}
