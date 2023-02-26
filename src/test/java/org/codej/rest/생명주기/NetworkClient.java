package org.codej.rest.생명주기;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NetworkClient  {

    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출 , url = " + url);

    }
    public void setUrl(String url) {
        this.url = url;
    }

    //서비스 시작시 호출
    public void connect(){
        System.out.println("connect: "+ url);
    }

    public void call(String call) {
        System.out.println("call : " + url + " message  : "+call);
    }

    //서비스 종료시 호출
    public void disConnect(){
        System.out.println("close " + url);
    }

    public void init() throws Exception {
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메시지");
    }

    public void close() throws Exception {
        System.out.println("NetworkClient.close");
        disConnect();
    }
}
