package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzaq implements com.google.android.gms.drive.DriveApi.MetadataBufferResult {
    private final com.google.android.gms.common.api.Status zzdy;
    private final com.google.android.gms.drive.MetadataBuffer zzdz;
    private final boolean zzea;

    public zzaq(com.google.android.gms.common.api.Status r1, com.google.android.gms.drive.MetadataBuffer r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.zzdy = r1
            r0.zzdz = r2
            r0.zzea = r3
            return
    }

    @Override // com.google.android.gms.drive.DriveApi.MetadataBufferResult
    public final com.google.android.gms.drive.MetadataBuffer getMetadataBuffer() {
            r1 = this;
            com.google.android.gms.drive.MetadataBuffer r0 = r1.zzdz
            return r0
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zzdy
            return r0
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
            r1 = this;
            com.google.android.gms.drive.MetadataBuffer r0 = r1.zzdz
            if (r0 == 0) goto L7
            r0.release()
        L7:
            return
    }
}
