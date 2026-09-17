package com.google.android.gms.auth.api;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class zbc {
    protected java.lang.Boolean zba;
    protected java.lang.String zbb;

    public zbc() {
            r1 = this;
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.zba = r0
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    public zbc(com.google.android.gms.auth.api.zbd r2) {
            r1 = this;
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.zba = r0
            com.google.android.gms.auth.api.zbd.zbb(r2)
            boolean r0 = com.google.android.gms.auth.api.zbd.zbd(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.zba = r0
            java.lang.String r2 = com.google.android.gms.auth.api.zbd.zbc(r2)
            r1.zbb = r2
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    public final com.google.android.gms.auth.api.zbc zba(java.lang.String r1) {
            r0 = this;
            r0.zbb = r1
            return r0
    }
}
