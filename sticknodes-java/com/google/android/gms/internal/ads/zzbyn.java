package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbyn {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    zzbyn(com.google.android.gms.common.util.Clock r1, com.google.android.gms.ads.internal.util.zzg r2, com.google.android.gms.internal.ads.zzbyz r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            return
    }

    public final void zza(int r6, long r7) {
            r5 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzax
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L13
            return
        L13:
            com.google.android.gms.ads.internal.util.zzg r0 = r5.zza
            long r0 = r0.zzf()
            long r0 = r7 - r0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L27
            java.lang.String r6 = "Receiving npa decision in the past, ignoring."
            com.google.android.gms.ads.internal.util.zze.zza(r6)
            return
        L27:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzay
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L45
            com.google.android.gms.ads.internal.util.zzg r6 = r5.zza
            r0 = -1
            r6.zzM(r0)
            com.google.android.gms.ads.internal.util.zzg r6 = r5.zza
            r6.zzN(r7)
            return
        L45:
            com.google.android.gms.ads.internal.util.zzg r0 = r5.zza
            r0.zzM(r6)
            com.google.android.gms.ads.internal.util.zzg r6 = r5.zza
            r6.zzN(r7)
            return
    }
}
