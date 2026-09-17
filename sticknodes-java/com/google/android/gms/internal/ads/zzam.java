package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzam {
    private java.lang.String zza;
    private android.net.Uri zzb;
    private final com.google.android.gms.internal.ads.zzan zzc;
    private final java.util.List zzd;
    private final com.google.android.gms.internal.ads.zzgax zze;
    private final com.google.android.gms.internal.ads.zzat zzf;
    private final com.google.android.gms.internal.ads.zzaz zzg;

    public zzam() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzan r0 = new com.google.android.gms.internal.ads.zzan
            r0.<init>()
            r1.zzc = r0
            com.google.android.gms.internal.ads.zzgax.zzn()
            java.util.List r0 = java.util.Collections.emptyList()
            r1.zzd = r0
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzn()
            r1.zze = r0
            com.google.android.gms.internal.ads.zzat r0 = new com.google.android.gms.internal.ads.zzat
            r0.<init>()
            r1.zzf = r0
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza
            r1.zzg = r0
            return
    }

    public final com.google.android.gms.internal.ads.zzam zza(java.lang.String r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzam zzb(android.net.Uri r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbc zzc() {
            r23 = this;
            r0 = r23
            android.net.Uri r2 = r0.zzb
            r13 = 0
            if (r2 == 0) goto L1f
            java.util.List r6 = r0.zzd
            com.google.android.gms.internal.ads.zzgax r8 = r0.zze
            com.google.android.gms.internal.ads.zzax r14 = new com.google.android.gms.internal.ads.zzax
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            r18 = r14
            goto L21
        L1f:
            r18 = r13
        L21:
            com.google.android.gms.internal.ads.zzbc r1 = new com.google.android.gms.internal.ads.zzbc
            java.lang.String r2 = r0.zza
            if (r2 != 0) goto L29
            java.lang.String r2 = ""
        L29:
            r16 = r2
            com.google.android.gms.internal.ads.zzan r2 = r0.zzc
            com.google.android.gms.internal.ads.zzar r3 = new com.google.android.gms.internal.ads.zzar
            r3.<init>(r2, r13)
            com.google.android.gms.internal.ads.zzat r2 = r0.zzf
            com.google.android.gms.internal.ads.zzav r4 = new com.google.android.gms.internal.ads.zzav
            r4.<init>(r2, r13)
            com.google.android.gms.internal.ads.zzaz r2 = r0.zzg
            com.google.android.gms.internal.ads.zzbh r20 = com.google.android.gms.internal.ads.zzbh.zza
            r22 = 0
            r15 = r1
            r17 = r3
            r19 = r4
            r21 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            return r1
    }
}
