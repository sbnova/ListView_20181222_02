package com.cyj.listview_20181222_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.cyj.listview_20181222_02.adapters.MemberAdapter;
import com.cyj.listview_20181222_02.datas.Member;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends BaseActivity {

    //    수강생 목록을 저장하는데 쓰는 ArrayList 생성
    List<Member> memberList = new ArrayList<Member>();

    ListView memeberListView;
    MemberAdapter memberAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvents();
        setupValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setupValues() {
//        실제 멤버 목록을 채우는 행위
        fillMembers();

        memberAdapter = new MemberAdapter(mContext, memberList);
        memeberListView.setAdapter(memberAdapter);

    }

//        회원 목록을 채우는 용도의 메소드.
//    실제로는 이렇게 타이핑으로 채우지 않음.
//    서버에서 내려주는 데이터를 이용해서 자동으로 membereList.add등을 실행
    void fillMembers() {
        memberList.clear(); //리스트 초기화

        memberList.add(new Member("강소진", "서울시 강남구", "임시"));
        memberList.add(new Member("강윤영", "서울시 강동구", "임시"));
        memberList.add(new Member("김연영", "서울시 강북구", "임시"));
        memberList.add(new Member("도현철", "서울시 강서구", "임시"));
        memberList.add(new Member("오미라", "서울시 관악구", "임시"));
        memberList.add(new Member("정주연", "서울시 광진구", "임시"));
        memberList.add(new Member("이민규", "서울시 구로구", "임시"));
        memberList.add(new Member("정나영", "서울시 금천구", "임시"));
        memberList.add(new Member("최태식", "서울시 노원구", "임시"));
        memberList.add(new Member("변현정", "서울시 도봉구", "임시"));
    }

    @Override
    public void bindViews() {

        memeberListView = findViewById(R.id.memeberListView);
    }
}
