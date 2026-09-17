package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzj {
    final java.util.Map zza;

    public zzj() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            return
    }

    public final void zza(java.lang.String r2, java.util.concurrent.Callable r3) {
            r1 = this;
            java.util.Map r0 = r1.zza
            r0.put(r2, r3)
            return
    }
}
