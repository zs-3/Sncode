package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgoa {
    final java.util.Map zza;
    final java.util.Map zzb;

    private zzgoa() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzb = r0
            return
    }

    /* synthetic */ zzgoa(com.google.android.gms.internal.ads.zzgnz r1) {
            r0 = this;
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zza = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzb = r1
            return
    }

    public final com.google.android.gms.internal.ads.zzgoa zza(java.lang.Enum r2, java.lang.Object r3) {
            r1 = this;
            java.util.Map r0 = r1.zza
            r0.put(r2, r3)
            java.util.Map r0 = r1.zzb
            r0.put(r3, r2)
            return r1
    }

    public final com.google.android.gms.internal.ads.zzgoc zzb() {
            r4 = this;
            com.google.android.gms.internal.ads.zzgoc r0 = new com.google.android.gms.internal.ads.zzgoc
            java.util.Map r1 = r4.zza
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.util.Map r2 = r4.zzb
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }
}
