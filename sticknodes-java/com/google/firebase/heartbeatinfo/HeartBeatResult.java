package com.google.firebase.heartbeatinfo;

@com.google.auto.value.AutoValue
/* loaded from: classes2.dex */
public abstract class HeartBeatResult {
    public HeartBeatResult() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.firebase.heartbeatinfo.HeartBeatResult create(java.lang.String r1, java.util.List<java.lang.String> r2) {
            com.google.firebase.heartbeatinfo.AutoValue_HeartBeatResult r0 = new com.google.firebase.heartbeatinfo.AutoValue_HeartBeatResult
            r0.<init>(r1, r2)
            return r0
    }

    public abstract java.util.List<java.lang.String> getUsedDates();

    public abstract java.lang.String getUserAgent();
}
