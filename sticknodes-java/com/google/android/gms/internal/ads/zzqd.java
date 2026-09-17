package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzqd extends com.google.android.gms.internal.ads.zzcu {
    private int[] zzd;
    private int[] zze;

    zzqd() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zze(java.nio.ByteBuffer r8) {
            r7 = this;
            int[] r0 = r7.zze
            java.util.Objects.requireNonNull(r0)
            int r1 = r8.position()
            int r2 = r8.limit()
            int r3 = r2 - r1
            com.google.android.gms.internal.ads.zzcr r4 = r7.zzb
            int r4 = r4.zze
            int r3 = r3 / r4
            com.google.android.gms.internal.ads.zzcr r4 = r7.zzc
            int r4 = r4.zze
            int r3 = r3 * r4
            java.nio.ByteBuffer r3 = r7.zzj(r3)
        L1e:
            if (r1 >= r2) goto L38
            int r4 = r0.length
            r5 = 0
        L22:
            if (r5 >= r4) goto L32
            r6 = r0[r5]
            int r6 = r6 + r6
            int r6 = r6 + r1
            short r6 = r8.getShort(r6)
            r3.putShort(r6)
            int r5 = r5 + 1
            goto L22
        L32:
            com.google.android.gms.internal.ads.zzcr r4 = r7.zzb
            int r4 = r4.zze
            int r1 = r1 + r4
            goto L1e
        L38:
            r8.position(r2)
            r3.flip()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final com.google.android.gms.internal.ads.zzcr zzi(com.google.android.gms.internal.ads.zzcr r10) throws com.google.android.gms.internal.ads.zzcs {
            r9 = this;
            int[] r0 = r9.zzd
            if (r0 != 0) goto L7
            com.google.android.gms.internal.ads.zzcr r10 = com.google.android.gms.internal.ads.zzcr.zza
            return r10
        L7:
            int r1 = r10.zzd
            java.lang.String r2 = "Unhandled input format:"
            r3 = 2
            if (r1 != r3) goto L3e
            int r1 = r10.zzc
            int r4 = r0.length
            r5 = 1
            r6 = 0
            if (r1 == r4) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            r4 = 0
        L19:
            int r7 = r0.length
            if (r4 >= r7) goto L31
            r7 = r0[r4]
            int r8 = r10.zzc
            if (r7 >= r8) goto L2b
            if (r7 == r4) goto L26
            r7 = 1
            goto L27
        L26:
            r7 = 0
        L27:
            r1 = r1 | r7
            int r4 = r4 + 1
            goto L19
        L2b:
            com.google.android.gms.internal.ads.zzcs r0 = new com.google.android.gms.internal.ads.zzcs
            r0.<init>(r2, r10)
            throw r0
        L31:
            if (r1 == 0) goto L3b
            com.google.android.gms.internal.ads.zzcr r0 = new com.google.android.gms.internal.ads.zzcr
            int r10 = r10.zzb
            r0.<init>(r10, r7, r3)
            goto L3d
        L3b:
            com.google.android.gms.internal.ads.zzcr r0 = com.google.android.gms.internal.ads.zzcr.zza
        L3d:
            return r0
        L3e:
            com.google.android.gms.internal.ads.zzcs r0 = new com.google.android.gms.internal.ads.zzcs
            r0.<init>(r2, r10)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    protected final void zzk() {
            r1 = this;
            int[] r0 = r1.zzd
            r1.zze = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    protected final void zzm() {
            r1 = this;
            r0 = 0
            r1.zze = r0
            r1.zzd = r0
            return
    }

    public final void zzo(int[] r1) {
            r0 = this;
            r0.zzd = r1
            return
    }
}
