package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzrm extends com.google.android.gms.internal.ads.zzcu {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh;
    private int zzi;
    private long zzj;

    public zzrm() {
            r1 = this;
            r1.<init>()
            byte[] r0 = com.google.android.gms.internal.ads.zzeu.zzf
            r1.zzh = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcu, com.google.android.gms.internal.ads.zzct
    public final java.nio.ByteBuffer zzb() {
            r4 = this;
            boolean r0 = super.zzh()
            if (r0 == 0) goto L1c
            int r0 = r4.zzi
            if (r0 <= 0) goto L1c
            java.nio.ByteBuffer r0 = r4.zzj(r0)
            byte[] r1 = r4.zzh
            int r2 = r4.zzi
            r3 = 0
            java.nio.ByteBuffer r0 = r0.put(r1, r3, r2)
            r0.flip()
            r4.zzi = r3
        L1c:
            java.nio.ByteBuffer r0 = super.zzb()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zze(java.nio.ByteBuffer r9) {
            r8 = this;
            int r0 = r9.position()
            int r1 = r9.limit()
            int r2 = r1 - r0
            if (r2 != 0) goto Ld
            goto L79
        Ld:
            int r3 = r8.zzg
            int r3 = java.lang.Math.min(r2, r3)
            long r4 = r8.zzj
            com.google.android.gms.internal.ads.zzcr r6 = r8.zzb
            int r6 = r6.zze
            int r6 = r3 / r6
            long r6 = (long) r6
            long r4 = r4 + r6
            r8.zzj = r4
            int r4 = r8.zzg
            int r4 = r4 - r3
            r8.zzg = r4
            int r0 = r0 + r3
            r9.position(r0)
            int r0 = r8.zzg
            if (r0 > 0) goto L79
            int r2 = r2 - r3
            int r0 = r8.zzi
            int r0 = r0 + r2
            byte[] r3 = r8.zzh
            int r3 = r3.length
            int r0 = r0 - r3
            java.nio.ByteBuffer r3 = r8.zzj(r0)
            int r4 = r8.zzi
            int r4 = java.lang.Math.min(r0, r4)
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            byte[] r6 = r8.zzh
            r3.put(r6, r5, r4)
            int r0 = r0 - r4
            int r0 = java.lang.Math.min(r0, r2)
            int r0 = java.lang.Math.max(r5, r0)
            int r6 = r9.position()
            int r6 = r6 + r0
            r9.limit(r6)
            r3.put(r9)
            r9.limit(r1)
            int r2 = r2 - r0
            int r0 = r8.zzi
            int r0 = r0 - r4
            r8.zzi = r0
            byte[] r1 = r8.zzh
            java.lang.System.arraycopy(r1, r4, r1, r5, r0)
            byte[] r0 = r8.zzh
            int r1 = r8.zzi
            r9.get(r0, r1, r2)
            int r9 = r8.zzi
            int r9 = r9 + r2
            r8.zzi = r9
            r3.flip()
        L79:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcu, com.google.android.gms.internal.ads.zzct
    public final boolean zzh() {
            r1 = this;
            boolean r0 = super.zzh()
            if (r0 == 0) goto Lc
            int r0 = r1.zzi
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final com.google.android.gms.internal.ads.zzcr zzi(com.google.android.gms.internal.ads.zzcr r3) throws com.google.android.gms.internal.ads.zzcs {
            r2 = this;
            int r0 = r3.zzd
            r1 = 2
            if (r0 != r1) goto L14
            r0 = 1
            r2.zzf = r0
            int r0 = r2.zzd
            if (r0 != 0) goto L13
            int r0 = r2.zze
            if (r0 == 0) goto L11
            goto L13
        L11:
            com.google.android.gms.internal.ads.zzcr r3 = com.google.android.gms.internal.ads.zzcr.zza
        L13:
            return r3
        L14:
            com.google.android.gms.internal.ads.zzcs r0 = new com.google.android.gms.internal.ads.zzcs
            java.lang.String r1 = "Unhandled input format:"
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    protected final void zzk() {
            r3 = this;
            boolean r0 = r3.zzf
            r1 = 0
            if (r0 == 0) goto L19
            r3.zzf = r1
            int r0 = r3.zze
            com.google.android.gms.internal.ads.zzcr r2 = r3.zzb
            int r2 = r2.zze
            int r0 = r0 * r2
            byte[] r0 = new byte[r0]
            r3.zzh = r0
            int r0 = r3.zzd
            int r0 = r0 * r2
            r3.zzg = r0
        L19:
            r3.zzi = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    protected final void zzl() {
            r5 = this;
            boolean r0 = r5.zzf
            if (r0 == 0) goto L16
            int r0 = r5.zzi
            if (r0 <= 0) goto L13
            long r1 = r5.zzj
            com.google.android.gms.internal.ads.zzcr r3 = r5.zzb
            int r3 = r3.zze
            int r0 = r0 / r3
            long r3 = (long) r0
            long r1 = r1 + r3
            r5.zzj = r1
        L13:
            r0 = 0
            r5.zzi = r0
        L16:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    protected final void zzm() {
            r1 = this;
            byte[] r0 = com.google.android.gms.internal.ads.zzeu.zzf
            r1.zzh = r0
            return
    }

    public final long zzo() {
            r2 = this;
            long r0 = r2.zzj
            return r0
    }

    public final void zzp() {
            r2 = this;
            r0 = 0
            r2.zzj = r0
            return
    }

    public final void zzq(int r1, int r2) {
            r0 = this;
            r0.zzd = r1
            r0.zze = r2
            return
    }
}
