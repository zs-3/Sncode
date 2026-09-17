package com.google.firebase.crashlytics.internal.network;

/* loaded from: classes2.dex */
public class HttpResponse {
    private final java.lang.String body;
    private final int code;

    public HttpResponse(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.code = r1
            r0.body = r2
            return
    }

    public java.lang.String body() {
            r1 = this;
            java.lang.String r0 = r1.body
            return r0
    }

    public int code() {
            r1 = this;
            int r0 = r1.code
            return r0
    }
}
