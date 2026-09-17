package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcr {
    public static final com.google.android.gms.internal.ads.zzcr zza = null;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    static {
            com.google.android.gms.internal.ads.zzcr r0 = new com.google.android.gms.internal.ads.zzcr
            r1 = -1
            r0.<init>(r1, r1, r1)
            com.google.android.gms.internal.ads.zzcr.zza = r0
            return
    }

    public zzcr(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            boolean r1 = com.google.android.gms.internal.ads.zzeu.zzI(r3)
            if (r1 == 0) goto L16
            int r1 = com.google.android.gms.internal.ads.zzeu.zzj(r3)
            int r1 = r1 * r2
            goto L17
        L16:
            r1 = -1
        L17:
            r0.zze = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzcr
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzcr r5 = (com.google.android.gms.internal.ads.zzcr) r5
            int r1 = r4.zzb
            int r3 = r5.zzb
            if (r1 != r3) goto L1f
            int r1 = r4.zzc
            int r3 = r5.zzc
            if (r1 != r3) goto L1f
            int r1 = r4.zzd
            int r5 = r5.zzd
            if (r1 != r5) goto L1f
            return r0
        L1f:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.zzb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.zzc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.zzd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AudioFormat[sampleRate="
            r0.append(r1)
            int r1 = r2.zzb
            r0.append(r1)
            java.lang.String r1 = ", channelCount="
            r0.append(r1)
            int r1 = r2.zzc
            r0.append(r1)
            java.lang.String r1 = ", encoding="
            r0.append(r1)
            int r1 = r2.zzd
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
