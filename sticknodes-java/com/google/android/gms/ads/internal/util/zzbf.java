package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbf {
    private final java.util.List zza;
    private final java.util.List zzb;
    private final java.util.List zzc;

    public zzbf() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zza = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzb = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzc = r0
            return
    }

    static /* bridge */ /* synthetic */ java.util.List zzc(com.google.android.gms.ads.internal.util.zzbf r0) {
            java.util.List r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List zzd(com.google.android.gms.ads.internal.util.zzbf r0) {
            java.util.List r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List zze(com.google.android.gms.ads.internal.util.zzbf r0) {
            java.util.List r0 = r0.zza
            return r0
    }

    public final com.google.android.gms.ads.internal.util.zzbf zza(java.lang.String r7, double r8, double r10) {
            r6 = this;
            r0 = 0
        L1:
            java.util.List r1 = r6.zza
            int r1 = r1.size()
            if (r0 >= r1) goto L31
            java.util.List r1 = r6.zzc
            java.lang.Object r1 = r1.get(r0)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            java.util.List r3 = r6.zzb
            java.lang.Object r3 = r3.get(r0)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            int r5 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r5 >= 0) goto L26
            goto L31
        L26:
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 != 0) goto L2e
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 < 0) goto L31
        L2e:
            int r0 = r0 + 1
            goto L1
        L31:
            java.util.List r1 = r6.zza
            r1.add(r0, r7)
            java.util.List r7 = r6.zzc
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r7.add(r0, r8)
            java.util.List r7 = r6.zzb
            java.lang.Double r8 = java.lang.Double.valueOf(r10)
            r7.add(r0, r8)
            return r6
    }

    public final com.google.android.gms.ads.internal.util.zzbh zzb() {
            r2 = this;
            com.google.android.gms.ads.internal.util.zzbh r0 = new com.google.android.gms.ads.internal.util.zzbh
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
