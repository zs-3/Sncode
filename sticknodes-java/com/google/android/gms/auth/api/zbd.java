package com.google.android.gms.auth.api;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class zbd implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    public static final com.google.android.gms.auth.api.zbd zba = null;
    private final java.lang.String zbb;
    private final boolean zbc;
    private final java.lang.String zbd;

    static {
            com.google.android.gms.auth.api.zbc r0 = new com.google.android.gms.auth.api.zbc
            r0.<init>()
            com.google.android.gms.auth.api.zbd r1 = new com.google.android.gms.auth.api.zbd
            r1.<init>(r0)
            com.google.android.gms.auth.api.zbd.zba = r1
            return
    }

    public zbd(com.google.android.gms.auth.api.zbc r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zbb = r0
            java.lang.Boolean r0 = r2.zba
            boolean r0 = r0.booleanValue()
            r1.zbc = r0
            java.lang.String r2 = r2.zbb
            r1.zbd = r2
            return
    }

    static /* bridge */ /* synthetic */ java.lang.String zbb(com.google.android.gms.auth.api.zbd r0) {
            java.lang.String r0 = r0.zbb
            r0 = 0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zbc(com.google.android.gms.auth.api.zbd r0) {
            java.lang.String r0 = r0.zbd
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zbd(com.google.android.gms.auth.api.zbd r0) {
            boolean r0 = r0.zbc
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.auth.api.zbd
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.auth.api.zbd r5 = (com.google.android.gms.auth.api.zbd) r5
            java.lang.String r1 = r5.zbb
            r1 = 0
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r1)
            if (r1 == 0) goto L26
            boolean r1 = r4.zbc
            boolean r3 = r5.zbc
            if (r1 != r3) goto L26
            java.lang.String r1 = r4.zbd
            java.lang.String r5 = r5.zbd
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r1, r5)
            if (r5 == 0) goto L26
            return r0
        L26:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 0
            r0[r1] = r2
            boolean r1 = r3.zbc
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.zbd
            r2 = 2
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public final android.os.Bundle zba() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "consumer_package"
            r2 = 0
            r0.putString(r1, r2)
            boolean r1 = r3.zbc
            java.lang.String r2 = "force_save_dialog"
            r0.putBoolean(r2, r1)
            java.lang.String r1 = r3.zbd
            java.lang.String r2 = "log_session_id"
            r0.putString(r2, r1)
            return r0
    }
}
