package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public abstract class zzbz extends com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse {
    public zzbz() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final byte[] toByteArray() {
            r3 = this;
            java.lang.String r0 = r3.toString()     // Catch: java.io.UnsupportedEncodingException -> Lb
            java.lang.String r1 = "UTF-8"
            byte[] r0 = r0.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> Lb
            return r0
        Lb:
            r0 = move-exception
            java.lang.String r1 = "AUTH"
            java.lang.String r2 = "Error serializing object."
            android.util.Log.e(r1, r2, r0)
            r0 = 0
            return r0
    }
}
