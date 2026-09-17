package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
enum zzkg extends java.lang.Enum<com.google.android.gms.internal.drive.zzkg> {
    public static final com.google.android.gms.internal.drive.zzkg zzrg = null;
    public static final com.google.android.gms.internal.drive.zzkg zzrh = null;
    public static final com.google.android.gms.internal.drive.zzkg zzri = null;
    public static final com.google.android.gms.internal.drive.zzkg zzrj = null;
    private static final /* synthetic */ com.google.android.gms.internal.drive.zzkg[] zzrl = null;
    private final boolean zzrk;

    static {
            com.google.android.gms.internal.drive.zzkg r0 = new com.google.android.gms.internal.drive.zzkg
            java.lang.String r1 = "SCALAR"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.internal.drive.zzkg.zzrg = r0
            com.google.android.gms.internal.drive.zzkg r1 = new com.google.android.gms.internal.drive.zzkg
            java.lang.String r3 = "VECTOR"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.gms.internal.drive.zzkg.zzrh = r1
            com.google.android.gms.internal.drive.zzkg r3 = new com.google.android.gms.internal.drive.zzkg
            java.lang.String r5 = "PACKED_VECTOR"
            r6 = 2
            r3.<init>(r5, r6, r4)
            com.google.android.gms.internal.drive.zzkg.zzri = r3
            com.google.android.gms.internal.drive.zzkg r5 = new com.google.android.gms.internal.drive.zzkg
            java.lang.String r7 = "MAP"
            r8 = 3
            r5.<init>(r7, r8, r2)
            com.google.android.gms.internal.drive.zzkg.zzrj = r5
            r7 = 4
            com.google.android.gms.internal.drive.zzkg[] r7 = new com.google.android.gms.internal.drive.zzkg[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            com.google.android.gms.internal.drive.zzkg.zzrl = r7
            return
    }

    zzkg(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzrk = r3
            return
    }

    public static com.google.android.gms.internal.drive.zzkg[] values() {
            com.google.android.gms.internal.drive.zzkg[] r0 = com.google.android.gms.internal.drive.zzkg.zzrl
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.drive.zzkg[] r0 = (com.google.android.gms.internal.drive.zzkg[]) r0
            return r0
    }
}
