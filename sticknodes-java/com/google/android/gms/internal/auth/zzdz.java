package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzdz extends com.google.android.gms.internal.auth.zzec {
    private final int zzc;

    zzdz(byte[] r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            int r1 = r1.length
            r2 = 0
            com.google.android.gms.internal.auth.zzef.zzi(r2, r3, r1)
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte zza(int r5) {
            r4 = this;
            int r0 = r4.zzc
            int r1 = r5 + 1
            int r1 = r0 - r1
            r1 = r1 | r5
            if (r1 >= 0) goto L41
            if (r5 >= 0) goto L22
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index < 0: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L22:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Index > length: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = ", "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
        L41:
            byte[] r0 = r4.zza
            r5 = r0[r5]
            return r5
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    final byte zzb(int r2) {
            r1 = this;
            byte[] r0 = r1.zza
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.gms.internal.auth.zzec
    protected final int zzc() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final int zzd() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }
}
