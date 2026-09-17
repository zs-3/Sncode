package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzax {
    public final android.net.Uri zza;
    public final java.lang.String zzb;
    public final com.google.android.gms.internal.ads.zzas zzc;
    public final com.google.android.gms.internal.ads.zzal zzd;
    public final java.util.List zze;
    public final java.lang.String zzf;
    public final com.google.android.gms.internal.ads.zzgax zzg;
    public final java.lang.Object zzh;
    public final long zzi;

    static {
            r0 = 0
            r1 = 36
            java.lang.Integer.toString(r0, r1)
            r0 = 1
            java.lang.Integer.toString(r0, r1)
            r0 = 2
            java.lang.Integer.toString(r0, r1)
            r0 = 3
            java.lang.Integer.toString(r0, r1)
            r0 = 4
            java.lang.Integer.toString(r0, r1)
            r0 = 5
            java.lang.Integer.toString(r0, r1)
            r0 = 6
            java.lang.Integer.toString(r0, r1)
            r0 = 7
            java.lang.Integer.toString(r0, r1)
            return
    }

    /* synthetic */ zzax(android.net.Uri r1, java.lang.String r2, com.google.android.gms.internal.ads.zzas r3, com.google.android.gms.internal.ads.zzal r4, java.util.List r5, java.lang.String r6, com.google.android.gms.internal.ads.zzgax r7, java.lang.Object r8, long r9, com.google.android.gms.internal.ads.zzaw r11) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            int r1 = com.google.android.gms.internal.ads.zzbn.zza
            r1 = 0
            r0.zzb = r1
            r0.zzc = r1
            r0.zzd = r1
            r0.zze = r5
            r0.zzf = r1
            r0.zzg = r7
            com.google.android.gms.internal.ads.zzgau r2 = new com.google.android.gms.internal.ads.zzgau
            r2.<init>()
            int r3 = r7.size()
            if (r3 > 0) goto L2c
            r2.zzi()
            r0.zzh = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zzi = r1
            return
        L2c:
            r2 = 0
            java.lang.Object r2 = r7.get(r2)
            com.google.android.gms.internal.ads.zzba r2 = (com.google.android.gms.internal.ads.zzba) r2
            throw r1
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.gms.internal.ads.zzax
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzax r6 = (com.google.android.gms.internal.ads.zzax) r6
            android.net.Uri r1 = r5.zza
            android.net.Uri r3 = r6.zza
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3a
            java.util.List r1 = r5.zze
            java.util.List r3 = r6.zze
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3a
            com.google.android.gms.internal.ads.zzgax r1 = r5.zzg
            com.google.android.gms.internal.ads.zzgax r6 = r6.zzg
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L3a
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            boolean r6 = java.util.Objects.equals(r6, r6)
            if (r6 == 0) goto L3a
            return r0
        L3a:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            android.net.Uri r0 = r4.zza
            int r0 = r0.hashCode()
            r1 = 923521(0xe1781, float:1.294129E-39)
            int r0 = r0 * r1
            java.util.List r1 = r4.zze
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 961
            com.google.android.gms.internal.ads.zzgax r1 = r4.zzg
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r0 = (long) r0
            r2 = 31
            long r0 = r0 * r2
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r0 = r0 + r2
            int r1 = (int) r0
            return r1
    }
}
