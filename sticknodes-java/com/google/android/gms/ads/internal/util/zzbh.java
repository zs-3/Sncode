package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbh {
    private final java.lang.String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    /* synthetic */ zzbh(com.google.android.gms.ads.internal.util.zzbf r3, com.google.android.gms.ads.internal.util.zzbg r4) {
            r2 = this;
            r2.<init>()
            java.util.List r4 = com.google.android.gms.ads.internal.util.zzbf.zzc(r3)
            int r4 = r4.size()
            java.util.List r0 = com.google.android.gms.ads.internal.util.zzbf.zze(r3)
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r2.zza = r0
            java.util.List r0 = com.google.android.gms.ads.internal.util.zzbf.zzc(r3)
            double[] r0 = zzc(r0)
            r2.zzb = r0
            java.util.List r3 = com.google.android.gms.ads.internal.util.zzbf.zzd(r3)
            double[] r3 = zzc(r3)
            r2.zzc = r3
            int[] r3 = new int[r4]
            r2.zzd = r3
            r3 = 0
            r2.zze = r3
            return
    }

    private static final double[] zzc(java.util.List r5) {
            int r0 = r5.size()
            double[] r1 = new double[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L18
            java.lang.Object r3 = r5.get(r2)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L7
        L18:
            return r1
    }

    public final java.util.List zza() {
            r17 = this;
            r0 = r17
            java.lang.String[] r1 = r0.zza
            java.util.ArrayList r2 = new java.util.ArrayList
            int r1 = r1.length
            r2.<init>(r1)
            r1 = 0
        Lb:
            java.lang.String[] r3 = r0.zza
            int r4 = r3.length
            if (r1 >= r4) goto L37
            com.google.android.gms.ads.internal.util.zzbe r4 = new com.google.android.gms.ads.internal.util.zzbe
            r6 = r3[r1]
            double[] r3 = r0.zzc
            double[] r5 = r0.zzb
            int[] r7 = r0.zzd
            r8 = r3[r1]
            r10 = r5[r1]
            r13 = r7[r1]
            double r14 = (double) r13
            int r3 = r0.zze
            r16 = r1
            double r0 = (double) r3
            double r0 = r14 / r0
            r5 = r4
            r7 = r8
            r9 = r10
            r11 = r0
            r5.<init>(r6, r7, r9, r11, r13)
            r2.add(r4)
            int r1 = r16 + 1
            r0 = r17
            goto Lb
        L37:
            return r2
    }

    public final void zzb(double r7) {
            r6 = this;
            int r0 = r6.zze
            int r0 = r0 + 1
            r6.zze = r0
            r0 = 0
        L7:
            double[] r1 = r6.zzc
            int r2 = r1.length
            if (r0 >= r2) goto L2a
            r2 = r1[r0]
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 > 0) goto L22
            double[] r1 = r6.zzb
            r4 = r1[r0]
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L22
            int[] r1 = r6.zzd
            r4 = r1[r0]
            int r4 = r4 + 1
            r1[r0] = r4
        L22:
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L27
            goto L2a
        L27:
            int r0 = r0 + 1
            goto L7
        L2a:
            return
    }
}
