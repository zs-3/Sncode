package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzbn extends com.google.android.gms.internal.drive.zzdp implements com.google.android.gms.drive.DriveFile {
    public zzbn(com.google.android.gms.drive.DriveId r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.drive.DriveFile
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.DriveContentsResult> open(com.google.android.gms.common.api.GoogleApiClient r2, int r3, com.google.android.gms.drive.DriveFile.DownloadProgressListener r4) {
            r1 = this;
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            if (r3 == r0) goto L15
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r3 == r0) goto L15
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 != r0) goto Ld
            goto L15
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid mode provided."
            r2.<init>(r3)
            throw r2
        L15:
            if (r4 != 0) goto L19
            r4 = 0
            goto L23
        L19:
            com.google.android.gms.internal.drive.zzbp r0 = new com.google.android.gms.internal.drive.zzbp
            com.google.android.gms.common.api.internal.ListenerHolder r4 = r2.registerListener(r4)
            r0.<init>(r4)
            r4 = r0
        L23:
            com.google.android.gms.internal.drive.zzbo r0 = new com.google.android.gms.internal.drive.zzbo
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }
}
