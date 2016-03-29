package com.tenstep.activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;
import android.widget.RadioGroup;

import com.tenstep.R;

/**
 * Created by Administrator on 2016-1-8 0008.
 */
public class MainActivity extends FragmentActivity {
          // 定义Fragment的对象
          public Fragment[] fragments;
          private HomeFragment homeFragment;
          private MapFragment mapFragment;
          private MyFragment MyFragment;
          private int index;
          // 当前fragment的index

          public int currentTabIndex;
          private RadioGroup radioGroup;

          public void onCreate(Bundle savedInstanceState) {
               super.onCreate(savedInstanceState);

               this.requestWindowFeature(Window.FEATURE_NO_TITLE);
               setContentView(R.layout.bottom);
              homeFragment = new HomeFragment();
              mapFragment = new MapFragment();
              MyFragment = new MyFragment();
               fragments = new Fragment[] { homeFragment, mapFragment,
                       MyFragment};
               // 添加显示第一个fragment
               getSupportFragmentManager().beginTransaction()
                       .add(R.id.mainContent, homeFragment).show(homeFragment)
                       .commit();
               currentTabIndex = 0;

               radioGroup = (RadioGroup) this.findViewById(R.id.main_tab_group);
               radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                         // TODO Auto-generated method stub
                         switch (checkedId) {
                              case R.id.home:// 首页
                                   index = 0;
                                   break;
                              case R.id.map:// 地图
                                   index = 1;
                                   break;
                              case R.id.my:// 我的
                                   index = 2;
                                   break;


                              default:
                                   break;
                         }
                         if (currentTabIndex != index) {
                              FragmentTransaction trx = getSupportFragmentManager()
                                      .beginTransaction();
                              trx.hide(fragments[currentTabIndex]);

                              if (!fragments[index].isAdded()) {
                                   trx.add(R.id.mainContent, fragments[index]);
                              }
                              trx.show(fragments[index]).commit();

                         }
                         // 把当前tab设为选中状态
                         currentTabIndex = index;
                    }
               });


          }
}
