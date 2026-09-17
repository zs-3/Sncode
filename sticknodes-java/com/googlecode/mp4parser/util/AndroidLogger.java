package com.googlecode.mp4parser.util;

/* loaded from: classes2.dex */
public class AndroidLogger extends com.googlecode.mp4parser.util.Logger {
    private static final java.lang.String TAG = "isoparser";
    java.lang.String name;

    public AndroidLogger(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            return
    }

    @Override // com.googlecode.mp4parser.util.Logger
    public void logDebug(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r2.name
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "isoparser"
            android.util.Log.d(r0, r3)
            return
    }

    @Override // com.googlecode.mp4parser.util.Logger
    public void logError(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r2.name
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "isoparser"
            android.util.Log.e(r0, r3)
            return
    }

    @Override // com.googlecode.mp4parser.util.Logger
    public void logWarn(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r2.name
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "isoparser"
            android.util.Log.w(r0, r3)
            return
    }
}
