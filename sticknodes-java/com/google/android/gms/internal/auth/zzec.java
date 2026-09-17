package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
class zzec extends com.google.android.gms.internal.auth.zzeb {
    protected final byte[] zza;

    zzec(byte[] r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r9 != r8) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.auth.zzef
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r8.zzd()
            r3 = r9
            com.google.android.gms.internal.auth.zzef r3 = (com.google.android.gms.internal.auth.zzef) r3
            int r3 = r3.zzd()
            if (r1 == r3) goto L18
            return r2
        L18:
            int r1 = r8.zzd()
            if (r1 != 0) goto L1f
            return r0
        L1f:
            boolean r1 = r9 instanceof com.google.android.gms.internal.auth.zzec
            if (r1 == 0) goto L9f
            com.google.android.gms.internal.auth.zzec r9 = (com.google.android.gms.internal.auth.zzec) r9
            int r1 = r8.zzj()
            int r3 = r9.zzj()
            if (r1 == 0) goto L35
            if (r3 == 0) goto L35
            if (r1 != r3) goto L34
            goto L35
        L34:
            return r2
        L35:
            int r1 = r8.zzd()
            int r3 = r9.zzd()
            if (r1 > r3) goto L81
            int r3 = r9.zzd()
            if (r1 > r3) goto L5e
            byte[] r3 = r8.zza
            byte[] r4 = r9.zza
            r9.zzc()
            r9 = 0
            r5 = 0
        L4e:
            if (r9 >= r1) goto L5d
            r6 = r3[r9]
            r7 = r4[r5]
            if (r6 == r7) goto L58
            r0 = 0
            goto L5d
        L58:
            int r9 = r9 + 1
            int r5 = r5 + 1
            goto L4e
        L5d:
            return r0
        L5e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r9 = r9.zzd()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Ran off end of other: 0, "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", "
            r2.append(r1)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r0.<init>(r9)
            throw r0
        L81:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            int r0 = r8.zzd()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Length too large: "
            r2.append(r3)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r9.<init>(r0)
            throw r9
        L9f:
            boolean r9 = r9.equals(r8)
            return r9
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public byte zza(int r2) {
            r1 = this;
            byte[] r0 = r1.zza
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.gms.internal.auth.zzef
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

    @Override // com.google.android.gms.internal.auth.zzef
    public int zzd() {
            r1 = this;
            byte[] r0 = r1.zza
            int r0 = r0.length
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzef
    protected final int zze(int r2, int r3, int r4) {
            r1 = this;
            byte[] r3 = r1.zza
            r0 = 0
            int r2 = com.google.android.gms.internal.auth.zzfa.zzb(r2, r3, r0, r4)
            return r2
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final com.google.android.gms.internal.auth.zzef zzf(int r3, int r4) {
            r2 = this;
            int r3 = r2.zzd()
            r0 = 0
            int r3 = com.google.android.gms.internal.auth.zzef.zzi(r0, r4, r3)
            if (r3 != 0) goto Le
            com.google.android.gms.internal.auth.zzef r3 = com.google.android.gms.internal.auth.zzef.zzb
            return r3
        Le:
            com.google.android.gms.internal.auth.zzdz r4 = new com.google.android.gms.internal.auth.zzdz
            byte[] r1 = r2.zza
            r4.<init>(r1, r0, r3)
            return r4
    }

    @Override // com.google.android.gms.internal.auth.zzef
    protected final java.lang.String zzg(java.nio.charset.Charset r5) {
            r4 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r4.zza
            int r2 = r4.zzd()
            r3 = 0
            r0.<init>(r1, r3, r2, r5)
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final boolean zzh() {
            r3 = this;
            byte[] r0 = r3.zza
            int r1 = r3.zzd()
            r2 = 0
            boolean r0 = com.google.android.gms.internal.auth.zzhn.zzc(r0, r2, r1)
            return r0
    }
}
