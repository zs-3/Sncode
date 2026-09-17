package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzlo extends com.google.android.gms.internal.ads.zzum {
    private final com.google.android.gms.internal.ads.zzcb zzc;

    zzlo(com.google.android.gms.internal.ads.zzlp r1, com.google.android.gms.internal.ads.zzcc r2) {
            r0 = this;
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzcb r1 = new com.google.android.gms.internal.ads.zzcb
            r1.<init>()
            r0.zzc = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzum, com.google.android.gms.internal.ads.zzcc
    public final com.google.android.gms.internal.ads.zzca zzd(int r12, com.google.android.gms.internal.ads.zzca r13, boolean r14) {
            r11 = this;
            com.google.android.gms.internal.ads.zzcc r0 = r11.zzb
            com.google.android.gms.internal.ads.zzca r12 = r0.zzd(r12, r13, r14)
            int r14 = r12.zzc
            com.google.android.gms.internal.ads.zzcb r0 = r11.zzc
            com.google.android.gms.internal.ads.zzcc r1 = r11.zzb
            r2 = 0
            com.google.android.gms.internal.ads.zzcb r14 = r1.zze(r14, r0, r2)
            boolean r14 = r14.zzb()
            if (r14 == 0) goto L2a
            java.lang.Object r2 = r13.zza
            java.lang.Object r3 = r13.zzb
            int r4 = r13.zzc
            long r5 = r13.zzd
            r7 = 0
            com.google.android.gms.internal.ads.zzb r9 = com.google.android.gms.internal.ads.zzb.zza
            r10 = 1
            r1 = r12
            r1.zzi(r2, r3, r4, r5, r7, r9, r10)
            goto L2d
        L2a:
            r13 = 1
            r12.zzf = r13
        L2d:
            return r12
    }
}
