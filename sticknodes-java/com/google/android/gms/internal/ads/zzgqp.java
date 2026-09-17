package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgqp {
    private final java.util.Map zza;
    private final com.google.android.gms.internal.ads.zzgqn zzb;
    private final java.lang.Class zzc;
    private final com.google.android.gms.internal.ads.zzgot zzd;

    /* synthetic */ zzgqp(java.util.Map r1, java.util.List r2, com.google.android.gms.internal.ads.zzgqn r3, com.google.android.gms.internal.ads.zzgot r4, java.lang.Class r5, com.google.android.gms.internal.ads.zzgqo r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            r0.zzc = r5
            r0.zzd = r4
            return
    }

    public static com.google.android.gms.internal.ads.zzgql zzb(java.lang.Class r2) {
            com.google.android.gms.internal.ads.zzgql r0 = new com.google.android.gms.internal.ads.zzgql
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgot zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgot r0 = r1.zzd
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgqn zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgqn r0 = r1.zzb
            return r0
    }

    public final java.lang.Class zzd() {
            r1 = this;
            java.lang.Class r0 = r1.zzc
            return r0
    }

    public final java.util.Collection zze() {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.util.Collection r0 = r0.values()
            return r0
    }

    public final java.util.List zzf(byte[] r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            com.google.android.gms.internal.ads.zzgyx r2 = com.google.android.gms.internal.ads.zzgyx.zzb(r2)
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto Lf
            return r2
        Lf:
            java.util.List r2 = java.util.Collections.emptyList()
            return r2
    }

    public final boolean zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgot r0 = r1.zzd
            java.util.Map r0 = r0.zza()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }
}
