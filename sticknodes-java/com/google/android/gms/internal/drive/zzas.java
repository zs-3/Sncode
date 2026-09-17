package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzas extends com.google.android.gms.internal.drive.zzl {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveApi.MetadataBufferResult> zzdx;

    zzas(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveApi.MetadataBufferResult> r1) {
            r0 = this;
            r0.<init>()
            r0.zzdx = r1
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.common.api.Status r5) throws android.os.RemoteException {
            r4 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder<com.google.android.gms.drive.DriveApi$MetadataBufferResult> r0 = r4.zzdx
            com.google.android.gms.internal.drive.zzaq r1 = new com.google.android.gms.internal.drive.zzaq
            r2 = 0
            r3 = 0
            r1.<init>(r5, r2, r3)
            r0.setResult(r1)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzft r5) throws android.os.RemoteException {
            r4 = this;
            com.google.android.gms.drive.MetadataBuffer r0 = new com.google.android.gms.drive.MetadataBuffer
            com.google.android.gms.common.data.DataHolder r1 = r5.zzii
            r0.<init>(r1)
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder<com.google.android.gms.drive.DriveApi$MetadataBufferResult> r1 = r4.zzdx
            com.google.android.gms.internal.drive.zzaq r2 = new com.google.android.gms.internal.drive.zzaq
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            boolean r5 = r5.zzea
            r2.<init>(r3, r0, r5)
            r1.setResult(r2)
            return
    }
}
