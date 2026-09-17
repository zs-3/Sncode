package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaco implements com.google.android.gms.internal.ads.zzaea {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzaco(int[] r3, long[] r4, long[] r5, long[] r6) {
            r2 = this;
            r2.<init>()
            r2.zzb = r3
            r2.zzc = r4
            r2.zzd = r5
            r2.zze = r6
            int r3 = r3.length
            r2.zza = r3
            if (r3 <= 0) goto L1a
            int r3 = r3 + (-1)
            r4 = r5[r3]
            r0 = r6[r3]
            long r4 = r4 + r0
            r2.zzf = r4
            return
        L1a:
            r3 = 0
            r2.zzf = r3
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            long[] r0 = r6.zzd
            long[] r1 = r6.zze
            long[] r2 = r6.zzc
            int[] r3 = r6.zzb
            java.lang.String r3 = java.util.Arrays.toString(r3)
            java.lang.String r2 = java.util.Arrays.toString(r2)
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "ChunkIndex(length="
            r4.append(r5)
            int r5 = r6.zza
            r4.append(r5)
            java.lang.String r5 = ", sizes="
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = ", offsets="
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = ", timeUs="
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = ", durationsUs="
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = ")"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
            r2 = this;
            long r0 = r2.zzf
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final com.google.android.gms.internal.ads.zzady zzg(long r9) {
            r8 = this;
            long[] r0 = r8.zze
            r1 = 1
            int r2 = com.google.android.gms.internal.ads.zzeu.zzc(r0, r9, r1, r1)
            com.google.android.gms.internal.ads.zzaeb r3 = new com.google.android.gms.internal.ads.zzaeb
            r4 = r0[r2]
            long[] r0 = r8.zzc
            r6 = r0[r2]
            r3.<init>(r4, r6)
            long r4 = r3.zzb
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 >= 0) goto L33
            int r9 = r8.zza
            int r9 = r9 + (-1)
            if (r2 != r9) goto L1f
            goto L33
        L1f:
            long[] r9 = r8.zze
            int r2 = r2 + r1
            long[] r10 = r8.zzc
            com.google.android.gms.internal.ads.zzaeb r0 = new com.google.android.gms.internal.ads.zzaeb
            r4 = r9[r2]
            r9 = r10[r2]
            r0.<init>(r4, r9)
            com.google.android.gms.internal.ads.zzady r9 = new com.google.android.gms.internal.ads.zzady
            r9.<init>(r3, r0)
            return r9
        L33:
            com.google.android.gms.internal.ads.zzady r9 = new com.google.android.gms.internal.ads.zzady
            r9.<init>(r3, r3)
            return r9
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
            r1 = this;
            r0 = 1
            return r0
    }
}
