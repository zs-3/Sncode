package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
class zzgzq extends com.google.android.gms.internal.ads.zzgzp {
    protected final byte[] zza;

    zzgzq(byte[] r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            java.util.Objects.requireNonNull(r2)
            r1.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzgzs
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r4.zzd()
            r3 = r5
            com.google.android.gms.internal.ads.zzgzs r3 = (com.google.android.gms.internal.ads.zzgzs) r3
            int r3 = r3.zzd()
            if (r1 == r3) goto L18
            return r2
        L18:
            int r1 = r4.zzd()
            if (r1 != 0) goto L1f
            return r0
        L1f:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgzq
            if (r0 == 0) goto L3d
            com.google.android.gms.internal.ads.zzgzq r5 = (com.google.android.gms.internal.ads.zzgzq) r5
            int r0 = r4.zzr()
            int r1 = r5.zzr()
            if (r0 == 0) goto L34
            if (r1 == 0) goto L34
            if (r0 == r1) goto L34
            return r2
        L34:
            int r0 = r4.zzd()
            boolean r5 = r4.zzg(r5, r2, r0)
            return r5
        L3d:
            boolean r5 = r5.equals(r4)
            return r5
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public byte zza(int r2) {
            r1 = this;
            byte[] r0 = r1.zza
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    byte zzb(int r2) {
            r1 = this;
            byte[] r0 = r1.zza
            r2 = r0[r2]
            return r2
    }

    protected int zzc() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public int zzd() {
            r1 = this;
            byte[] r0 = r1.zza
            int r0 = r0.length
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    protected void zze(byte[] r2, int r3, int r4, int r5) {
            r1 = this;
            byte[] r0 = r1.zza
            java.lang.System.arraycopy(r0, r3, r2, r4, r5)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    final boolean zzg(com.google.android.gms.internal.ads.zzgzs r6, int r7, int r8) {
            r5 = this;
            int r0 = r6.zzd()
            if (r8 > r0) goto L6d
            int r0 = r7 + r8
            int r1 = r6.zzd()
            if (r0 > r1) goto L44
            boolean r1 = r6 instanceof com.google.android.gms.internal.ads.zzgzq
            r2 = 0
            if (r1 == 0) goto L37
            com.google.android.gms.internal.ads.zzgzq r6 = (com.google.android.gms.internal.ads.zzgzq) r6
            byte[] r0 = r5.zza
            byte[] r1 = r6.zza
            int r3 = r5.zzc()
            int r3 = r3 + r8
            int r8 = r5.zzc()
            int r6 = r6.zzc()
            int r6 = r6 + r7
        L27:
            if (r8 >= r3) goto L35
            r7 = r0[r8]
            r4 = r1[r6]
            if (r7 == r4) goto L30
            return r2
        L30:
            int r8 = r8 + 1
            int r6 = r6 + 1
            goto L27
        L35:
            r6 = 1
            return r6
        L37:
            com.google.android.gms.internal.ads.zzgzs r6 = r6.zzk(r7, r0)
            com.google.android.gms.internal.ads.zzgzs r7 = r5.zzk(r2, r8)
            boolean r6 = r6.equals(r7)
            return r6
        L44:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r6 = r6.zzd()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Ran off end of other: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = ", "
            r1.append(r7)
            r1.append(r8)
            r1.append(r7)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L6d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            int r7 = r5.zzd()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Length too large: "
            r0.append(r1)
            r0.append(r8)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    protected final int zzi(int r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.zzc()
            int r0 = r0 + r3
            byte[] r3 = r1.zza
            int r2 = com.google.android.gms.internal.ads.zzhbr.zzb(r2, r3, r0, r4)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    protected final int zzj(int r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.zzc()
            int r0 = r0 + r3
            int r4 = r4 + r0
            byte[] r3 = r1.zza
            int r2 = com.google.android.gms.internal.ads.zzhek.zzf(r2, r3, r0, r4)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final com.google.android.gms.internal.ads.zzgzs zzk(int r4, int r5) {
            r3 = this;
            int r0 = r3.zzd()
            int r5 = com.google.android.gms.internal.ads.zzgzs.zzq(r4, r5, r0)
            if (r5 != 0) goto Ld
            com.google.android.gms.internal.ads.zzgzs r4 = com.google.android.gms.internal.ads.zzgzs.zzb
            return r4
        Ld:
            byte[] r0 = r3.zza
            com.google.android.gms.internal.ads.zzgzm r1 = new com.google.android.gms.internal.ads.zzgzm
            int r2 = r3.zzc()
            int r2 = r2 + r4
            r1.<init>(r0, r2, r5)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final com.google.android.gms.internal.ads.zzhac zzl() {
            r4 = this;
            byte[] r0 = r4.zza
            int r1 = r4.zzc()
            int r2 = r4.zzd()
            r3 = 1
            com.google.android.gms.internal.ads.zzhac r0 = com.google.android.gms.internal.ads.zzhac.zzH(r0, r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    protected final java.lang.String zzm(java.nio.charset.Charset r5) {
            r4 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r4.zza
            int r2 = r4.zzc()
            int r3 = r4.zzd()
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final java.nio.ByteBuffer zzn() {
            r3 = this;
            byte[] r0 = r3.zza
            int r1 = r3.zzc()
            int r2 = r3.zzd()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    final void zzo(com.google.android.gms.internal.ads.zzgzj r4) throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.zza
            int r1 = r3.zzc()
            int r2 = r3.zzd()
            r4.zza(r0, r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final boolean zzp() {
            r3 = this;
            int r0 = r3.zzc()
            int r1 = r3.zzd()
            int r1 = r1 + r0
            byte[] r2 = r3.zza
            boolean r0 = com.google.android.gms.internal.ads.zzhek.zzi(r2, r0, r1)
            return r0
    }
}
