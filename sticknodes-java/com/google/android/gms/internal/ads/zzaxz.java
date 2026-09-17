package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxz extends com.google.android.gms.internal.ads.zzayc {
    private final android.view.View zzh;

    public zzaxz(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13, android.view.View r14) {
            r7 = this;
            java.lang.String r2 = "1eASkBAriCqBxPWd4okyyc+CHCTvdkAuw8U5qBN0KobaC6TQVXZIuItjy1xo8n06"
            java.lang.String r3 = "/3NjDB70kyJmgPDiCMkSHOH5fxmpgd9Ky8mxWyDVFDM="
            r6 = 57
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.zzh = r14
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r8 = this;
            android.view.View r0 = r8.zzh
            if (r0 == 0) goto L91
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdr
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzkC
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            com.google.android.gms.internal.ads.zzawo r2 = r8.zza
            android.content.Context r2 = r2.zzb()
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            java.lang.reflect.Method r3 = r8.zze
            android.view.View r4 = r8.zzh
            r5 = 0
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            r6[r7] = r4
            r4 = 1
            r6[r4] = r2
            r2 = 2
            r6[r2] = r0
            r2 = 3
            r6[r2] = r1
            java.lang.Object r2 = r3.invoke(r5, r6)
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.zzaws r3 = new com.google.android.gms.internal.ads.zzaws
            r3.<init>(r2)
            com.google.android.gms.internal.ads.zzatf r2 = com.google.android.gms.internal.ads.zzatg.zza()
            java.lang.Long r4 = r3.zza
            long r4 = r4.longValue()
            r2.zzb(r4)
            java.lang.Long r4 = r3.zzb
            long r4 = r4.longValue()
            r2.zzd(r4)
            java.lang.Long r4 = r3.zzc
            long r4 = r4.longValue()
            r2.zze(r4)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L77
            java.lang.Long r1 = r3.zze
            long r4 = r1.longValue()
            r2.zzc(r4)
        L77:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L86
            java.lang.Long r0 = r3.zzd
            long r0 = r0.longValue()
            r2.zza(r0)
        L86:
            com.google.android.gms.internal.ads.zzasm r0 = r8.zzd
            com.google.android.gms.internal.ads.zzhbe r1 = r2.zzbn()
            com.google.android.gms.internal.ads.zzatg r1 = (com.google.android.gms.internal.ads.zzatg) r1
            r0.zzY(r1)
        L91:
            return
    }
}
