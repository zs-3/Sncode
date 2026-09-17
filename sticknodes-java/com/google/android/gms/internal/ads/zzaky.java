package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaky implements com.google.android.gms.internal.ads.zzaeh {
    private final com.google.android.gms.internal.ads.zzaeh zza;
    private final com.google.android.gms.internal.ads.zzakt zzb;
    private final com.google.android.gms.internal.ads.zzek zzc;
    private int zzd;
    private int zze;
    private byte[] zzf;
    private com.google.android.gms.internal.ads.zzakv zzg;
    private com.google.android.gms.internal.ads.zzaf zzh;

    public zzaky(com.google.android.gms.internal.ads.zzaeh r1, com.google.android.gms.internal.ads.zzakt r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r1 = 0
            r0.zzd = r1
            r0.zze = r1
            byte[] r1 = com.google.android.gms.internal.ads.zzeu.zzf
            r0.zzf = r1
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            r1.<init>()
            r0.zzc = r1
            return
    }

    private final void zzb(int r5) {
            r4 = this;
            byte[] r0 = r4.zzf
            int r0 = r0.length
            int r1 = r4.zze
            int r0 = r0 - r1
            if (r0 < r5) goto L9
            return
        L9:
            int r0 = r4.zzd
            int r1 = r1 - r0
            int r0 = r1 + r1
            int r5 = r5 + r1
            int r5 = java.lang.Math.max(r0, r5)
            byte[] r0 = r4.zzf
            int r2 = r0.length
            if (r5 > r2) goto L1a
            r5 = r0
            goto L1c
        L1a:
            byte[] r5 = new byte[r5]
        L1c:
            int r2 = r4.zzd
            r3 = 0
            java.lang.System.arraycopy(r0, r2, r5, r3, r1)
            r4.zzd = r3
            r4.zze = r1
            r4.zzf = r5
            return
    }

    final /* synthetic */ void zza(long r10, int r12, com.google.android.gms.internal.ads.zzakn r13) {
            r9 = this;
            com.google.android.gms.internal.ads.zzaf r0 = r9.zzh
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            com.google.android.gms.internal.ads.zzgax r0 = r13.zza
            long r1 = r13.zzc
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.size()
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L2a
            java.lang.Object r4 = r0.next()
            com.google.android.gms.internal.ads.zzdb r4 = (com.google.android.gms.internal.ads.zzdb) r4
            android.os.Bundle r4 = r4.zza()
            r3.add(r4)
            goto L16
        L2a:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r4 = "c"
            r0.putParcelableArrayList(r4, r3)
            java.lang.String r3 = "d"
            r0.putLong(r3, r1)
            android.os.Parcel r1 = android.os.Parcel.obtain()
            r1.writeBundle(r0)
            byte[] r0 = r1.marshall()
            r1.recycle()
            com.google.android.gms.internal.ads.zzek r1 = r9.zzc
            int r6 = r0.length
            r1.zzJ(r0, r6)
            com.google.android.gms.internal.ads.zzaeh r0 = r9.zza
            com.google.android.gms.internal.ads.zzek r1 = r9.zzc
            r0.zzq(r1, r6)
            long r0 = r13.zzb
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L73
            com.google.android.gms.internal.ads.zzaf r13 = r9.zzh
            long r0 = r13.zzs
            int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r13 != 0) goto L6e
            r13 = 1
            goto L6f
        L6e:
            r13 = 0
        L6f:
            com.google.android.gms.internal.ads.zzdi.zzf(r13)
            goto L7f
        L73:
            com.google.android.gms.internal.ads.zzaf r13 = r9.zzh
            long r2 = r13.zzs
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 != 0) goto L7d
            long r10 = r10 + r0
            goto L7f
        L7d:
            long r10 = r0 + r2
        L7f:
            r3 = r10
            com.google.android.gms.internal.ads.zzaeh r2 = r9.zza
            r7 = 0
            r8 = 0
            r5 = r12
            r2.zzs(r3, r5, r6, r7, r8)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final /* synthetic */ int zzf(com.google.android.gms.internal.ads.zzp r1, int r2, boolean r3) {
            r0 = this;
            int r1 = com.google.android.gms.internal.ads.zzaef.zza(r0, r1, r2, r3)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final int zzg(com.google.android.gms.internal.ads.zzp r2, int r3, boolean r4, int r5) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzakv r5 = r1.zzg
            if (r5 != 0) goto Lc
            com.google.android.gms.internal.ads.zzaeh r5 = r1.zza
            r0 = 0
            int r2 = r5.zzg(r2, r3, r4, r0)
            return r2
        Lc:
            r1.zzb(r3)
            byte[] r5 = r1.zzf
            int r0 = r1.zze
            int r2 = r2.zza(r5, r0, r3)
            r3 = -1
            if (r2 != r3) goto L23
            if (r4 == 0) goto L1d
            return r3
        L1d:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
        L23:
            int r3 = r1.zze
            int r3 = r3 + r2
            r1.zze = r3
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzl(com.google.android.gms.internal.ads.zzaf r5) {
            r4 = this;
            java.lang.String r0 = r5.zzn
            java.util.Objects.requireNonNull(r0)
            int r0 = com.google.android.gms.internal.ads.zzbn.zzb(r0)
            r1 = 3
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            com.google.android.gms.internal.ads.zzaf r0 = r4.zzh
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L2e
            r4.zzh = r5
            com.google.android.gms.internal.ads.zzakt r0 = r4.zzb
            boolean r0 = r0.zzc(r5)
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzakt r0 = r4.zzb
            com.google.android.gms.internal.ads.zzakv r0 = r0.zzb(r5)
            goto L2c
        L2b:
            r0 = 0
        L2c:
            r4.zzg = r0
        L2e:
            com.google.android.gms.internal.ads.zzakv r0 = r4.zzg
            if (r0 != 0) goto L38
            com.google.android.gms.internal.ads.zzaeh r0 = r4.zza
            r0.zzl(r5)
            return
        L38:
            com.google.android.gms.internal.ads.zzaeh r0 = r4.zza
            com.google.android.gms.internal.ads.zzad r1 = r5.zzb()
            java.lang.String r2 = "application/x-media3-cues"
            r1.zzZ(r2)
            java.lang.String r2 = r5.zzn
            r1.zzA(r2)
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1.zzad(r2)
            com.google.android.gms.internal.ads.zzakt r2 = r4.zzb
            int r5 = r2.zza(r5)
            r1.zzE(r5)
            com.google.android.gms.internal.ads.zzaf r5 = r1.zzaf()
            r0.zzl(r5)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final /* synthetic */ void zzq(com.google.android.gms.internal.ads.zzek r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzaef.zzb(r0, r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzr(com.google.android.gms.internal.ads.zzek r2, int r3, int r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzakv r0 = r1.zzg
            if (r0 != 0) goto La
            com.google.android.gms.internal.ads.zzaeh r0 = r1.zza
            r0.zzr(r2, r3, r4)
            return
        La:
            r1.zzb(r3)
            byte[] r4 = r1.zzf
            int r0 = r1.zze
            r2.zzH(r4, r0, r3)
            int r2 = r1.zze
            int r2 = r2 + r3
            r1.zze = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzs(long r9, int r11, int r12, int r13, com.google.android.gms.internal.ads.zzaeg r14) {
            r8 = this;
            com.google.android.gms.internal.ads.zzakv r0 = r8.zzg
            if (r0 != 0) goto Lf
            com.google.android.gms.internal.ads.zzaeh r1 = r8.zza
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.zzs(r2, r4, r5, r6, r7)
            return
        Lf:
            r0 = 0
            if (r14 != 0) goto L14
            r14 = 1
            goto L15
        L14:
            r14 = 0
        L15:
            java.lang.String r1 = "DRM on subtitles is not supported"
            com.google.android.gms.internal.ads.zzdi.zze(r14, r1)
            int r14 = r8.zze
            int r14 = r14 - r13
            int r14 = r14 - r12
            com.google.android.gms.internal.ads.zzakv r1 = r8.zzg
            byte[] r2 = r8.zzf
            com.google.android.gms.internal.ads.zzaku r5 = com.google.android.gms.internal.ads.zzaku.zza()
            com.google.android.gms.internal.ads.zzakx r6 = new com.google.android.gms.internal.ads.zzakx
            r6.<init>(r8, r9, r11)
            r3 = r14
            r4 = r12
            r1.zza(r2, r3, r4, r5, r6)
            int r14 = r14 + r12
            r8.zzd = r14
            int r9 = r8.zze
            if (r14 != r9) goto L3b
            r8.zzd = r0
            r8.zze = r0
        L3b:
            return
    }
}
