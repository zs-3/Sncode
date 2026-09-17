package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
class zzjm extends com.google.android.gms.internal.drive.zzjl {
    protected final byte[] zzny;

    zzjm(byte[] r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.zzny = r1
            return
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.drive.zzjc
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r4.size()
            r3 = r5
            com.google.android.gms.internal.drive.zzjc r3 = (com.google.android.gms.internal.drive.zzjc) r3
            int r3 = r3.size()
            if (r1 == r3) goto L18
            return r2
        L18:
            int r1 = r4.size()
            if (r1 != 0) goto L1f
            return r0
        L1f:
            boolean r0 = r5 instanceof com.google.android.gms.internal.drive.zzjm
            if (r0 == 0) goto L3d
            com.google.android.gms.internal.drive.zzjm r5 = (com.google.android.gms.internal.drive.zzjm) r5
            int r0 = r4.zzbv()
            int r1 = r5.zzbv()
            if (r0 == 0) goto L34
            if (r1 == 0) goto L34
            if (r0 == r1) goto L34
            return r2
        L34:
            int r0 = r4.size()
            boolean r5 = r4.zza(r5, r2, r0)
            return r5
        L3d:
            boolean r5 = r5.equals(r4)
            return r5
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public int size() {
            r1 = this;
            byte[] r0 = r1.zzny
            int r0 = r0.length
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    protected final int zza(int r2, int r3, int r4) {
            r1 = this;
            byte[] r3 = r1.zzny
            int r0 = r1.zzbw()
            int r2 = com.google.android.gms.internal.drive.zzkm.zza(r2, r3, r0, r4)
            return r2
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public final com.google.android.gms.internal.drive.zzjc zza(int r3, int r4) {
            r2 = this;
            int r3 = r2.size()
            r0 = 0
            int r3 = com.google.android.gms.internal.drive.zzjc.zzb(r0, r4, r3)
            if (r3 != 0) goto Le
            com.google.android.gms.internal.drive.zzjc r3 = com.google.android.gms.internal.drive.zzjc.zznq
            return r3
        Le:
            com.google.android.gms.internal.drive.zzjh r4 = new com.google.android.gms.internal.drive.zzjh
            byte[] r0 = r2.zzny
            int r1 = r2.zzbw()
            r4.<init>(r0, r1, r3)
            return r4
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    protected final java.lang.String zza(java.nio.charset.Charset r5) {
            r4 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r4.zzny
            int r2 = r4.zzbw()
            int r3 = r4.size()
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    final void zza(com.google.android.gms.internal.drive.zzjb r4) throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.zzny
            int r1 = r3.zzbw()
            int r2 = r3.size()
            r4.zza(r0, r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzjl
    final boolean zza(com.google.android.gms.internal.drive.zzjc r6, int r7, int r8) {
            r5 = this;
            int r7 = r6.size()
            if (r8 > r7) goto L66
            int r7 = r6.size()
            if (r8 > r7) goto L41
            boolean r7 = r6 instanceof com.google.android.gms.internal.drive.zzjm
            r0 = 0
            if (r7 == 0) goto L34
            com.google.android.gms.internal.drive.zzjm r6 = (com.google.android.gms.internal.drive.zzjm) r6
            byte[] r7 = r5.zzny
            byte[] r1 = r6.zzny
            int r2 = r5.zzbw()
            int r2 = r2 + r8
            int r8 = r5.zzbw()
            int r6 = r6.zzbw()
        L24:
            if (r8 >= r2) goto L32
            r3 = r7[r8]
            r4 = r1[r6]
            if (r3 == r4) goto L2d
            return r0
        L2d:
            int r8 = r8 + 1
            int r6 = r6 + 1
            goto L24
        L32:
            r6 = 1
            return r6
        L34:
            com.google.android.gms.internal.drive.zzjc r6 = r6.zza(r0, r8)
            com.google.android.gms.internal.drive.zzjc r7 = r5.zza(r0, r8)
            boolean r6 = r6.equals(r7)
            return r6
        L41:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            int r6 = r6.size()
            r0 = 59
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Ran off end of other: 0, "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = ", "
            r1.append(r8)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r7.<init>(r6)
            throw r7
        L66:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            int r7 = r5.size()
            r0 = 40
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Length too large: "
            r1.append(r0)
            r1.append(r8)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r6.<init>(r7)
            throw r6
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public final boolean zzbu() {
            r3 = this;
            int r0 = r3.zzbw()
            byte[] r1 = r3.zzny
            int r2 = r3.size()
            int r2 = r2 + r0
            boolean r0 = com.google.android.gms.internal.drive.zznf.zze(r1, r0, r2)
            return r0
    }

    protected int zzbw() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public byte zzs(int r2) {
            r1 = this;
            byte[] r0 = r1.zzny
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    byte zzt(int r2) {
            r1 = this;
            byte[] r0 = r1.zzny
            r2 = r0[r2]
            return r2
    }
}
