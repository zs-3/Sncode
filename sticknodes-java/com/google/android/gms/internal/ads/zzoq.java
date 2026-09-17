package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzoq {
    public static final com.google.android.gms.internal.ads.zzoq zza = null;
    public final int zzb;
    public final int zzc;
    private final com.google.android.gms.internal.ads.zzgbc zzd;

    static {
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 10
            r2 = 2
            r3 = 33
            if (r0 < r3) goto L29
            com.google.android.gms.internal.ads.zzoq r0 = new com.google.android.gms.internal.ads.zzoq
            com.google.android.gms.internal.ads.zzgbb r3 = new com.google.android.gms.internal.ads.zzgbb
            r3.<init>()
            r4 = 1
        L11:
            if (r4 > r1) goto L21
            int r5 = com.google.android.gms.internal.ads.zzeu.zzh(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.zzf(r5)
            int r4 = r4 + 1
            goto L11
        L21:
            com.google.android.gms.internal.ads.zzgbc r1 = r3.zzi()
            r0.<init>(r2, r1)
            goto L2e
        L29:
            com.google.android.gms.internal.ads.zzoq r0 = new com.google.android.gms.internal.ads.zzoq
            r0.<init>(r2, r1)
        L2e:
            com.google.android.gms.internal.ads.zzoq.zza = r0
            return
    }

    public zzoq(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r1 = 0
            r0.zzd = r1
            return
    }

    public zzoq(int r2, java.util.Set r3) {
            r1 = this;
            r1.<init>()
            r1.zzb = r2
            com.google.android.gms.internal.ads.zzgbc r2 = com.google.android.gms.internal.ads.zzgbc.zzl(r3)
            r1.zzd = r2
            com.google.android.gms.internal.ads.zzgdd r2 = r2.zze()
            r3 = 0
        L10:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = java.lang.Integer.bitCount(r0)
            int r3 = java.lang.Math.max(r3, r0)
            goto L10
        L29:
            r1.zzc = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzoq
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzoq r5 = (com.google.android.gms.internal.ads.zzoq) r5
            int r1 = r4.zzb
            int r3 = r5.zzb
            if (r1 != r3) goto L23
            int r1 = r4.zzc
            int r3 = r5.zzc
            if (r1 != r3) goto L23
            com.google.android.gms.internal.ads.zzgbc r1 = r4.zzd
            com.google.android.gms.internal.ads.zzgbc r5 = r5.zzd
            boolean r5 = java.util.Objects.equals(r1, r5)
            if (r5 == 0) goto L23
            return r0
        L23:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            com.google.android.gms.internal.ads.zzgbc r0 = r3.zzd
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r1 = r3.zzb
            int r2 = r3.zzc
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.internal.ads.zzgbc r0 = r3.zzd
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AudioProfile[format="
            r1.append(r2)
            int r2 = r3.zzb
            r1.append(r2)
            java.lang.String r2 = ", maxChannelCount="
            r1.append(r2)
            int r2 = r3.zzc
            r1.append(r2)
            java.lang.String r2 = ", channelMasks="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public final int zza(int r3, com.google.android.gms.internal.ads.zzh r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzgbc r0 = r2.zzd
            if (r0 == 0) goto L7
            int r3 = r2.zzc
            return r3
        L7:
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 29
            if (r0 < r1) goto L14
            int r0 = r2.zzb
            int r3 = com.google.android.gms.internal.ads.zzoo.zza(r0, r3, r4)
            return r3
        L14:
            int r3 = r2.zzb
            com.google.android.gms.internal.ads.zzgba r4 = com.google.android.gms.internal.ads.zzos.zzb
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r4.getOrDefault(r3, r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.util.Objects.requireNonNull(r3)
            int r3 = r3.intValue()
            return r3
    }

    public final boolean zzb(int r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzgbc r0 = r2.zzd
            r1 = 0
            if (r0 != 0) goto Lc
            int r0 = r2.zzc
            if (r3 > r0) goto Lb
            r3 = 1
            return r3
        Lb:
            return r1
        Lc:
            int r3 = com.google.android.gms.internal.ads.zzeu.zzh(r3)
            if (r3 != 0) goto L13
            return r1
        L13:
            com.google.android.gms.internal.ads.zzgbc r0 = r2.zzd
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r0.contains(r3)
            return r3
    }
}
