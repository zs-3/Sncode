package com.google.android.gms.ads.mediation.customevent;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class CustomEventExtras {
    private final java.util.HashMap zza;

    public CustomEventExtras() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            return
    }

    public java.lang.Object getExtra(java.lang.String r2) {
            r1 = this;
            java.util.HashMap r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public void setExtra(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.util.HashMap r0 = r1.zza
            r0.put(r2, r3)
            return
    }
}
