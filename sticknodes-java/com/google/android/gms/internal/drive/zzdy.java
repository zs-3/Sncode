package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzdy extends com.google.android.gms.internal.drive.zzl {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveResource.MetadataResult> zzdx;

    public zzdy(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveResource.MetadataResult> r1) {
            r0 = this;
            r0.<init>()
            r0.zzdx = r1
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.common.api.Status r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder<com.google.android.gms.drive.DriveResource$MetadataResult> r0 = r3.zzdx
            com.google.android.gms.internal.drive.zzdz r1 = new com.google.android.gms.internal.drive.zzdz
            r2 = 0
            r1.<init>(r4, r2)
            r0.setResult(r1)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfy r5) throws android.os.RemoteException {
            r4 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder<com.google.android.gms.drive.DriveResource$MetadataResult> r0 = r4.zzdx
            com.google.android.gms.internal.drive.zzdz r1 = new com.google.android.gms.internal.drive.zzdz
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            com.google.android.gms.internal.drive.zzaa r3 = new com.google.android.gms.internal.drive.zzaa
            com.google.android.gms.drive.metadata.internal.MetadataBundle r5 = r5.zzdn
            r3.<init>(r5)
            r1.<init>(r2, r3)
            r0.setResult(r1)
            return
    }
}
