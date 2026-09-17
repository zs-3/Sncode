package com.google.firebase.crashlytics.internal.network;

/* loaded from: classes2.dex */
public class HttpRequestFactory {
    public HttpRequestFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.google.firebase.crashlytics.internal.network.HttpGetRequest buildHttpGetRequest(java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            r1 = this;
            com.google.firebase.crashlytics.internal.network.HttpGetRequest r0 = new com.google.firebase.crashlytics.internal.network.HttpGetRequest
            r0.<init>(r2, r3)
            return r0
    }
}
