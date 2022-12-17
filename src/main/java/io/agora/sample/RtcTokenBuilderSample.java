package io.agora.sample;

import io.agora.media.RtcTokenBuilder;
import io.agora.media.RtcTokenBuilder.Role;

public class RtcTokenBuilderSample {
    static String appId = "68f0953ba507479bb5ee3bcd28b59fae";
    static String appCertificate = "aec99dc4d8694708a1c5b8a3b2e2a624";
    static String channelName = "";
    static int uid = 0;
    static int expirationTimeInSeconds = 3600; 

    public static void main(String[] args) throws Exception {
        RtcTokenBuilder token = new RtcTokenBuilder();
        int timestamp = (int)(System.currentTimeMillis() / 1000 + expirationTimeInSeconds);
        String  result = token.buildTokenWithUid(appId, appCertificate,
       		 channelName, uid, Role.Role_Publisher, timestamp);
        System.out.println(result);
    }
}
