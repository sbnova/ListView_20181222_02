package com.cyj.listview_20181222_02.datas;

public class Member {
//    사용자가 갖는 고유 정보
    private String name;
    private String address;

//    차후에 이런식으로 활용 연습
    private String profileImageUrl;

//    각 변수의 값을 조회 or 세팅 getter & setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }
}
