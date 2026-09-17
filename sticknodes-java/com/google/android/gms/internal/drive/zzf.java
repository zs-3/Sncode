package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzf {
    private final int status;
    private final int zzct;
    private final com.google.android.gms.drive.DriveId zzk;

    public zzf(com.google.android.gms.internal.drive.zzh r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.drive.DriveId r0 = r2.zzk
            r1.zzk = r0
            int r0 = r2.zzct
            r1.zzct = r0
            int r2 = r2.status
            r1.status = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L29
            java.lang.Class r1 = r5.getClass()
            java.lang.Class<com.google.android.gms.internal.drive.zzf> r2 = com.google.android.gms.internal.drive.zzf.class
            if (r1 == r2) goto Lc
            goto L29
        Lc:
            r1 = 1
            if (r5 != r4) goto L10
            return r1
        L10:
            com.google.android.gms.internal.drive.zzf r5 = (com.google.android.gms.internal.drive.zzf) r5
            com.google.android.gms.drive.DriveId r2 = r4.zzk
            com.google.android.gms.drive.DriveId r3 = r5.zzk
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L29
            int r2 = r4.zzct
            int r3 = r5.zzct
            if (r2 != r3) goto L29
            int r2 = r4.status
            int r5 = r5.status
            if (r2 != r5) goto L29
            return r1
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.drive.DriveId r1 = r3.zzk
            r2 = 0
            r0[r2] = r1
            int r1 = r3.zzct
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.zzct
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            com.google.android.gms.drive.DriveId r1 = r3.zzk
            r2 = 1
            r0[r2] = r1
            int r1 = r3.status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "FileTransferState[TransferType: %d, DriveId: %s, status: %d]"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
