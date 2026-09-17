package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzgy extends java.lang.RuntimeException {
    public zzgy(com.google.android.gms.internal.auth.zzfx r1) {
            r0 = this;
            java.lang.String r1 = "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."
            r0.<init>(r1)
            return
    }

    public final com.google.android.gms.internal.auth.zzfb zza() {
            r2 = this;
            com.google.android.gms.internal.auth.zzfb r0 = new com.google.android.gms.internal.auth.zzfb
            java.lang.String r1 = r2.getMessage()
            r0.<init>(r1)
            return r0
    }
}
