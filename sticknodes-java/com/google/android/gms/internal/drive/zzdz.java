package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzdz implements com.google.android.gms.drive.DriveResource.MetadataResult {
    private final com.google.android.gms.common.api.Status zzdy;
    private final com.google.android.gms.drive.Metadata zzgr;

    public zzdz(com.google.android.gms.common.api.Status r1, com.google.android.gms.drive.Metadata r2) {
            r0 = this;
            r0.<init>()
            r0.zzdy = r1
            r0.zzgr = r2
            return
    }

    @Override // com.google.android.gms.drive.DriveResource.MetadataResult
    public final com.google.android.gms.drive.Metadata getMetadata() {
            r1 = this;
            com.google.android.gms.drive.Metadata r0 = r1.zzgr
            return r0
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zzdy
            return r0
    }
}
