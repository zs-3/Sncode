package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzdx extends com.google.android.gms.internal.drive.zzl {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveApi.MetadataBufferResult> zzdx;

    public zzdx(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveApi.MetadataBufferResult> r1) {
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
    public final void zza(com.google.android.gms.internal.drive.zzfv r5) throws android.os.RemoteException {
            r4 = this;
            com.google.android.gms.drive.MetadataBuffer r0 = new com.google.android.gms.drive.MetadataBuffer
            com.google.android.gms.common.data.DataHolder r5 = r5.zzij
            r0.<init>(r5)
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder<com.google.android.gms.drive.DriveApi$MetadataBufferResult> r5 = r4.zzdx
            com.google.android.gms.internal.drive.zzaq r1 = new com.google.android.gms.internal.drive.zzaq
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            r3 = 0
            r1.<init>(r2, r0, r3)
            r5.setResult(r1)
            return
    }
}
