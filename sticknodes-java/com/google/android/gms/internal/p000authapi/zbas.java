package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class zbas {
    private static final java.security.SecureRandom zba = null;

    static {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            com.google.android.gms.internal.p000authapi.zbas.zba = r0
            return
    }

    public static java.lang.String zba() {
            r0 = 16
            byte[] r0 = new byte[r0]
            java.security.SecureRandom r1 = com.google.android.gms.internal.p000authapi.zbas.zba
            r1.nextBytes(r0)
            r1 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            return r0
    }
}
