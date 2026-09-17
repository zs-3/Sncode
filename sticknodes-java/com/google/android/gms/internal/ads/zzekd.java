package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzekd {
    final java.lang.String zza;
    final java.lang.String zzb;
    int zzc;
    long zzd;
    final java.lang.Integer zze;

    zzekd(java.lang.String r1, java.lang.String r2, int r3, long r4, java.lang.Integer r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r6
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.zzc
            long r1 = r5.zzd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r5.zza
            r3.append(r4)
            java.lang.String r4 = "."
            r3.append(r4)
            r3.append(r0)
            r3.append(r4)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = r5.zzb
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L3c
            java.lang.String r1 = r5.zzb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
        L3c:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzbF
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6e
            java.lang.Integer r1 = r5.zze
            if (r1 == 0) goto L6e
            java.lang.String r1 = r5.zzb
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L6e
            java.lang.Integer r1 = r5.zze
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
        L6e:
            return r0
    }
}
