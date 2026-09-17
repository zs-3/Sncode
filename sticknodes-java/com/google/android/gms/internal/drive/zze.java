package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zze implements com.google.android.gms.drive.events.zzk {
    private final com.google.android.gms.drive.events.zzm zzcv;
    private final long zzcw;
    private final long zzcx;

    public zze(com.google.android.gms.internal.drive.zzh r3) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.drive.zzf r0 = new com.google.android.gms.internal.drive.zzf
            r0.<init>(r3)
            r2.zzcv = r0
            long r0 = r3.zzcw
            r2.zzcw = r0
            long r0 = r3.zzcx
            r2.zzcx = r0
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L2d
            java.lang.Class r1 = r8.getClass()
            java.lang.Class<com.google.android.gms.internal.drive.zze> r2 = com.google.android.gms.internal.drive.zze.class
            if (r1 == r2) goto Lc
            goto L2d
        Lc:
            r1 = 1
            if (r8 != r7) goto L10
            return r1
        L10:
            com.google.android.gms.internal.drive.zze r8 = (com.google.android.gms.internal.drive.zze) r8
            com.google.android.gms.drive.events.zzm r2 = r7.zzcv
            com.google.android.gms.drive.events.zzm r3 = r8.zzcv
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L2d
            long r2 = r7.zzcw
            long r4 = r8.zzcw
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L2d
            long r2 = r7.zzcx
            long r4 = r8.zzcx
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L2d
            return r1
        L2d:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r1 = r3.zzcx
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            long r1 = r3.zzcw
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            long r1 = r3.zzcx
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.google.android.gms.drive.events.zzm r2 = r4.zzcv
            java.lang.String r2 = r2.toString()
            r3 = 0
            r1[r3] = r2
            long r2 = r4.zzcw
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            long r2 = r4.zzcx
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "FileTransferProgress[FileTransferState: %s, BytesTransferred: %d, TotalBytes: %d]"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }
}
