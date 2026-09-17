package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class zbb {
    private java.lang.String zba;

    private zbb() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ zbb(com.google.android.gms.auth.api.identity.zba r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static final com.google.android.gms.auth.api.identity.zbb zbc(com.google.android.gms.auth.api.identity.zbc r1) {
            java.lang.String r1 = r1.zbb()
            com.google.android.gms.auth.api.identity.zbb r0 = new com.google.android.gms.auth.api.identity.zbb
            r0.<init>()
            if (r1 == 0) goto L11
            java.lang.String r1 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            r0.zba = r1
        L11:
            return r0
    }

    public final com.google.android.gms.auth.api.identity.zbb zba(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            r0.zba = r1
            return r0
    }

    public final com.google.android.gms.auth.api.identity.zbc zbb() {
            r2 = this;
            com.google.android.gms.auth.api.identity.zbc r0 = new com.google.android.gms.auth.api.identity.zbc
            java.lang.String r1 = r2.zba
            r0.<init>(r1)
            return r0
    }
}
