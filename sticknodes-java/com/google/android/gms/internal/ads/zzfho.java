package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfho {
    private final com.google.android.gms.internal.ads.zzfgh zza;
    private final com.google.android.gms.internal.ads.zzfgk zzb;
    private final com.google.android.gms.internal.ads.zzeey zzc;
    private final com.google.android.gms.internal.ads.zzfng zzd;
    private final com.google.android.gms.internal.ads.zzfma zze;
    private final com.google.android.gms.internal.ads.zzcop zzf;

    public zzfho(com.google.android.gms.internal.ads.zzeey r1, com.google.android.gms.internal.ads.zzfng r2, com.google.android.gms.internal.ads.zzfgh r3, com.google.android.gms.internal.ads.zzfgk r4, com.google.android.gms.internal.ads.zzcop r5, com.google.android.gms.internal.ads.zzfma r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r3
            r0.zzb = r4
            r0.zzc = r1
            r0.zzd = r2
            r0.zzf = r5
            r0.zze = r6
            return
    }

    public final void zza(java.util.List r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L15
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 2
            r2.zzb(r0, r1)
            goto L4
        L15:
            return
    }

    public final void zzb(java.lang.String r8, int r9) {
            r7 = this;
            com.google.android.gms.internal.ads.zzfgh r0 = r7.zza
            boolean r0 = r0.zzai
            if (r0 != 0) goto Le
            com.google.android.gms.internal.ads.zzfng r9 = r7.zzd
            com.google.android.gms.internal.ads.zzfma r0 = r7.zze
            r9.zzc(r8, r0)
            return
        Le:
            com.google.android.gms.internal.ads.zzefa r0 = new com.google.android.gms.internal.ads.zzefa
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()
            long r2 = r1.currentTimeMillis()
            com.google.android.gms.internal.ads.zzfgk r1 = r7.zzb
            java.lang.String r4 = r1.zzb
            r1 = r0
            r5 = r8
            r6 = r9
            r1.<init>(r2, r4, r5, r6)
            com.google.android.gms.internal.ads.zzeey r8 = r7.zzc
            r8.zzd(r0)
            return
    }

    public final void zzc(java.util.List r4, int r5) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzjG
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L33
            boolean r1 = com.google.android.gms.internal.ads.zzcop.zzj(r0)
            if (r1 == 0) goto L33
            com.google.android.gms.internal.ads.zzcop r1 = r3.zzf
            java.util.Random r2 = com.google.android.gms.ads.internal.client.zzbc.zze()
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0, r2)
            goto L37
        L33:
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
        L37:
            com.google.android.gms.internal.ads.zzfhn r1 = new com.google.android.gms.internal.ads.zzfhn
            r1.<init>(r3, r5)
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r1, r2)
            goto L4
        L42:
            return
    }
}
