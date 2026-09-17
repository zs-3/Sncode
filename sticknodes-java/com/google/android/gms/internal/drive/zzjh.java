package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzjh extends com.google.android.gms.internal.drive.zzjm {
    private final int zznv;
    private final int zznw;

    zzjh(byte[] r2, int r3, int r4) {
            r1 = this;
            r1.<init>(r2)
            int r0 = r3 + r4
            int r2 = r2.length
            com.google.android.gms.internal.drive.zzjc.zzb(r3, r0, r2)
            r1.zznv = r3
            r1.zznw = r4
            return
    }

    @Override // com.google.android.gms.internal.drive.zzjm, com.google.android.gms.internal.drive.zzjc
    public final int size() {
            r1 = this;
            int r0 = r1.zznw
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzjm
    protected final int zzbw() {
            r1 = this;
            int r0 = r1.zznv
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzjm, com.google.android.gms.internal.drive.zzjc
    public final byte zzs(int r5) {
            r4 = this;
            int r0 = r4.size()
            int r1 = r5 + 1
            int r1 = r0 - r1
            r1 = r1 | r5
            if (r1 >= 0) goto L47
            if (r5 >= 0) goto L26
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r1 = 22
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Index < 0: "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r0.<init>(r5)
            throw r0
        L26:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r2 = 40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Index > length: "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r5 = ", "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r5 = r3.toString()
            r1.<init>(r5)
            throw r1
        L47:
            byte[] r0 = r4.zzny
            int r1 = r4.zznv
            int r1 = r1 + r5
            r5 = r0[r1]
            return r5
    }

    @Override // com.google.android.gms.internal.drive.zzjm, com.google.android.gms.internal.drive.zzjc
    final byte zzt(int r3) {
            r2 = this;
            byte[] r0 = r2.zzny
            int r1 = r2.zznv
            int r1 = r1 + r3
            r3 = r0[r1]
            return r3
    }
}
