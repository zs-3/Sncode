package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfhi {
    public static com.google.android.gms.ads.internal.client.zzs zza(android.content.Context r4, java.util.List r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r5.next()
            com.google.android.gms.internal.ads.zzfgi r1 = (com.google.android.gms.internal.ads.zzfgi) r1
            boolean r2 = r1.zzc
            if (r2 == 0) goto L1f
            com.google.android.gms.ads.AdSize r1 = com.google.android.gms.ads.AdSize.FLUID
            r0.add(r1)
            goto L9
        L1f:
            com.google.android.gms.ads.AdSize r2 = new com.google.android.gms.ads.AdSize
            int r3 = r1.zza
            int r1 = r1.zzb
            r2.<init>(r3, r1)
            r0.add(r2)
            goto L9
        L2c:
            int r5 = r0.size()
            com.google.android.gms.ads.AdSize[] r5 = new com.google.android.gms.ads.AdSize[r5]
            java.lang.Object[] r5 = r0.toArray(r5)
            com.google.android.gms.ads.AdSize[] r5 = (com.google.android.gms.ads.AdSize[]) r5
            com.google.android.gms.ads.internal.client.zzs r0 = new com.google.android.gms.ads.internal.client.zzs
            r0.<init>(r4, r5)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzfgi zzb(com.google.android.gms.ads.internal.client.zzs r3) {
            boolean r0 = r3.zzi
            r1 = 0
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.ads.zzfgi r3 = new com.google.android.gms.internal.ads.zzfgi
            r0 = -3
            r2 = 1
            r3.<init>(r0, r1, r2)
            return r3
        Ld:
            int r0 = r3.zze
            int r3 = r3.zzb
            com.google.android.gms.internal.ads.zzfgi r2 = new com.google.android.gms.internal.ads.zzfgi
            r2.<init>(r0, r3, r1)
            return r2
    }
}
